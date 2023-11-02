package com.pzbdownloaders.instabuddy.profile_screen_freature.domain.usecase

import android.util.Log
import com.pzbdownloaders.instabuddy.main_screen.domain.util.GetSearchResults
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllPosts
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.repo.AllPostsRepo
import com.pzbdownloaders.instabuddy.profile_screen_freature.domain.util.ResponseNumbers
import javax.inject.Inject

class AllPostsUseCase @Inject constructor(private val allPostsRepo: AllPostsRepo) {

   // var responseNumber = ResponseNumbers.responseNumberPosts
    var failedToConnect = ""
    suspend fun getAllPosts(url: String): Triple<AllPosts?, String?, String?> {
        val result = allPostsRepo.getAllPosts(url)
        return when (result) {
            is GetSearchResults.Success -> {
                ResponseNumbers.responseNumberPosts += 1
                Log.i("usecase", ResponseNumbers.responseNumberPosts.toString())
                Triple(result.data, "Response 200", ResponseNumbers.responseNumberPosts.toString())
            }
            is GetSearchResults.Error -> {
                Triple(null, result.message, "Nothing")
            }
            is GetSearchResults.SocketTimeOutException -> {
                failedToConnect = "Failed to connect next"
                if (ResponseNumbers.responseNumberPosts == 0) {
                    Triple(null, result.message, ResponseNumbers.responseNumberPosts.toString())
                } else {
                    Triple(null, failedToConnect, ResponseNumbers.responseNumberPosts.toString())
                }
            }
        }
    }

/*    suspend fun getNextPosts(url: String): Pair<AllPosts?, String?> {
        val result = allPostsRepo.getNextPost(url)
        return when (result) {
            is GetSearchResults.Success -> {
                Pair(result.data, "Response 200")
            }
            is GetSearchResults.Error -> {
                Pair(null, result.message)
            }
        }
    }*/
}
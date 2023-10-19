package com.pzbdownloaders.instabuddy.profile_screen_freature.domain.usecase

import android.util.Log
import com.pzbdownloaders.instabuddy.main_screen.domain.util.GetSearchResults
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllPosts
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.repo.AllPostsRepo
import javax.inject.Inject

class AllPostsUseCase @Inject constructor(private val allPostsRepo: AllPostsRepo) {

    var responseNumber = 0
    suspend fun getAllPosts(url: String): Triple<AllPosts?, String?, String?> {
        val result = allPostsRepo.getAllPosts(url)
        return when (result) {
            is GetSearchResults.Success -> {
                responseNumber += 1
                Log.i("usecase", responseNumber.toString())
                Triple(result.data, "Response 200", responseNumber.toString())
            }
            is GetSearchResults.Error -> {
                Triple(null, result.message, "Nothing")
            }
            is GetSearchResults.SocketTimeOutException -> {
                Triple(null,null,null)
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
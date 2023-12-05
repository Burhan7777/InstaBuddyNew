package com.pzbdownloaders.instabuddy.profile_screen_freature.domain.usecase

import android.util.Log
import com.pzbdownloaders.instabuddy.main_screen.domain.util.GetSearchResults
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllPosts
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllPostsRawData
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.RootAllPosts
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.repo.AllPostsRepo
import com.pzbdownloaders.instabuddy.profile_screen_freature.domain.util.ResponseNumbers
import retrofit2.Response
import javax.inject.Inject

class AllPostsUseCase @Inject constructor(private val allPostsRepo: AllPostsRepo) {

    // var responseNumber = ResponseNumbers.responseNumberPosts
    private var failedToConnect = ""
    suspend fun getAllPosts(allPostsRawData: AllPostsRawData): Triple<RootAllPosts?, String?, String?> {
        val result = allPostsRepo.getAllPosts(allPostsRawData)
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
                    ResponseNumbers.loadingFailed = true
                    Triple(null, result.message, ResponseNumbers.responseNumberPosts.toString())
                } else {
                    ResponseNumbers.loadingFailedNextPost = true
                    ResponseNumbers.loadingFailed = false
                    Triple(null, failedToConnect, ResponseNumbers.responseNumberPosts.toString())
                }
            }
        }
    }
}
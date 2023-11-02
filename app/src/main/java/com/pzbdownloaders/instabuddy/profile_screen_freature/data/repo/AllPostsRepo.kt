package com.pzbdownloaders.instabuddy.profile_screen_freature.data.repo

import android.util.Log
import com.pzbdownloaders.instabuddy.main_screen.domain.util.GetSearchResults
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.api.ProfileAPI
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllPosts
import retrofit2.Response
import java.net.SocketTimeoutException
import javax.inject.Inject

class AllPostsRepo @Inject constructor(private val profileAPI: ProfileAPI) {

    suspend fun getAllPosts(url: String): GetSearchResults<AllPosts?> {
        val response : Response<AllPosts>
        try {
             response = profileAPI.getAllPosts(url)
        } catch (exception: SocketTimeoutException) {
            return GetSearchResults.SocketTimeOutException(null, "Failed to connect")
        }
        Log.i("response", response.body().toString())
        return if (response.isSuccessful) {
            Log.i(
                "response123",
                response.body()?.data.toString()
            )
            GetSearchResults.Success(response.body(), null, 0)

        } else {
            GetSearchResults.Error(null, response.code().toString())
        }
    }

    suspend fun getNextPost(url: String): GetSearchResults<AllPosts?> {
        val response = profileAPI.getNextPosts(url)
        Log.i("response", response.body().toString())
        return if (response.isSuccessful) {
            Log.i(
                "response123",
                response.body()?.data.toString()
            )
            GetSearchResults.Success(response.body(), null, 0)

        } else {
            GetSearchResults.Error(null, response.code().toString())
        }
    }
}
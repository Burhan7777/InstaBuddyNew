package com.pzbdownloaders.instabuddy.profile_screen_freature.data.repo

import android.util.Log
import com.pzbdownloaders.instabuddy.main_screen.domain.util.GetSearchResults
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.api.ProfileAPI
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllStories
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.UserId
import javax.inject.Inject

class UserIdRepo @Inject constructor(private val profileAPI: ProfileAPI) {

    suspend fun getUserId(url: String): GetSearchResults<UserId?> {
        val response = profileAPI.getUserId(url)
        Log.i("response", response.body().toString())
        return if (response.isSuccessful) {
            GetSearchResults.Success(response.body(), null, 0)

        } else {
            GetSearchResults.Error(null, response.code().toString())
        }
    }
}
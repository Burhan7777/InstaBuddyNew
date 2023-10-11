package com.pzbdownloaders.instabuddy.profile_screen_freature.data.repo

import android.util.Log
import com.pzbdownloaders.instabuddy.main_screen.domain.util.GetSearchResults
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.api.ProfileAPI
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllPosts
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllReels
import javax.inject.Inject

class AllReelsRepo @Inject constructor(private val profileAPI: ProfileAPI) {


    suspend fun getAllReels(url: String): GetSearchResults<AllReels?> {
        val response = profileAPI.getAllReels(url)
        Log.i("response", response.body().toString())
        return if (response.isSuccessful) {
            GetSearchResults.Success(response.body(), null, 0)

        } else {
            GetSearchResults.Error(null, response.code().toString())
        }
    }

    suspend fun getNextReel(url: String): GetSearchResults<AllReels?> {
        val response = profileAPI.getNextReels(url)
        Log.i("response", response.body().toString())
        return if (response.isSuccessful) {
            GetSearchResults.Success(response.body(), null, 0)
        } else {
            GetSearchResults.Error(null, response.code().toString())
        }
    }
}
package com.pzbdownloaders.instabuddy.profile_screen_freature.data.repo

import android.util.Log
import com.pzbdownloaders.instabuddy.main_screen.domain.util.GetSearchResults
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.api.ProfileAPI
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllReels
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllStories
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllStoriesRawData
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.RootAllStories
import javax.inject.Inject

class AllStoriesRepo @Inject constructor(private val profileAPI: ProfileAPI) {

    suspend fun getAllStories(allStoriesRawData: AllStoriesRawData): GetSearchResults<RootAllStories?> {
        val response = profileAPI.getAllStoriesRocket(allStoriesRawData)
        Log.i("response", response.body().toString())
        return if (response.isSuccessful) {
            GetSearchResults.Success(response.body(), null, 0)

        } else {
            GetSearchResults.Error(null, response.code().toString())
        }
    }
}
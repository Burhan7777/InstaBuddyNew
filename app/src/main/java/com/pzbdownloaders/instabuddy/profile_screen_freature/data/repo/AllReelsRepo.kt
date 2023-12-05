package com.pzbdownloaders.instabuddy.profile_screen_freature.data.repo

import android.util.Log
import com.pzbdownloaders.instabuddy.main_screen.domain.util.GetSearchResults
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.api.ProfileAPI
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllPosts
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllReels
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllReelsRawData
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.RootAllReels
import javax.inject.Inject

class AllReelsRepo @Inject constructor(private val profileAPI: ProfileAPI) {


    suspend fun getAllReels(allReelsRawData: AllReelsRawData): GetSearchResults<RootAllReels?> {
        val response = profileAPI.getAllReelsRocket(allReelsRawData)
        Log.i("response", response.body().toString())
        return if (response.isSuccessful) {
            GetSearchResults.Success(response.body(), null, 0)
        } else {
            Log.i("reelResponse", response.body().toString())
            GetSearchResults.Error(null, response.code().toString())
        }
    }

    /*  suspend fun getNextReel(url: String): GetSearchResults<AllReels?> {
          val response = profileAPI.getNextReels(url)
          Log.i("response", response.body().toString())
          return if (response.isSuccessful) {
              GetSearchResults.Success(response.body(), null, 0)
          } else {
              GetSearchResults.Error(null, response.code().toString())
          }
      }*/
}
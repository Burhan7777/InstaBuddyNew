package com.pzbdownloaders.instabuddy.profile_screen_freature.data.repo

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.google.gson.JsonSyntaxException
import com.pzbdownloaders.instabuddy.main_screen.domain.util.GetSearchResults
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.api.ProfileAPI
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllPosts
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllPostsRawData
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.RootAllPosts
import retrofit2.Response
import java.net.SocketTimeoutException
import javax.inject.Inject

class AllPostsRepo @Inject constructor(
    private val profileAPI: ProfileAPI
) {

    suspend fun getAllPosts(allPostsRawData: AllPostsRawData): GetSearchResults<RootAllPosts?> {
        val response: Response<RootAllPosts>
        try {
            response = profileAPI.getAllPostsRocket(allPostsRawData)
        } catch (exception: SocketTimeoutException) {
            return GetSearchResults.SocketTimeOutException(null, "Failed to connect")
        } catch (exception: JsonSyntaxException) {
            return GetSearchResults.Error(null, "")
        }

        return if (response.isSuccessful) {
            /*   Log.i(
                   "response123",
                   response.body()?.data.toString()
               )*/
            Log.i("response123", response.body().toString())
            GetSearchResults.Success(response.body(), null, 0)

        } else {
            //   Log.i("response123", response.body().toString())
            GetSearchResults.Error(null, response.code().toString())
        }
    }

    /*  suspend fun getNextPost(url: String): GetSearchResults<AllPosts?> {
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
      }*/
}
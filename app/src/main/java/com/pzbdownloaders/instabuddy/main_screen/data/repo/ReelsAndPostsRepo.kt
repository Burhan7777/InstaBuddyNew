package com.pzbdownloaders.instabuddy.main_screen.data.repo

import com.pzbdownloaders.instabuddy.main_screen.data.api.DownloadAPI
import com.pzbdownloaders.instabuddy.main_screen.data.model.Posts
import com.pzbdownloaders.instabuddy.main_screen.data.model.Reels
import com.pzbdownloaders.instabuddy.main_screen.domain.util.GetSearchResults
import javax.inject.Inject

class ReelsAndPostsRepo @Inject constructor(private val downloadAPI: DownloadAPI) {

    suspend fun getPosts(url: String): GetSearchResults<Posts?> {
        val response = downloadAPI.getPost(url)
        return if (response.isSuccessful)
            GetSearchResults.Success(response.body(), null, 0)
        else GetSearchResults.Error(null, response.code().toString())
    }

    suspend fun getReels(url: String): GetSearchResults<Reels?> {
        val response = downloadAPI.getReel(url)
        return if (response.isSuccessful)
            GetSearchResults.Success(response.body(), null, 0)
        else GetSearchResults.Error(null, response.code().toString())
    }
}

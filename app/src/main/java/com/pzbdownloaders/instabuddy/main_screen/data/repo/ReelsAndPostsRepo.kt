package com.pzbdownloaders.instabuddy.main_screen.data.repo

import com.pzbdownloaders.instabuddy.main_screen.data.api.DownloadAPI
import com.pzbdownloaders.instabuddy.main_screen.data.model.Root
import com.pzbdownloaders.instabuddy.main_screen.data.model.RootReel
import com.pzbdownloaders.instabuddy.main_screen.data.model.ShortCode
import com.pzbdownloaders.instabuddy.main_screen.domain.util.GetSearchResults
import javax.inject.Inject

class ReelsAndPostsRepo @Inject constructor(private val downloadAPI: DownloadAPI) {

    suspend fun getPosts(shortcode: ShortCode): GetSearchResults<Root?> {
        /*     val response = downloadAPI.getPost(url)
             return if (response.isSuccessful)
                 GetSearchResults.Success(response.body(), null, 0)
             else GetSearchResults.Error(null, response.code().toString())*/

        val response = downloadAPI.getPostsRocket(shortcode)
        return if (response.isSuccessful)
            GetSearchResults.Success(response.body(), null, 0)
        else GetSearchResults.Error(null, response.code().toString())
    }

    suspend fun getReels(shortcode: ShortCode): GetSearchResults<RootReel?> {
        val response = downloadAPI.getReelsRocket(shortcode)
        return if (response.isSuccessful)
            GetSearchResults.Success(response.body(), null, 0)
        else GetSearchResults.Error(null, response.code().toString())
    }
}

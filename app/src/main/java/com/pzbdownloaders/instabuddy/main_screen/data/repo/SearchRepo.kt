package com.pzbdownloaders.instabuddy.main_screen.data.repo

import android.util.Log
import com.pzbdownloaders.instabuddy.main_screen.data.api.DownloadAPI
import com.pzbdownloaders.instabuddy.main_screen.data.model.Search
import com.pzbdownloaders.instabuddy.main_screen.domain.util.GetSearchResults
import javax.inject.Inject

class SearchRepo @Inject constructor(private val downloadAPI: DownloadAPI) {

    suspend fun getSearchResults(url: String): GetSearchResults<Search?> {
        val response = downloadAPI.getSearchResults(url)
        if (response.isSuccessful) {
            Log.i("users123",response.body().toString())
            return GetSearchResults.Success(response.body(), null, 0)

        } else {
            return GetSearchResults.Error(null, response.code().toString())
        }
    }
}
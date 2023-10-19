package com.pzbdownloaders.instabuddy.main_screen.data.repo

import android.util.Log
import com.pzbdownloaders.instabuddy.main_screen.data.api.DownloadAPI
import com.pzbdownloaders.instabuddy.main_screen.data.model.Search
import com.pzbdownloaders.instabuddy.main_screen.domain.util.GetSearchResults
import retrofit2.Response
import java.net.SocketException
import java.net.SocketTimeoutException
import javax.inject.Inject

class SearchRepo @Inject constructor(private val downloadAPI: DownloadAPI) {

    suspend fun getSearchResults(url: String): GetSearchResults<Search?> {
        val response: Response<Search>
        try {
            response = downloadAPI.getSearchResults(url)
        } catch (exception: SocketTimeoutException) {
            return GetSearchResults.SocketTimeOutException(null, "Failed to connect")
        }
        return if (response.isSuccessful) {
            Log.i("users123", response.body().toString())
            GetSearchResults.Success(response.body(), null, 0)
        } else {
            GetSearchResults.Error(null, response.code().toString())
        }
    }
}
package com.pzbdownloaders.instabuddy.main_screen.data.repo

import android.util.Log
import com.pzbdownloaders.instabuddy.main_screen.data.api.DownloadAPI
import com.pzbdownloaders.instabuddy.main_screen.data.model.RootSearch
import com.pzbdownloaders.instabuddy.main_screen.data.model.Search
import com.pzbdownloaders.instabuddy.main_screen.data.model.SearchRawData
import com.pzbdownloaders.instabuddy.main_screen.domain.util.GetSearchResults
import retrofit2.Response
import java.net.SocketException
import java.net.SocketTimeoutException
import javax.inject.Inject

class SearchRepo @Inject constructor(private val downloadAPI: DownloadAPI) {

    suspend fun getSearchResults(searchRawData: SearchRawData): GetSearchResults<RootSearch?> {
        val response: Response<RootSearch>
        try {
            response = downloadAPI.getSearchResultsRocket(searchRawData)
        } catch (exception: SocketTimeoutException) {
            Log.i("Repo123", "repo123")
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
package com.pzbdownloaders.instabuddy.main_screen.domain.usecase

import android.util.Log
import com.pzbdownloaders.instabuddy.main_screen.data.model.RootSearch
import com.pzbdownloaders.instabuddy.main_screen.data.model.Search
import com.pzbdownloaders.instabuddy.main_screen.data.model.SearchRawData
import com.pzbdownloaders.instabuddy.main_screen.data.repo.SearchRepo
import com.pzbdownloaders.instabuddy.main_screen.domain.util.GetSearchResults
import java.net.SocketTimeoutException
import javax.inject.Inject

class SearchUseCase @Inject constructor(private val searchRepo: SearchRepo) {

    suspend fun getUrlResult(searchRawData: SearchRawData): Pair<RootSearch?, String?> {
        var result = searchRepo.getSearchResults(searchRawData)
        return when (result) {
            is GetSearchResults.Success -> {
                Log.i("users456", result.data.toString())
                Pair(result.data, "Response 200")
            }

            is GetSearchResults.Error -> {
                Log.i("users4567", result.message.toString())
                Pair(null, result.message)
            }

            is GetSearchResults.SocketTimeOutException -> {
                Log.i("usecase123", result.message.toString())
                Pair(null, result.message)
            }
        }
    }
}
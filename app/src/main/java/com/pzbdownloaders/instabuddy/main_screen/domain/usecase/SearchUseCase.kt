package com.pzbdownloaders.instabuddy.main_screen.domain.usecase

import android.util.Log
import com.pzbdownloaders.instabuddy.main_screen.data.model.Search
import com.pzbdownloaders.instabuddy.main_screen.data.repo.SearchRepo
import com.pzbdownloaders.instabuddy.main_screen.domain.util.GetSearchResults
import javax.inject.Inject

class SearchUseCase @Inject constructor(private val searchRepo: SearchRepo) {

    suspend fun getUrlResult(url: String): Pair<Search?, String?> {
        val result = searchRepo.getSearchResults(url)
        return when (result) {
            is GetSearchResults.Success -> {
                Log.i("users456", result.data.toString())
                Pair(result.data, "Response 200")
            }
            is GetSearchResults.Error -> {
                Pair(null, result.message)
            }
        }
    }
}
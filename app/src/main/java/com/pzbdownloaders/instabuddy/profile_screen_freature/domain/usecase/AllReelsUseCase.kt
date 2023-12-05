package com.pzbdownloaders.instabuddy.profile_screen_freature.domain.usecase

import android.util.Log
import com.pzbdownloaders.instabuddy.main_screen.domain.util.GetSearchResults
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllPosts
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllReels
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllReelsRawData
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.RootAllReels
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.repo.AllReelsRepo
import javax.inject.Inject

class AllReelsUseCase @Inject constructor(private val allReelsRepo: AllReelsRepo) {

    var responseNumber = 0
    suspend fun getAllReels(allReelsRawData: AllReelsRawData): Triple<RootAllReels?, String?, String> {
        val result = allReelsRepo.getAllReels(allReelsRawData)
        return when (result) {
            is GetSearchResults.Success -> {
                responseNumber += 1
                Triple(result.data, "Response 200", responseNumber.toString())
            }
            is GetSearchResults.Error -> {
                Triple(null, result.message, "Nothing")
            }
            is GetSearchResults.SocketTimeOutException -> {
                Triple(null, result.message, "Nothing")
            }

        }
    }

    /*suspend fun getNextReels(url: String): Pair<AllReels?, String?> {
        val result = allReelsRepo.getNextReel(url)
        return when (result) {
            is GetSearchResults.Success -> {
                Pair(result.data, "Response 200")
            }
            is GetSearchResults.Error -> {
                Pair(null, result.message)
            }
        }
    }*/
}
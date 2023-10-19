package com.pzbdownloaders.instabuddy.profile_screen_freature.domain.usecase

import com.pzbdownloaders.instabuddy.main_screen.domain.util.GetSearchResults
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllReels
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.UserId
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.repo.UserIdRepo
import javax.inject.Inject

class UserIdUseCase @Inject constructor(private val userIdRepo: UserIdRepo) {

    var responseNumber = 0
    suspend fun getUserId(url: String): Triple<UserId?, String?, String> {
        val result = userIdRepo.getUserId(url)
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
}
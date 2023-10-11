package com.pzbdownloaders.instabuddy.profile_screen_freature.domain.usecase

import com.pzbdownloaders.instabuddy.main_screen.domain.util.GetSearchResults
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllReels
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllStories
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.repo.AllStoriesRepo
import javax.inject.Inject

class AllStoriesUseCase @Inject constructor(private val allStoriesRepo: AllStoriesRepo) {

    var responseNumber = 0
    suspend fun getAllStories(url: String): Triple<AllStories?, String?, String> {
        val result = allStoriesRepo.getAllStories(url)
        return when (result) {
            is GetSearchResults.Success -> {
                responseNumber += 1
                Triple(result.data, "Response 200", responseNumber.toString())
            }
            is GetSearchResults.Error -> {
                Triple(null, result.message, "Nothing")
            }
        }
    }
}
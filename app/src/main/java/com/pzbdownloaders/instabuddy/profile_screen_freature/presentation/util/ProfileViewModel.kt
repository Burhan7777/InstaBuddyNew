package com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pzbdownloaders.instabuddy.main_screen.domain.usecase.ReelsAndPostsUseCase
import com.pzbdownloaders.instabuddy.main_screen.domain.util.DownloadManager
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllPosts
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllPostsRawData
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllReels
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllReelsRawData
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllStories
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllStoriesRawData
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.RootAllPosts
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.RootAllReels
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.RootAllStories
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.UserId
import com.pzbdownloaders.instabuddy.profile_screen_freature.domain.usecase.AllPostsUseCase
import com.pzbdownloaders.instabuddy.profile_screen_freature.domain.usecase.AllReelsUseCase
import com.pzbdownloaders.instabuddy.profile_screen_freature.domain.usecase.AllStoriesUseCase
import com.pzbdownloaders.instabuddy.profile_screen_freature.domain.usecase.UserIdUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val allPostsUseCase: AllPostsUseCase,
    private val reelsAndPostsUseCase: ReelsAndPostsUseCase,
    private val downloadManager: DownloadManager,
    private val allReelsUseCase: AllReelsUseCase,
    private val allStoriesUseCase: AllStoriesUseCase,
    private val userIdUseCase: UserIdUseCase
) :
    ViewModel() {

    var getUserName: MutableLiveData<String> = MutableLiveData<String>()


    var getPosts: MutableLiveData<RootAllPosts?> = MutableLiveData()
        private set

    var getPostsResponse: MutableLiveData<String?> = MutableLiveData()
        private set

    var getPostsAddedResponse: MutableLiveData<String?> = MutableLiveData()
        private set

    var getReels: MutableLiveData<RootAllReels?> = MutableLiveData()
        private set

    var getReelsResponse: MutableLiveData<String?> = MutableLiveData()
        private set

    var getReelsAddedResponse: MutableLiveData<String?> = MutableLiveData()
        private set

    var getStories: MutableLiveData<RootAllStories?> = MutableLiveData()
        private set

    var getStoriesResponse: MutableLiveData<String?> = MutableLiveData()
        private set

    var getUserId: MutableLiveData<UserId?> = MutableLiveData()
        private set

    fun getPosts(allPostsRawData: AllPostsRawData) {
        viewModelScope.launch {
            val pair = allPostsUseCase.getAllPosts(allPostsRawData)
            getPosts.postValue(pair.first)
            getPostsResponse.postValue(pair.second)
            getPostsAddedResponse.postValue(pair.third)
        }
    }

    fun getReels(allReelsRawData: AllReelsRawData) {
        viewModelScope.launch {
            val triple = allReelsUseCase.getAllReels(allReelsRawData)
            getReels.postValue(triple.first)
            getReelsResponse.postValue(triple.second)
            getReelsAddedResponse.postValue(triple.third)
        }
    }


    fun getUserId(url: String) {
        viewModelScope.launch {
            val triple = userIdUseCase.getUserId(url)
            getUserId.postValue(triple.first)
            //    getStoriesResponse.postValue(triple.second)
        }
    }

    fun getStories(allStories: AllStoriesRawData) {
        viewModelScope.launch {
            val triple = allStoriesUseCase.getAllStories(allStories)
            getStories.postValue(triple.first)
            getStoriesResponse.postValue(triple.second)
        }
    }


    fun downloadPost(url: String) {
        viewModelScope.launch(Dispatchers.IO) {
            downloadManager.downloadPost(url)
        }
    }

    fun downloadReel(url: String) {
        viewModelScope.launch(Dispatchers.IO) {
            downloadManager.downloadReel(url)
        }
    }

    fun downloadMusic(url: String) {
        viewModelScope.launch(Dispatchers.IO) {
            downloadManager.downloadMusic(url)
        }
    }

}
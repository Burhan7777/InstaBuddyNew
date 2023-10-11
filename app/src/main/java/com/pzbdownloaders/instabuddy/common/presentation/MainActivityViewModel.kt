package com.pzbdownloaders.instabuddy.common.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pzbdownloaders.instabuddy.main_screen.data.model.Search
import com.pzbdownloaders.instabuddy.main_screen.domain.usecase.GetUrlUseCase
import com.pzbdownloaders.instabuddy.main_screen.domain.usecase.ReelsAndPostsUseCase
import com.pzbdownloaders.instabuddy.main_screen.domain.usecase.SearchUseCase
import com.pzbdownloaders.instabuddy.main_screen.domain.util.DownloadManager
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllPosts
import com.pzbdownloaders.instabuddy.profile_screen_freature.domain.usecase.AllPostsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val reelsAndPostsUseCase: ReelsAndPostsUseCase,
    private val getUrlUseCase: GetUrlUseCase,
    private val searchUseCase: SearchUseCase,
    private val allPostsUseCase: AllPostsUseCase,
    private val downloadManager: DownloadManager
) : ViewModel() {

    var getShortCode: String = ""

    var searchResults: MutableLiveData<Search?> = MutableLiveData()
        private set

    var searchResultsCode: MutableLiveData<String?> = MutableLiveData()
        private set

    var fileSize: MutableLiveData<Long> = MutableLiveData()


    fun getFIleSize() {
        fileSize.value = downloadManager.totalLength
        Log.i("file123", fileSize.value.toString())
    }

    fun downloadPost(url: String) {
        viewModelScope.launch(Dispatchers.IO) {
            reelsAndPostsUseCase.getPosts(url)
        }
    }

    fun downloadReel(url: String) {
        viewModelScope.launch(Dispatchers.IO) {
            reelsAndPostsUseCase.getReels(url)
        }
    }

    fun getUrlShortCode(url: String) {
        getShortCode = getUrlUseCase.getShortCode(url)
    }

    fun getSearchResults(url: String) {
        viewModelScope.launch(Dispatchers.IO) {
            //val pair =
            searchResults.postValue(searchUseCase.getUrlResult(url).first)
            searchResultsCode.postValue(searchUseCase.getUrlResult(url).second)
            Log.i("search123", searchResults.value.toString())
        }
    }
}
package com.pzbdownloaders.instabuddy.common.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pzbdownloaders.instabuddy.main_screen.data.model.RootSearch
import com.pzbdownloaders.instabuddy.main_screen.data.model.Search
import com.pzbdownloaders.instabuddy.main_screen.data.model.SearchHistory
import com.pzbdownloaders.instabuddy.main_screen.data.model.SearchRawData
import com.pzbdownloaders.instabuddy.main_screen.data.model.ShortCode
import com.pzbdownloaders.instabuddy.main_screen.data.repo.SearchHistoryRepo
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
    private val downloadManager: DownloadManager,
    private val searchHistoryRepo: SearchHistoryRepo
) : ViewModel() {

    var getShortCode: String = ""

    var searchResults: MutableLiveData<RootSearch?> = MutableLiveData()
        private set

    var searchResultsCode: MutableLiveData<String?> = MutableLiveData()
        private set

    var fileSize: MutableLiveData<Long> = MutableLiveData()

    var sendSearchRequest: MutableLiveData<Boolean> = MutableLiveData(false)

    var searchUserName: MutableLiveData<String> = MutableLiveData()


    fun getFIleSize() {
        fileSize.value = downloadManager.totalLength
        Log.i("file123", fileSize.value.toString())
    }

    fun downloadPost(shortCode: ShortCode) {
        viewModelScope.launch(Dispatchers.IO) {
            reelsAndPostsUseCase.getPosts(shortCode)
        }
    }

    fun downloadReel(shortCode: ShortCode) {
        viewModelScope.launch(Dispatchers.IO) {
            reelsAndPostsUseCase.getReels(shortCode)
        }
    }

    fun getUrlShortCode(url: String) {
        getShortCode = getUrlUseCase.getShortCode(url)
    }

    fun getSearchResults(searchRawData: SearchRawData) {
        viewModelScope.launch(Dispatchers.IO) {
            //val pair =
            searchResults.postValue(searchUseCase.getUrlResult(searchRawData).first)
            searchResultsCode.postValue(searchUseCase.getUrlResult(searchRawData).second)
        }
        Log.i("search123", searchResultsCode.value.toString())
    }

    fun insertUserName(searchHistory: SearchHistory) {
        viewModelScope.launch {
            searchHistoryRepo.insertUserName(searchHistory)
        }
    }

    fun deleteUserName(userName: String) {
        viewModelScope.launch {
            searchHistoryRepo.deleteUserName(userName)
        }
    }

    fun getHistory(): LiveData<List<SearchHistory>> {
        return searchHistoryRepo.getHistory()
    }

    fun deleteAll() {
        viewModelScope.launch {
            searchHistoryRepo.deleteAll()
        }
    }

    fun sendSearchRequest(value: Boolean, username: String) {
        sendSearchRequest.value = value
        searchUserName.value = username
    }
}
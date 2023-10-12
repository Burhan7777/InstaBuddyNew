package com.pzbdownloaders.instabuddy.main_screen.data.repo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.pzbdownloaders.instabuddy.main_screen.data.db.Database
import com.pzbdownloaders.instabuddy.main_screen.data.model.SearchHistory
import javax.inject.Inject

class SearchHistoryRepo @Inject constructor(private val database: Database) {

    suspend fun insertUserName(searchHistory: SearchHistory) {
        database.getDao().insertUserName(searchHistory)
    }

    suspend fun deleteUserName(userName: String) {
        database.getDao().deleteUserName(userName)
    }

    fun getHistory(): LiveData<List<SearchHistory>> {
        return database.getDao().getHistory()
    }
}
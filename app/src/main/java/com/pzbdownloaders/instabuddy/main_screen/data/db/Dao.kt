package com.pzbdownloaders.instabuddy.main_screen.data.db

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.pzbdownloaders.instabuddy.main_screen.data.model.SearchHistory

@androidx.room.Dao
interface Dao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUserName(searchHistory: SearchHistory)

    @Query("delete from searchHistory where userName ==:name")
    suspend fun deleteUserName(name: String)

    @Query("SELECT * FROM searchHistory")
    fun getHistory(): LiveData<List<SearchHistory>>

    @Query("delete from searchHistory")
    suspend fun deleteAll()
}
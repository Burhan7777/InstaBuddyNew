package com.pzbdownloaders.instabuddy.main_screen.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "searchHistory")
data class SearchHistory(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val userName: String
)
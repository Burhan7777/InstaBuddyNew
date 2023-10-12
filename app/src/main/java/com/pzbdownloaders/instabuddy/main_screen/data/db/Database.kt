package com.pzbdownloaders.instabuddy.main_screen.data.db

import androidx.room.Room
import androidx.room.RoomDatabase
import com.pzbdownloaders.instabuddy.main_screen.data.model.SearchHistory

@androidx.room.Database(entities = [SearchHistory::class], version = 1)
abstract class Database : RoomDatabase() {

    abstract fun getDao(): Dao
}
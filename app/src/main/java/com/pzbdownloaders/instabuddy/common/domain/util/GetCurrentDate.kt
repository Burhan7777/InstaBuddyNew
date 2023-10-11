package com.pzbdownloaders.instabuddy.common.domain.util

import java.text.SimpleDateFormat
import java.util.*

object GetCurrentDate {

    fun getCurrentDate(): String {
        val calendar = Calendar.getInstance()
        val timeInMillis = calendar.timeInMillis
        val date = Date(timeInMillis)
        val dateFormat = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
        return dateFormat.format(date)
    }
}
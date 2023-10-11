package com.pzbdownloaders.instabuddy.main_screen.domain.usecase

import android.util.Log

class GetUrlUseCase {

    fun getShortCode(url: String): String {
        if (url.contains(".com/reel/")) {
            var shortCode = url.substringAfter("/reel/").substringBefore("/?")
            Log.i("shortcode123", shortCode)
            return "https://apiprofi.com/api/reel?shortcode=$shortCode"

        }
        if (url.contains(".com/p/")) {
            var shortCode = url.substringAfter("/p/").substringBefore("/?")
            Log.i("shortcode123", shortCode)
            return "https://apiprofi.com/api/post_info?shortcode=$shortCode"

        }
        return "This link is not from instagram"
    }
}
package com.pzbdownloaders.instabuddy.main_screen.data.api

import com.pzbdownloaders.instabuddy.main_screen.data.model.Posts
import com.pzbdownloaders.instabuddy.main_screen.data.model.Reels
import com.pzbdownloaders.instabuddy.main_screen.data.model.Search
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Url

interface DownloadAPI {
    @Headers(
        "Authorization:Bearer 32|RtML7bduxzU0fFt3BgcJqJUGgR5eCPGVt9hvn0gW"
    )
    @GET
    suspend fun getSearchResults(@Url url: String): Response<Search>

    @Headers(
        "Authorization:Bearer 32|RtML7bduxzU0fFt3BgcJqJUGgR5eCPGVt9hvn0gW"
    )
    @GET
    suspend fun getReel(@Url url: String): Response<Reels>

    @Headers(
        "Authorization:Bearer 32|RtML7bduxzU0fFt3BgcJqJUGgR5eCPGVt9hvn0gW"
    )
    @GET
    suspend fun getPost(@Url url: String): Response<Posts>

}
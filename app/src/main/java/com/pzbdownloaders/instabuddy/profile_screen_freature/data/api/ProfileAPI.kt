package com.pzbdownloaders.instabuddy.profile_screen_freature.data.api

import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllPosts
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllReels
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllStories
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.UserId
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Url

interface ProfileAPI {

    @Headers(
        "Authorization:Bearer 32|RtML7bduxzU0fFt3BgcJqJUGgR5eCPGVt9hvn0gW"
    )
    @GET
    suspend fun getAllPosts(@Url url: String): Response<AllPosts>

    @Headers(
        "Authorization:Bearer 32|RtML7bduxzU0fFt3BgcJqJUGgR5eCPGVt9hvn0gW"
    )
    @GET
    suspend fun getNextPosts(@Url url: String): Response<AllPosts>

    @Headers(
        "Authorization:Bearer 32|RtML7bduxzU0fFt3BgcJqJUGgR5eCPGVt9hvn0gW"
    )
    @GET
    suspend fun getAllReels(@Url url: String): Response<AllReels>

    @Headers(
        "Authorization:Bearer 32|RtML7bduxzU0fFt3BgcJqJUGgR5eCPGVt9hvn0gW"
    )
    @GET
    suspend fun getNextReels(@Url url: String): Response<AllReels>

    @Headers(
        "Authorization:Bearer 32|RtML7bduxzU0fFt3BgcJqJUGgR5eCPGVt9hvn0gW"
    )
    @GET
    suspend fun getAllStories(@Url url: String): Response<AllStories>

    @Headers(
        "Authorization:Bearer 32|RtML7bduxzU0fFt3BgcJqJUGgR5eCPGVt9hvn0gW"
    )
    @GET
    suspend fun getUserId(@Url url: String): Response<UserId>
}



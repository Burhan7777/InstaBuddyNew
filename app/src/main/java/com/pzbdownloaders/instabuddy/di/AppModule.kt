package com.pzbdownloaders.instabuddy.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.pzbdownloaders.instabuddy.main_screen.data.api.DownloadAPI
import com.pzbdownloaders.instabuddy.main_screen.data.repo.ReelsAndPostsRepo
import com.pzbdownloaders.instabuddy.common.domain.util.Constants
import com.pzbdownloaders.instabuddy.main_screen.data.db.Database
import com.pzbdownloaders.instabuddy.main_screen.data.model.SearchHistory
import com.pzbdownloaders.instabuddy.main_screen.data.repo.SearchHistoryRepo
import com.pzbdownloaders.instabuddy.main_screen.data.repo.SearchRepo
import com.pzbdownloaders.instabuddy.main_screen.domain.usecase.GetUrlUseCase
import com.pzbdownloaders.instabuddy.main_screen.domain.usecase.ReelsAndPostsUseCase
import com.pzbdownloaders.instabuddy.main_screen.domain.usecase.SearchUseCase
import com.pzbdownloaders.instabuddy.main_screen.domain.util.DownloadManager
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.api.ProfileAPI
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.repo.AllPostsRepo
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.repo.AllReelsRepo
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.repo.AllStoriesRepo
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.repo.UserIdRepo
import com.pzbdownloaders.instabuddy.profile_screen_freature.domain.usecase.AllPostsUseCase
import com.pzbdownloaders.instabuddy.profile_screen_freature.domain.usecase.AllReelsUseCase
import com.pzbdownloaders.instabuddy.profile_screen_freature.domain.usecase.AllStoriesUseCase
import com.pzbdownloaders.instabuddy.profile_screen_freature.domain.usecase.UserIdUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun createOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder().readTimeout(20, TimeUnit.SECONDS)
            .connectTimeout(20, TimeUnit.SECONDS).build()
    }

    @Provides
    @Singleton
    fun createRetrofitInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).client(createOkHttpClient()).build()
    }

    @Provides
    @Singleton
    fun createDownloadAPI(): DownloadAPI = createRetrofitInstance().create(DownloadAPI::class.java)

    @Provides
    @Singleton
    fun createProfileAPI(): ProfileAPI = createRetrofitInstance().create(ProfileAPI::class.java)

    @Provides
    @Singleton
    fun createRoomDatabase(@ApplicationContext context: Context): Database =
        Room.databaseBuilder(context, Database::class.java, "searchHistory").build()


    @Provides
    fun reelsAndPostsRepo() = ReelsAndPostsRepo(createDownloadAPI())

    @Provides
    fun applicationContext() = Application()

    @Provides
    fun downloadManager(@ApplicationContext context: Context) = DownloadManager(context)

    @Provides
    fun getUrlShortCodeUseCase() = GetUrlUseCase()

    @Provides
    fun reelsAndPostsUseCase(@ApplicationContext context: Context) =
        ReelsAndPostsUseCase(reelsAndPostsRepo(), downloadManager(context))

    @Provides
    fun searchRepo() = SearchRepo(createDownloadAPI())

    @Provides
    fun searchUseCase() = SearchUseCase(searchRepo())

    @Provides
    fun allPostsRepo() = AllPostsRepo(createProfileAPI())

    @Provides
    fun allPostsUseCase() = AllPostsUseCase(allPostsRepo())

    @Provides
    fun allReelsRepo() = AllReelsRepo(createProfileAPI())

    @Provides
    fun allReelsUseCase() = AllReelsUseCase(allReelsRepo())

    @Provides
    fun allStoriesRepo() = AllStoriesRepo(createProfileAPI())

    @Provides
    fun allStoriesUseCase() = AllStoriesUseCase(allStoriesRepo())

    @Provides
    fun userIdRepo() = UserIdRepo(createProfileAPI())

    @Provides
    fun userIdUseCase() = UserIdUseCase(userIdRepo())

    @Provides
    fun searchHistoryRepo(@ApplicationContext context: Context) = SearchHistoryRepo(createRoomDatabase(context))
}
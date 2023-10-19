package com.pzbdownloaders.instabuddy.main_screen.domain.usecase

import android.util.Log
import com.pzbdownloaders.instabuddy.main_screen.data.repo.ReelsAndPostsRepo
import com.pzbdownloaders.instabuddy.main_screen.domain.util.DownloadManager
import com.pzbdownloaders.instabuddy.main_screen.domain.util.GetSearchResults
import javax.inject.Inject

class ReelsAndPostsUseCase @Inject constructor(
    private val reelsAndPostsRepo: ReelsAndPostsRepo,
    private val downloadManager: DownloadManager
) {
    suspend fun getPosts(url: String) {
        var result = reelsAndPostsRepo.getPosts(url)
        when (result) {
            is GetSearchResults.Success -> {
                      downloadManager.downloadPost(result.data?.display_resources!![2].src)
                  //    downloadManager.newDownload(result.data?.display_resources!![2].src)
                Log.i("results", result.data?.display_resources!![2].src)
            }
            is GetSearchResults.Error -> {
                // DO NOTHING
            }
            is GetSearchResults.SocketTimeOutException ->{

            }
        }
    }

    suspend fun getReels(url: String) {
        var result = reelsAndPostsRepo.getReels(url)
        when (result) {
            is GetSearchResults.Success -> {
            downloadManager.downloadReel(result.data?.video_url)
            //   downloadManager.newDownload(result.data?.video_url!!)
            }
            is GetSearchResults.Error -> {
                // DO NOTHING
            }
            is GetSearchResults.SocketTimeOutException ->{

            }
        }
    }
}
package com.pzbdownloaders.instabuddy.main_screen.domain.util

import android.R.attr.description
import android.R.attr.visibility
import android.app.DownloadManager
import android.content.Context
import android.os.Environment
import android.telephony.mbms.DownloadRequest
import android.util.Log
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.net.toUri
import androidx.lifecycle.MutableLiveData
import com.huxq17.download.DownloadProvider.context
import com.huxq17.download.Pump
import com.huxq17.download.core.task.DownloadTask
import com.liulishuo.okdownload.core.breakpoint.BreakpointInfo
import com.liulishuo.okdownload.core.cause.EndCause
import com.liulishuo.okdownload.core.cause.ResumeFailedCause
import com.pzbdownloaders.instabuddy.common.domain.util.GetCurrentDate
import com.tonyodev.fetch2.*
import ir.siaray.downloadmanagerplus.classes.Downloader
import ir.siaray.downloadmanagerplus.enums.DownloadReason
import ir.siaray.downloadmanagerplus.interfaces.DownloadListener
import ir.siaray.downloadmanagerplus.model.DownloadItem
import java.io.File
import java.lang.Exception
import java.util.*
import javax.inject.Inject


class DownloadManager @Inject constructor(private val application: Context) {

    var totalLength = 0L

    fun downloadReel(data: String?) {
        val downloadManager =
            ContextCompat.getSystemService(
                application.applicationContext,
                DownloadManager::class.java
            )
        val request =
            DownloadManager.Request(data?.toUri())
                .setMimeType("video/mp4")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI)
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("InstaBuddy-Reel-${GetCurrentDate.getCurrentDate()}${UUID.randomUUID()}.mp4")
                .setDestinationInExternalPublicDir(
                    Environment.DIRECTORY_DOWNLOADS,
                    "InstaBuddy-Reel-${GetCurrentDate.getCurrentDate()}${UUID.randomUUID()}.mp4"
                ).setAllowedOverMetered(true)
        downloadManager?.enqueue(request)
    }

    fun downloadPost(data: String?) {
        val downloadManager =
            ContextCompat.getSystemService(
                application.applicationContext,
                DownloadManager::class.java
            )
        val request =
            DownloadManager.Request(data?.toUri())
                .setMimeType("image/jpeg")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI)
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("InstaBuddy-Post-${GetCurrentDate.getCurrentDate()}${UUID.randomUUID()}.jpg")
                .setDestinationInExternalPublicDir(
                    Environment.DIRECTORY_DOWNLOADS,
                    "InstaBuddy/InstaBuddy-Post-${GetCurrentDate.getCurrentDate()}${UUID.randomUUID()}.jpg"
                ).setAllowedOverMetered(true)
        downloadManager?.enqueue(request)
    }

    fun newDownload(data: String) {
        var task =
            com.liulishuo.okdownload.DownloadTask.Builder(
                data,
                Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
            )
                .setFilename("InstaBuddy/InstaBuddy-Post-${GetCurrentDate.getCurrentDate()}${UUID.randomUUID()}.mp4")
                .setWifiRequired(false).setMinIntervalMillisCallbackProcess(10)
                .setPassIfAlreadyCompleted(true)
                .build()

        task.execute(object : com.liulishuo.okdownload.DownloadListener {
            override fun taskStart(task: com.liulishuo.okdownload.DownloadTask) {
            }

            override fun connectTrialStart(
                task: com.liulishuo.okdownload.DownloadTask,
                requestHeaderFields: MutableMap<String, MutableList<String>>
            ) {
            }

            override fun connectTrialEnd(
                task: com.liulishuo.okdownload.DownloadTask,
                responseCode: Int,
                responseHeaderFields: MutableMap<String, MutableList<String>>
            ) {

            }

            override fun downloadFromBeginning(
                task: com.liulishuo.okdownload.DownloadTask,
                info: BreakpointInfo,
                cause: ResumeFailedCause
            ) {

            }

            override fun downloadFromBreakpoint(
                task: com.liulishuo.okdownload.DownloadTask,
                info: BreakpointInfo
            ) {

            }

            override fun connectStart(
                task: com.liulishuo.okdownload.DownloadTask,
                blockIndex: Int,
                requestHeaderFields: MutableMap<String, MutableList<String>>
            ) {
                Toast.makeText(application, "Download started", Toast.LENGTH_SHORT).show()
            }

            override fun connectEnd(
                task: com.liulishuo.okdownload.DownloadTask,
                blockIndex: Int,
                responseCode: Int,
                responseHeaderFields: MutableMap<String, MutableList<String>>
            ) {

            }

            override fun fetchStart(
                task: com.liulishuo.okdownload.DownloadTask,
                blockIndex: Int,
                contentLength: Long
            ) {

            }

            override fun fetchProgress(
                task: com.liulishuo.okdownload.DownloadTask,
                blockIndex: Int,
                increaseBytes: Long
            ) {
                totalLength = totalLength.plus(increaseBytes)
                Log.i("fileSize1234", totalLength.toString())
            }

            override fun fetchEnd(
                task: com.liulishuo.okdownload.DownloadTask,
                blockIndex: Int,
                contentLength: Long
            ) {

            }

            override fun taskEnd(
                task: com.liulishuo.okdownload.DownloadTask,
                cause: EndCause,
                realCause: Exception?
            ) {
                Toast.makeText(application, "Complete", Toast.LENGTH_SHORT).show()
            }

        })

    }

    fun returnFileSize() {
        //  return totalLength.value
    }
}

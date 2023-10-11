package com.pzbdownloaders.instabuddy.main_screen.presentation.fragments

import android.app.DownloadManager.ACTION_DOWNLOAD_COMPLETE
import android.content.*
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.os.Environment
import android.provider.ContactsContract.Directory
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.ui.graphics.Color
import androidx.core.net.toUri
import androidx.lifecycle.ViewModelProvider
import com.aghamiri.fastdl.OnDownloadProgressListener
import com.google.android.exoplayer2.C.NetworkType
import com.google.android.exoplayer2.offline.Downloader
import com.pzbdownloaders.instabuddy.R
import com.pzbdownloaders.instabuddy.common.domain.util.GetCurrentDate
import com.pzbdownloaders.instabuddy.common.presentation.MainActivityViewModel
import com.pzbdownloaders.instabuddy.databinding.FragmentHomeScreenBinding
import com.pzbdownloaders.instabuddy.main_screen.domain.util.DownloadManager
import java.util.*


class HomeScreenFragment : Fragment() {
    lateinit var binding: FragmentHomeScreenBinding
    lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mainActivityViewModel =
            ViewModelProvider(requireActivity())[MainActivityViewModel::class.java]
        binding = FragmentHomeScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        requireContext().registerReceiver(
            DownloaderCompletion(),
            IntentFilter(android.app.DownloadManager.ACTION_DOWNLOAD_COMPLETE),
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.pasteLinkButton.setOnClickListener {
            val clipboard: ClipboardManager =
                activity?.getSystemService(ComponentActivity.CLIPBOARD_SERVICE) as ClipboardManager
            val clip = clipboard.primaryClip?.getItemAt(0)?.text.toString()
            binding.link.setText(clip)
        }

        binding.downloadButton.setOnClickListener {
            mainActivityViewModel.getUrlShortCode(binding.link.text.toString())
            val url = mainActivityViewModel.getShortCode
            if (url.contains("reel")) {
                mainActivityViewModel.downloadReel(url)
            }
            if (url.contains("post_info")) {
                mainActivityViewModel.downloadPost(url)
                Log.i("log123", url.toString())
            }

            binding.downloadButton.startAnimation()
        }
        mainActivityViewModel.getFIleSize()
        mainActivityViewModel.fileSize.observe(requireActivity()) {
            Toast.makeText(requireContext(), it.toString(), Toast.LENGTH_SHORT).show()
        }

        binding.clear.setOnClickListener {
            binding.link.setText("")
        }
    }


    inner class DownloaderCompletion : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            if (intent?.action == "android.intent.action.DOWNLOAD_COMPLETE") {
                val id = intent.getLongExtra(android.app.DownloadManager.EXTRA_DOWNLOAD_ID, -1L)
                if (id != -1L) {
                    Toast.makeText(requireContext(), "Download complete", Toast.LENGTH_SHORT).show()
                    binding.downloadButton.revertAnimation()
                }
            }
        }
    }
}
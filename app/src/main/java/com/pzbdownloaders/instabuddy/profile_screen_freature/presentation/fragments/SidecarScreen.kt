package com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowInsets.Side
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import androidx.viewpager2.widget.ViewPager2
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.material.button.MaterialButton
import com.pzbdownloaders.instabuddy.R
import com.pzbdownloaders.instabuddy.common.presentation.MainActivityViewModel
import com.pzbdownloaders.instabuddy.databinding.FragmentSidecarViewPagerBinding
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util.ProfileViewModel
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util.SidecarAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlin.math.exp

@AndroidEntryPoint
class SidecarScreen : Fragment() {

    lateinit var binding: FragmentSidecarViewPagerBinding
    lateinit var sidecarAdapter: SidecarAdapter
    lateinit var viewModel: ProfileViewModel
    lateinit var exoPlayer: ExoPlayer
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentSidecarViewPagerBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this)[ProfileViewModel::class.java]
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as AppCompatActivity).setSupportActionBar(binding.downloadToolbar)
        val args: SidecarScreenArgs by navArgs()
        val imageUrl = args.imageUrl
        val sideCar = args.sidecar
        exoPlayer = ExoPlayer.Builder(requireContext()).build()

        //   (requireActivity() as AppCompatActivity).supportActionBar?


        Log.i("imageurl", imageUrl.toString())
//        Log.i("sidecar1234", sideCar!![1].toString())

        sidecarAdapter = SidecarAdapter(imageUrl, sideCar, requireContext(), exoPlayer)
        binding.sidecarViewPager.adapter = sidecarAdapter

        binding.sidecarViewPager.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                if (sideCar != null) {
                    (requireActivity() as AppCompatActivity).supportActionBar?.title =
                        "Download - (${position + 1}/${sideCar.size})"


                    if (position != 0 && sideCar[position].contains(".mp4")) {
                        //exoPlayer.playWhenReady = false
                        //exoPlayer.pause()
                        //  exoPlayer.release()
                    }
                }
            }
        })

        if (sideCar != null) {
            binding.sideDownloadAllButton.visibility = View.VISIBLE
        }

        binding.sideDownloadAllButton.setOnClickListener {
            for (i in sideCar?.indices ?: emptyList<Int>().indices) {
                viewModel.downloadPost(sideCar!![i])
            }
        }

        binding.sideDownloadButton.setOnClickListener {
            if (sideCar != null) {
                if (sideCar[binding.sidecarViewPager.currentItem].contains(".mp4")) {
                    viewModel.downloadReel(sideCar[binding.sidecarViewPager.currentItem])
                } else {
                    viewModel.downloadPost(sideCar[binding.sidecarViewPager.currentItem])
                }
            } else if (imageUrl != null) {
                if (imageUrl.contains(".mp4")) {
                    viewModel.downloadReel(imageUrl)
                } else {
                    viewModel.downloadPost(imageUrl)
                    Log.i("download123", "download")
                }
            }
        }
    }

    override fun onStop() {
        super.onStop()
        exoPlayer.playWhenReady = false
        exoPlayer.release()
    }
}
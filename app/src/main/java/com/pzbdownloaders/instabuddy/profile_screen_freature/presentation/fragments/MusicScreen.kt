package com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.pzbdownloaders.instabuddy.R
import com.pzbdownloaders.instabuddy.databinding.FragmentMusicScreenBinding
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util.ProfileViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MusicScreen : Fragment() {
    lateinit var binding: FragmentMusicScreenBinding
    lateinit var viewModel: ProfileViewModel
    lateinit var exoPlayer: ExoPlayer
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMusicScreenBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this)[ProfileViewModel::class.java]
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args: MusicScreenArgs by navArgs()
        var musicUrl = args.musicUrl

        exoPlayer = ExoPlayer.Builder(requireContext()).build()

        binding.sidecarMusicPlayer.player = exoPlayer
        var mediaItem = MediaItem.fromUri(musicUrl!!)
        exoPlayer.setMediaItem(mediaItem)
        exoPlayer.prepare()
        exoPlayer.playWhenReady = true

        binding.downloadMusic.setOnClickListener {
            viewModel.downloadMusic(musicUrl)
        }
    }

    override fun onStop() {
        super.onStop()
        exoPlayer.playWhenReady = false
        exoPlayer.release()
    }
}
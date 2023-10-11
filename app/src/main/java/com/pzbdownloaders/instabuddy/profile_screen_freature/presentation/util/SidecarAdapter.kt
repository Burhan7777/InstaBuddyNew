package com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.ui.StyledPlayerView
import com.google.android.material.button.MaterialButton
import com.pzbdownloaders.instabuddy.R
import com.pzbdownloaders.instabuddy.common.presentation.MainActivityViewModel

class SidecarAdapter constructor(
    private val imageUrl: String?,
    private val sideCar: Array<String>?,
    private val context: Context,
    private val exoPlayer: ExoPlayer
) : RecyclerView.Adapter<SidecarAdapter.SidecarViewHolder>() {

    class SidecarViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var imageView = view.findViewById<ImageView>(R.id.sidecarImageView)
        var videoPlayer = view.findViewById<StyledPlayerView>(R.id.sidecarVideoPlayer)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SidecarViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.single_row_sidecar, parent, false)
        return SidecarViewHolder(view)
    }

    override fun onBindViewHolder(holder: SidecarViewHolder, position: Int) {

        if (imageUrl != null) {
            if (imageUrl.contains(".mp4")) {
                holder.videoPlayer.player = exoPlayer
                var mediaItem = MediaItem.fromUri(imageUrl)
                exoPlayer.setMediaItem(mediaItem)
                exoPlayer.prepare()
                holder.videoPlayer.visibility = View.VISIBLE
                exoPlayer.playWhenReady = true
            } else {
                Glide.with(context).load(imageUrl).into(holder.imageView)
            }
        }
        if (sideCar != null) {
            if (sideCar[position].contains(".mp4")) {
                holder.videoPlayer.player = exoPlayer
                var mediaItem = MediaItem.fromUri(sideCar[position])
                exoPlayer.setMediaItem(mediaItem)
                exoPlayer.prepare()
                holder.videoPlayer.visibility = View.VISIBLE
                exoPlayer.playWhenReady = true
            } else {
                Glide.with(context).load(sideCar[position]).into(holder.imageView)
                //     Log.i("sidecar123", imageUrl.toString())
            }
        }
    }

    override fun getItemCount(): Int {
        return sideCar?.size ?: 1
    }
}
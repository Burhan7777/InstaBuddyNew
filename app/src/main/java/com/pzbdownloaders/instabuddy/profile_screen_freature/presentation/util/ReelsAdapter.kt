package com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.pzbdownloaders.instabuddy.R
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.Item
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.fragments.ProfileScreenFragmentDirections
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.fragments.ReelsScreenDirections

class ReelsAdapter(
    private var listOfReels: ArrayList<Item>?,
    private val context: Context,
    private val navController: NavController
) :
    RecyclerView.Adapter<ReelsAdapter.ReelsViewHolder>() {

    fun update(list: ArrayList<Item>?) {
        this.listOfReels = list
        notifyDataSetChanged()
    }

    class ReelsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView = view.findViewById<ImageView>(R.id.reelImageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReelsViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.single_row_reel, parent, false)
        return ReelsViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReelsViewHolder, position: Int) {
        var reel = listOfReels!![position]
        Glide.with(context).load(reel.media.imageVersions2.candidates[0].url).into(holder.imageView)

        holder.imageView.setOnClickListener {
            var action =
                ProfileScreenFragmentDirections.actionProfileScreenFragmentToSidecarViewPager(reel.media.videoVersions[0].url)
            navController.navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return listOfReels?.size ?: 0
    }
}
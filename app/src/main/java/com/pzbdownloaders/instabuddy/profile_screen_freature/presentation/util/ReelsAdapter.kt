package com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
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
        val noOfViews = view.findViewById<TextView>(R.id.noOfViews)
      //  val duration = view.findViewById<TextView>(R.id.durationReel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReelsViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.single_row_reel, parent, false)
        return ReelsViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReelsViewHolder, position: Int) {
        var reel = listOfReels!![position]
        Glide.with(context).load(reel.media.imageVersions2.candidates[0].url).into(holder.imageView)
        if (reel.media.viewCount == null) {
            if(reel.media.playCount?.toInt() in 100000000..999999999 ){
                holder.noOfViews.text = "${reel.media.playCount.toString().substring(0,3)} M"
            }
            else if (reel.media.playCount?.toInt() in 1000000..9999999) {
                holder.noOfViews.text = "${
                    reel.media.playCount.toString().substring(0, 1)
                }.${reel.media.playCount.toString().substring(1, 2)} M"
            } else if (reel.media.playCount?.toInt() in 10000000..99999999) {
                Log.i("millions", "millions")
                holder.noOfViews.text = "${
                    reel.media.playCount.toString().substring(0, 2)
                }.${reel.media.playCount.toString().substring(2, 3)} M"
            } else if (reel.media.playCount?.toInt() in 100000..999999) {
                holder.noOfViews.text = "${reel.media.playCount.toString().substring(0, 3)} K"
                Log.i("millions123", "billions")
            } else {
                holder.noOfViews.text = reel.media.playCount.toString()
            }
        } else {
            if(reel.media.viewCount?.toInt() in 100000000..999999999 ){
                holder.noOfViews.text = "${reel.media.viewCount.toString().substring(0,3)} M"
            }
            else if (reel.media.viewCount?.toInt() in 1000000..9999999) {
                holder.noOfViews.text = "${
                    reel.media.viewCount.toString().substring(0, 1)
                }.${reel.media.viewCount.toString().substring(1, 2)} M"
            } else if (reel.media.viewCount?.toInt() in 10000000..99999999) {
                Log.i("millions", "millions")
                holder.noOfViews.text = "${
                    reel.media.viewCount.toString().substring(0, 2)
                }.${reel.media.viewCount.toString().substring(2, 3)} M"
            } else if (reel.media.viewCount?.toInt() in 100000..999999) {
                holder.noOfViews.text = "${reel.media.viewCount.toString().substring(0, 3)} K"
                Log.i("millions123", "billions")
            } else {
                holder.noOfViews.text = reel.media.viewCount.toString()
            }
        }

     /*   if (reel.media.videoDuration.toInt() in 0..9) {
            holder.duration.text = "0.0${reel.media.videoDuration.toString().substring(0, 1)} s"
        } else if (reel.media.videoDuration.toInt() in 10..59) {
            holder.duration.text = "0.${reel.media.videoDuration.toString().substring(0, 2)} s"
        } else {
            holder.duration.text = reel.media.videoDuration.toString()
        }*/

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
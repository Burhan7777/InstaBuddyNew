package com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.pzbdownloaders.instabuddy.R
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.Edge
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.Edge5
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.fragments.ProfileScreenFragmentDirections

class ProfileAdapter constructor(
    private var listOfPhotos: ArrayList<Edge>?,
    private val context: Context,
    private val navController: NavController
) :
    RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>() {

    class ProfileViewHolder constructor(view: View) : RecyclerView.ViewHolder(view) {
        var imageView = view.findViewById<ImageView>(R.id.profileImageView)
        var muliplePostsIcon = view.findViewById<ImageView>(R.id.multiplePostsIcon)
        var reelIcon = view.findViewById<ImageView>(R.id.reelIcon)
        var likeCount = view.findViewById<TextView>(R.id.likeCount)
    }


    fun update(listOfPhotos1: ArrayList<Edge>?) {
        listOfPhotos = listOfPhotos1
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.single_row_profile, parent, false)
        return ProfileViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        val photo = listOfPhotos!![position]
        Glide.with(context).load(photo.node.thumbnailSrc).into(holder.imageView)
        holder.imageView.setOnClickListener {
            val listOfCars: ArrayList<String> = ArrayList()
            if (photo.node.edgeSidecarToChildren?.edges != null) {
                for (i in photo.node.edgeSidecarToChildren.edges.indices
                    ?: emptyList<Int>().indices) {
                    if (photo.node.edgeSidecarToChildren.edges[i].node.isVideo) {
                        var video = photo.node.edgeSidecarToChildren.edges[i].node.videoUrl + ".mp4"
                        listOfCars.add(video)
                    } else {
                        listOfCars.add(photo.node.edgeSidecarToChildren.edges[i].node.displayResources[2].src)
                    }
                }
                val action =
                    ProfileScreenFragmentDirections.actionProfileScreenFragmentToSidecarViewPager(
                        sidecar = listOfCars.toTypedArray()
                    )
                navController.navigate(action)
            } else {
                var post = ""
                if (photo.node.isVideo) {
                    post = photo.node.videoUrl + ".mp4"
                } else {
                    post = photo.node.displayResources[2].src
                }
                val action =
                    ProfileScreenFragmentDirections.actionProfileScreenFragmentToSidecarViewPager(
                        post
                    )
                navController.navigate(action)
            }
        }
        if (photo.node.typename == "GraphSidecar") {
            holder.muliplePostsIcon.visibility = View.VISIBLE
            holder.reelIcon.visibility = View.INVISIBLE
        } else if (photo.node.typename == "GraphVideo") {
            holder.reelIcon.visibility = View.VISIBLE
            holder.muliplePostsIcon.visibility = View.INVISIBLE
        } else {
            holder.muliplePostsIcon.visibility = View.INVISIBLE
            holder.reelIcon.visibility = View.INVISIBLE
        }

        if (photo.node.edgeMediaPreviewLike.count.toInt() in 100000000..999999999) {
            holder.likeCount.text =
                "${photo.node.edgeMediaPreviewLike.count.toString().substring(0, 3)} M"
        } else if (photo.node.edgeMediaPreviewLike.count?.toInt() in 1000000..9999999) {
            holder.likeCount.text = "${
                photo.node.edgeMediaPreviewLike.count.toString().substring(0, 1)
            }.${photo.node.edgeMediaPreviewLike.count.toString().substring(1, 2)} M"
        } else if (photo.node.edgeMediaPreviewLike.count.toInt() in 10000000..99999999) {
            Log.i("millions", "millions")
            holder.likeCount.text = "${
                photo.node.edgeMediaPreviewLike.count.toString().substring(0, 2)
            }.${photo.node.edgeMediaPreviewLike.count.toString().substring(2, 3)} M"
        } else if (photo.node.edgeMediaPreviewLike.count.toInt() in 100000..999999) {
            holder.likeCount.text =
                "${photo.node.edgeMediaPreviewLike.count.toString().substring(0, 3)} K"
            Log.i("millions123", "billions")
        } else {
            holder.likeCount.text = photo.node.edgeMediaPreviewLike.count.toString()
        }
    }


    override fun getItemCount(): Int {
        return listOfPhotos?.size ?: 0
    }


}
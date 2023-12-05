package com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util

import android.content.Context
import android.opengl.Visibility
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.pzbdownloaders.instabuddy.R
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.Item2Stories
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.ItemStories
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.ItemStory
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.ReelsMedumStories
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.fragments.ProfileScreenFragmentDirections

class StoriesAdapter constructor(
    private var listOfStories: ArrayList<Item2Stories>?,
    private val context: Context,
    private val navController: NavController
) : RecyclerView.Adapter<StoriesAdapter.StoriesViewHolder>() {

    fun update(stories: ArrayList<Item2Stories>?) {
        this.listOfStories = stories
        notifyDataSetChanged()
    }

    class StoriesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var imageView = view.findViewById<ImageView>(R.id.storyImageView)
        var reelIcon = view.findViewById<ImageView>(R.id.reelIconStories)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoriesViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.single_row_stories, parent, false)
        return StoriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: StoriesViewHolder, position: Int) {
        val story = listOfStories!![position]
        Glide.with(context).load(story.imageVersions2.candidates[0].url)
            .into(holder.imageView)

        if (story.videoVersions != null) {
            holder.reelIcon.visibility = View.VISIBLE
        } else {
            holder.reelIcon.visibility = View.INVISIBLE
        }

        holder.imageView.setOnClickListener{
            var post = ""
            if (story.videoVersions != null) {
                post = story.videoVersions[0].url + ".mp4"
            } else {
                post = story.imageVersions2.candidates[0].url
            }
            val action =
                ProfileScreenFragmentDirections.actionProfileScreenFragmentToSidecarViewPager(
                    post
                )
            navController.navigate(action)
        }
    }


    override fun getItemCount(): Int {
        return listOfStories?.size ?: 0
    }
}
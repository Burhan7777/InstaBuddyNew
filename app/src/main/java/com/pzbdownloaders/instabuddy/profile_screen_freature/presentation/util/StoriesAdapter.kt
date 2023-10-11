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
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.ItemStory

class StoriesAdapter constructor(
    private var listOfStories: ArrayList<ItemStory>?,
    private val context: Context,
    private val navController: NavController
) : RecyclerView.Adapter<StoriesAdapter.StoriesViewHolder>() {

    fun update(stories: ArrayList<ItemStory>?) {
        this.listOfStories = stories
        notifyDataSetChanged()
    }

    class StoriesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var imageView = view.findViewById<ImageView>(R.id.storyImageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoriesViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.single_row_stories, parent, false)
        return StoriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: StoriesViewHolder, position: Int) {
        val story = listOfStories!![position]
        Glide.with(context).load(story.imageVersions2.candidates[0].url).into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return listOfStories?.size ?: 0
    }
}
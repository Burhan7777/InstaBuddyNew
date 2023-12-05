package com.pzbdownloaders.instabuddy.main_screen.presentation.util

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.facebook.shimmer.ShimmerFrameLayout
import com.pzbdownloaders.instabuddy.R
import com.pzbdownloaders.instabuddy.main_screen.data.model.UserSearch
import com.pzbdownloaders.instabuddy.main_screen.data.model.Users
import com.pzbdownloaders.instabuddy.main_screen.presentation.fragments.BatchDownloadFragmentDirections
import com.pzbdownloaders.instabuddy.main_screen.presentation.fragments.FragmentViewPager
import com.pzbdownloaders.instabuddy.main_screen.presentation.fragments.FragmentViewPagerDirections

class SearchAdapter constructor(
    private var listOfUsers: ArrayList<UserSearch>?,
    private var context: Context,
    private val navController: NavController
) : RecyclerView.Adapter<SearchAdapter.SearchViewHolder>() {

    class SearchViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var profilePicture: ImageView = view.findViewById(R.id.profilePictureImageView)
        var fullName: TextView = view.findViewById(R.id.nameTextView)
        var userName: TextView = view.findViewById(R.id.usernameTextView)
        var instagramCheck: ImageView = view.findViewById(R.id.instagramCheck)
        var cardView: CardView = view.findViewById(R.id.searchCardView)


    }

    fun updateListOfUsers(listOfUsers: ArrayList<UserSearch>?) {
        this.listOfUsers = listOfUsers
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.single_row_search, parent, false)
        return SearchViewHolder(view)
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        var user = listOfUsers!![position]
        Glide.with(context).load(user.user.profilePicUrl).circleCrop().into(holder.profilePicture)
        holder.fullName.text = user.user.fullName
        holder.userName.text = user.user.username
        if (user.user.isVerified) {
            holder.instagramCheck.visibility = View.VISIBLE
        } else {
            holder.instagramCheck.visibility = View.INVISIBLE
        }

        holder.cardView.setOnClickListener {
            val action = FragmentViewPagerDirections.actionFragmentViewPagerToProfileScreenFragment(
                user.user.profilePicUrl,
                user.user.username,
                user.user.pkId
            )
            navController.navigate(action)
        }

    }

    override fun getItemCount(): Int {
        return listOfUsers?.size ?: 0
    }
}
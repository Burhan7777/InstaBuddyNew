package com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.fragments.PostsScreen
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.fragments.ReelsScreen
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.fragments.StoryScreen

class ProfileViewPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    var listOfFragments: ArrayList<Fragment> = ArrayList()
    var listOfNames: ArrayList<String> = ArrayList()
    var username: String? = null
    var id: String? = null

    fun addFragments(fragment: Fragment, name: String) {
        listOfFragments.add(fragment)
        listOfNames.add(name)
    }

    fun getData(name: String) {
        username = name
    }

    /*    override fun getCount(): Int {
            return listOfFragments.size
        }

        override fun getItem(position: Int): Fragment {
            return listOfFragments[position]
        }

        override fun getPageTitle(position: Int): CharSequence {
            return listOfNames[position]
        }*/

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                var postsScreen = PostsScreen()
                var bundle = Bundle()
                bundle.putString("username", username)
                bundle.putString("id", id)
                postsScreen.arguments = bundle
                postsScreen
            }

            1 -> {
                var reelsScreen = ReelsScreen()
                var bundle = Bundle()
                bundle.putString("username", username)
                bundle.putString("id", id)
                reelsScreen.arguments = bundle
                reelsScreen
            }

            2 -> {
                var storyScreen = StoryScreen()
                var bundle = Bundle()
                bundle.putString("username", username)
                bundle.putString("id", id)
                storyScreen.arguments = bundle
                storyScreen
            }

            else -> {
                ReelsScreen()
            }
        }
    }
}
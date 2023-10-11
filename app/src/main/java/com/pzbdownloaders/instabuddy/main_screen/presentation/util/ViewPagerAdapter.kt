package com.pzbdownloaders.instabuddy.main_screen.presentation.util

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

open class ViewPagerAdapter(activity: FragmentActivity) :
    FragmentStateAdapter(activity) {

    var listOfFragments: ArrayList<Fragment> = ArrayList()

    override fun getItemCount(): Int {
      return listOfFragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return listOfFragments[position]
    }

    fun addFragments(fragment: Fragment){
        listOfFragments.add(fragment)
    }


}



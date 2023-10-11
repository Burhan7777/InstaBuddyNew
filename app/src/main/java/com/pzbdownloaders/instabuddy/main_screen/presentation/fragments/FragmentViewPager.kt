package com.pzbdownloaders.instabuddy.main_screen.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.pzbdownloaders.instabuddy.databinding.FragmentViewPagerBinding
import com.pzbdownloaders.instabuddy.main_screen.presentation.util.ViewPagerAdapter


class FragmentViewPager : Fragment() {
    lateinit var viewPagerAdapter: ViewPagerAdapter
    lateinit var binding: FragmentViewPagerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentViewPagerBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as AppCompatActivity).setSupportActionBar(binding.mainToolbar)
        viewPagerAdapter = ViewPagerAdapter(activity = requireActivity())
        viewPagerAdapter.addFragments(HomeScreenFragment())
        viewPagerAdapter.addFragments(BatchDownloadFragment())
        binding.viewPager.adapter = viewPagerAdapter
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            if (position == 0)
                tab.text = "Home"
            if (position == 1)
                tab.text = "Batch Download"

        }.attach()
    }
}
package com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.google.android.material.tabs.TabLayoutMediator
import com.pzbdownloaders.instabuddy.R
import com.pzbdownloaders.instabuddy.common.presentation.MainActivityViewModel
import com.pzbdownloaders.instabuddy.databinding.FragmentProfileScreenBinding
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllPosts
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.Data
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.Edge
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util.ProfileAdapter
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util.ProfileViewModel
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util.ProfileViewPagerAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileScreenFragment : Fragment() {
    lateinit var binding: FragmentProfileScreenBinding
    lateinit var viewModel: ProfileViewModel
    var listOfPhotos: ArrayList<Edge>? = ArrayList()
    lateinit var adapter: ProfileAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentProfileScreenBinding.inflate(layoutInflater, container, false)
        viewModel = ViewModelProvider(requireActivity())[ProfileViewModel::class.java]
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.collapsingToolbar.isTitleEnabled = false
        (requireActivity() as AppCompatActivity).setSupportActionBar(binding.profileToolbar)
        adapter = ProfileAdapter(listOfPhotos, requireContext(), findNavController())
        val args: ProfileScreenFragmentArgs by navArgs()
        var username = args.username
        var profilePictureUrl = args.profileUrl
        var bundle = Bundle()
        bundle.putString("username", username)
        var postScreen = PostsScreen()
        postScreen.arguments = bundle

        (requireActivity() as AppCompatActivity).supportActionBar?.title = username

        Glide.with(requireActivity()).load(profilePictureUrl).circleCrop().into(binding.profileDp)
       // binding.profilerUsername.text = username

        var profileViewPagerAdapter = ProfileViewPagerAdapter(requireActivity())
        profileViewPagerAdapter.username = username
        binding.profileViewPager.adapter = profileViewPagerAdapter
      //  binding.profileViewPager.isSaveEnabled = false

        TabLayoutMediator(binding.profileTabLayout, binding.profileViewPager) { tab, position ->
            if (position == 0)
                tab.text = "Posts"
            if (position == 1)
                tab.text = "Reels"
            if (position == 2)
                tab.text = "Stories"

        }.attach()

        viewModel.getPosts.observe(requireActivity()) {

        }

        binding.instagramProfile.setOnClickListener {
            Intent(Intent.ACTION_VIEW).apply {
                this.data = Uri.parse("https://www.instagram.com/$username/")
            }.also {
                requireActivity().startActivity(it)
            }
        }
    }
}
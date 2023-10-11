package com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.pzbdownloaders.instabuddy.R
import com.pzbdownloaders.instabuddy.databinding.FragmentStoryScreenBinding
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.Item
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.ItemStory
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util.ProfileViewModel
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util.ReelsAdapter
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util.StoriesAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StoryScreen : Fragment() {

    lateinit var binding: FragmentStoryScreenBinding
    lateinit var viewModel: ProfileViewModel
    lateinit var adapter: StoriesAdapter
    var listOfStories: ArrayList<ItemStory>? = ArrayList()
    private var username: String? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentStoryScreenBinding.inflate(layoutInflater, container, false)
        viewModel = ViewModelProvider(this)[ProfileViewModel::class.java]
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val arguments = arguments
        username = arguments?.getString("username")

        viewModel.getUserId("https://apiprofi.com/api/user_id?user=$username")

        viewModel.getUserId.observe(requireActivity()) {
        //    viewModel.getStories("https://apiprofi.com/api/stories?id_user=${it?.id}")
        }

        viewModel.getStories.observe(requireActivity()) {
            listOfStories = it?.reels?.n491527077?.items?.toCollection(ArrayList())
            adapter.update(listOfStories)
            binding.profileShimmerStory1.visibility = View.INVISIBLE
            binding.profileShimmerStory2.visibility = View.INVISIBLE
            binding.profileShimmerStory3.visibility = View.INVISIBLE
            binding.profileShimmerStory4.visibility = View.INVISIBLE

            binding.profileStoryRecyclerView.visibility = View.VISIBLE
        }

        //  binding.profileVideoNextButton.text = "Next reels available"
        adapter = StoriesAdapter(listOfStories, requireContext(), findNavController())
        binding.profileStoryRecyclerView.layoutManager = GridLayoutManager(requireContext(), 3)
        binding.profileStoryRecyclerView.adapter = adapter

        binding.profileShimmerStory1.startShimmerAnimation()
        binding.profileShimmerStory2.startShimmerAnimation()
        binding.profileShimmerStory3.startShimmerAnimation()
        binding.profileShimmerStory4.startShimmerAnimation()
        binding.profileStoryRecyclerView.visibility = View.INVISIBLE

        //     binding.profileVideoNextButton.startAnimation()
    }
}
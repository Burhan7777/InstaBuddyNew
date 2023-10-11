package com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.pzbdownloaders.instabuddy.R
import com.pzbdownloaders.instabuddy.databinding.FragmentPostsScreenBinding
import com.pzbdownloaders.instabuddy.databinding.FragmentReelsScreenBinding
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.Edge
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.Item
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util.ProfileAdapter
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util.ProfileViewModel
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util.ReelsAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ReelsScreen : Fragment() {
    lateinit var binding: FragmentReelsScreenBinding
    lateinit var viewModel: ProfileViewModel
    lateinit var adapter: ReelsAdapter
    var listOfReels: ArrayList<Item>? = ArrayList()
    private var username: String? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentReelsScreenBinding.inflate(layoutInflater, container, false)
        viewModel = ViewModelProvider(this)[ProfileViewModel::class.java]
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var arguments = arguments
        username = arguments?.getString("username")
        var check = true
        var checkNextPost = true
        var someCheck = false
        Log.i("username123", username.toString())

        viewModel.getReels("https://apiprofi.com/api/reels_posts_username?user=$username")

        binding.profileVideoNextButton.text = "Next reels available"
        adapter = ReelsAdapter(listOfReels, requireContext(), findNavController())
        binding.profileVideoRecyclerView.layoutManager = GridLayoutManager(requireContext(), 3)
        binding.profileVideoRecyclerView.adapter = adapter
        binding.profileShimmerVideo1.startShimmerAnimation()
        binding.profileShimmerVideo2.startShimmerAnimation()
        binding.profileShimmerVideo3.startShimmerAnimation()
        binding.profileShimmerVideo4.startShimmerAnimation()

        binding.profileVideoNextButton.startAnimation()

        viewModel.getReels.observe(requireActivity()) {

            Log.i("data123", "changed")
            binding.profileShimmerVideo1.visibility = View.INVISIBLE
            binding.profileShimmerVideo2.visibility = View.INVISIBLE
            binding.profileShimmerVideo3.visibility = View.INVISIBLE
            binding.profileShimmerVideo4.visibility = View.INVISIBLE

            binding.profileVideoRecyclerView.visibility = View.VISIBLE
            //binding.controlVideoButtonsRoot.visibility = View.VISIBLE
            binding.profileVideoNextButton.visibility = View.VISIBLE
            binding.profileVideoPreviousButton.visibility = View.VISIBLE

            listOfReels = it?.items?.toCollection(ArrayList())
            if (check) {
                adapter.update(listOfReels)
            }

        }

        viewModel.getReelsResponse.observe(requireActivity()) {
            //   if (it == "Response 200") {
            if (checkNextPost) {
                check = false
                var maxId =
                    viewModel.getReels.value?.pagingInfo?.maxId
                viewModel.getReels("https://apiprofi.com/api/reels_posts_username?user=$username&max_id=$maxId")
            }
            checkNextPost = false
        }

        viewModel.getReelsAddedResponse.observe(requireActivity()) {
            Log.i("viewmodel123", it.toString())
            if (viewModel.getReelsAddedResponse.value == "1") {
                return@observe
            } else {
                binding.profileVideoNextButton.revertAnimation()
                binding.profileVideoNextButton.background =
                    ResourcesCompat.getDrawable(
                        resources,
                        R.drawable.download_button_background,
                        null
                    )
            }
        }


        // }
        //   if (viewModel.getPostsResponse.value == "Response 200") {
        //    viewModel.getPosts.observe(this) {
        //  if (viewModel.getPostsAddedResponse.value == "2") {
        binding.profileVideoNextButton.setOnClickListener {
            binding.profileVideoNextButton.startAnimation()
            adapter.update(
                viewModel.getReels.value?.items?.toCollection(ArrayList())
            )
            checkNextPost = true
            viewModel.getReelsResponse.value = ""
            binding.profileVideoRecyclerView.visibility = View.VISIBLE
            //  }
            Log.i("number123", viewModel.getPostsAddedResponse.value.toString())
        }

    }
}
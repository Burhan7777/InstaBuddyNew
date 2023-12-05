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
import androidx.recyclerview.widget.LinearLayoutManager
import com.pzbdownloaders.instabuddy.R
import com.pzbdownloaders.instabuddy.databinding.FragmentPostsScreenBinding
import com.pzbdownloaders.instabuddy.databinding.FragmentReelsScreenBinding
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllReelsRawData
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.Edge
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.Item
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.ItemAllReel
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util.ProfileAdapter
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util.ProfileViewModel
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util.ReelsAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ReelsScreen : Fragment() {
    lateinit var binding: FragmentReelsScreenBinding
    lateinit var viewModel: ProfileViewModel
    lateinit var adapter: ReelsAdapter
    var listOfReels: ArrayList<ItemAllReel>? = ArrayList()
    private var username: String? = null
    var id: Long? = null
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
        id = arguments?.getString("id")?.toLong()
        var check = true
        var checkNextPost = true
        var someCheck = false
        Log.i("username123", id.toString())

        //  viewModel.getReels("https://apiprofi.com/api/reels_posts_username?user=$username")

        val allReelsRawData = AllReelsRawData(
            id!!, 12
        )

        viewModel.getReels(allReelsRawData)

        binding.profileVideoNextButton.text = "Next reels available"
        adapter = ReelsAdapter(listOfReels, requireContext(), findNavController())
        binding.profileVideoRecyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
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
            binding.profileVideoNextButton.visibility = View.VISIBLE
            //  binding.controlVideoButtonsRoot.visibility = View.VISIBLE

            listOfReels = it?.response?.body?.items?.toCollection(ArrayList())
            if (check) {
                adapter.update(listOfReels)
            }

        }

        viewModel.getReelsResponse.observe(requireActivity()) {
            //   if (it == "Response 200") {
            if (checkNextPost) {
                check = false
                var maxId =
                    viewModel.getReels.value?.response?.body?.pagingInfo?.maxId
                val allReelsRawData1 = AllReelsRawData(
                    id!!, 48, maxId
                )
                //        viewModel.getReels("https://apiprofi.com/api/reels_posts_username?user=$username&max_id=$maxId")
                viewModel.getReels(allReelsRawData1)
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
            binding.reelNestedScrollView.smoothScrollTo(0, binding.profileVideoRecyclerView.top)
            (binding.profileVideoRecyclerView.layoutManager as LinearLayoutManager).smoothScrollToPosition(
                binding.profileVideoRecyclerView,
                null,
                0
            )
            adapter.update(
                viewModel.getReels.value?.response?.body?.items?.toCollection(ArrayList())
            )
            checkNextPost = true
            viewModel.getReelsResponse.value = ""
            binding.profileVideoRecyclerView.visibility = View.VISIBLE
            //  }
            Log.i("number123", viewModel.getPostsAddedResponse.value.toString())
        }

    }
}
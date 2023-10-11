package com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavArgument
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import com.pzbdownloaders.instabuddy.R
import com.pzbdownloaders.instabuddy.databinding.FragmentPostsScreenBinding
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.Edge
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util.ProfileAdapter
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util.ProfileViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PostsScreen : Fragment() {
    lateinit var binding: FragmentPostsScreenBinding
    lateinit var viewModel: ProfileViewModel
    lateinit var adapter: ProfileAdapter
    var listOfPhotos: ArrayList<Edge>? = ArrayList()
    private var username: String? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentPostsScreenBinding.inflate(layoutInflater, container, false)
        viewModel = ViewModelProvider(this)[ProfileViewModel::class.java]

        return binding.root
    }

    override fun onStart() {
        super.onStart()
        Log.i("started", "started")
    }

    override fun onResume() {
        super.onResume()
        if(viewModel.getPostsAddedResponse.value?.toInt() == 2){
            binding.profileNextButton.revertAnimation()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var arguments = arguments
        username = arguments?.getString("username")
        var check = true
        var checkNextPost = true
        var someCheck = false
        Log.i("username123", username.toString())



        viewModel.getPosts("https://apiprofi.com/api/posts_username?user=$username")

        binding.profileNextButton.text = "Next posts available"
        adapter = ProfileAdapter(listOfPhotos, requireContext(), findNavController())
        binding.profileRecyclerView.layoutManager = GridLayoutManager(requireContext(), 3)
        binding.profileRecyclerView.adapter = adapter
        binding.profileShimmer1.startShimmerAnimation()
        binding.profileShimmer2.startShimmerAnimation()
        binding.profileShimmer3.startShimmerAnimation()
        binding.profileShimmer4.startShimmerAnimation()

        binding.profileNextButton.startAnimation()

        viewModel.getPosts.observe(requireActivity()) {

            Log.i("data123", "changed")
            binding.profileShimmer1.visibility = View.INVISIBLE
            binding.profileShimmer2.visibility = View.INVISIBLE
            binding.profileShimmer3.visibility = View.INVISIBLE
            binding.profileShimmer4.visibility = View.INVISIBLE

            binding.profileRecyclerView.visibility = View.VISIBLE
            binding.controlButtonsRoot.visibility = View.VISIBLE

            listOfPhotos =
                it?.data?.user?.edgeOwnerToTimelineMedia?.edges?.toCollection(ArrayList())
            Log.i("posts123", it?.data?.user?.edgeOwnerToTimelineMedia?.edges?.size.toString())
            if (check) {
                adapter.update(listOfPhotos)
            }

        }

        viewModel.getPostsResponse.observe(requireActivity()) {
            //   if (it == "Response 200") {
            if (checkNextPost) {
                check = false
                var endCursor =
                    viewModel.getPosts.value?.data?.user?.edgeOwnerToTimelineMedia?.pageInfo?.endCursor
                viewModel.getPosts("https://apiprofi.com/api/posts_username?user=$username&end_cursor=$endCursor")
            }
            checkNextPost = false
        }

        viewModel.getPostsAddedResponse.observe(requireActivity()) {
            Log.i("viewmodel123", it.toString())
            if (viewModel.getPostsAddedResponse.value == "1") {
                return@observe
            } else {
                binding.profileNextButton.revertAnimation()
                binding.profileNextButton.background =
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
        binding.profileNextButton.setOnClickListener {
            binding.profileNextButton.startAnimation()
            adapter.update(
                viewModel.getPosts.value?.data?.user?.edgeOwnerToTimelineMedia?.edges?.toCollection(
                    ArrayList()
                )
            )
            checkNextPost = true
            viewModel.getPostsResponse.value = ""
            binding.profileRecyclerView.visibility = View.VISIBLE
            //  }
            Log.i("number123", viewModel.getPostsAddedResponse.value.toString())
        }

    }
}

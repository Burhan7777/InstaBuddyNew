package com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.fragments

import android.opengl.Visibility
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
import androidx.recyclerview.widget.LinearLayoutManager
import com.pzbdownloaders.instabuddy.R
import com.pzbdownloaders.instabuddy.databinding.FragmentPostsScreenBinding
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.AllPostsRawData
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.Edge
import com.pzbdownloaders.instabuddy.profile_screen_freature.data.model.ItemAllPosts
import com.pzbdownloaders.instabuddy.profile_screen_freature.domain.util.ResponseNumbers
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util.ProfileAdapter
import com.pzbdownloaders.instabuddy.profile_screen_freature.presentation.util.ProfileViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking

@AndroidEntryPoint
class PostsScreen : Fragment() {
    lateinit var binding: FragmentPostsScreenBinding
    lateinit var viewModel: ProfileViewModel
    lateinit var adapter: ProfileAdapter
    var listOfPhotos: ArrayList<ItemAllPosts>? = ArrayList()
    var endCursor: String = ""
    private var username: String? = null
    var id: Long? = null
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
        if (viewModel.getPostsAddedResponse.value?.toInt() == 2) {
            binding.profileNextButton.revertAnimation()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var arguments = arguments
        username = arguments?.getString("username")
        id = arguments?.getString("id")?.toLong()
        var check = true
        var checkNextPost = true
        var checkOfFailureOfNextPost = true
        Log.i("username123", id.toString())

        var allPostsRawData = AllPostsRawData(
            id = id!!,
            count = 12
        )

        // viewModel.getPosts("https://apiprofi.com/api/posts_username?user=$username")
        viewModel.getPosts(allPostsRawData)

        binding.profileNextButton.text = "Next posts available"
        adapter = ProfileAdapter(listOfPhotos, requireContext(), findNavController())
        binding.profileRecyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.profileRecyclerView.adapter = adapter
        startAnimation()

        binding.profileNextButton.startAnimation()

        viewModel.getPosts.observe(requireActivity()) {

            Log.i("data123", "changed")
            invisibleShimmerEffect()

            binding.profileRecyclerView.visibility = View.VISIBLE
            //   binding.controlButtonsRoot.visibility = View.VISIBLE
            binding.profileNextButton.visibility = View.VISIBLE
            //  binding.profilePreviousButton.visibility = View.VISIBLE

            listOfPhotos =
                it?.response?.body?.items?.toCollection(ArrayList())
            /*  Log.i("posts123", it?.data?.user?.edgeOwnerToTimelineMedia?.edges?.size.toString())
              Log.i("check123", check.toString())
              Log.i("check123456", checkOfFailureOfNextPost.toString())*/
            if (viewModel.getPosts.value?.response?.body?.nextMaxId != null) {
                endCursor =
                    viewModel.getPosts.value?.response?.body?.nextMaxId
                        ?: "Nothing"
            }
            if (check) {
                adapter.update(listOfPhotos)
                Log.i("burhan123", "burhan")
            }
        }

        viewModel.getPostsResponse.observe(requireActivity()) {
            //   if (it == "Response 200") {


            if (checkNextPost && it != "Failed to connect" && it != "Failed to connect next") {
                var endCursor =
                    viewModel.getPosts.value?.response?.body?.nextMaxId
                var allPostsRawData1 = AllPostsRawData(
                    id = id!!,
                    count = 48,
                    max_id = endCursor
                )
                viewModel.getPosts(allPostsRawData1)
                check = false
                checkOfFailureOfNextPost = true
                Log.i("endcursor123", endCursor.toString())
            }
            checkNextPost = false
            Log.i("connect123", it.toString())

            if (it == "Failed to connect") {
                binding.failedToConnectServerPostTv.visibility = View.VISIBLE
                binding.retryButtonPosts.visibility = View.VISIBLE
                if (binding.profileRecyclerView.visibility == View.VISIBLE)
                    binding.profileRecyclerView.visibility = View.INVISIBLE
                if (binding.profileNextButton.visibility == View.VISIBLE)
                    binding.profileNextButton.visibility = View.INVISIBLE

                Log.i("failed456", "failed456")
            }
            if (it == "Failed to connect next" && viewModel.getPostsAddedResponse.value?.toInt() != 0) {
                checkOfFailureOfNextPost = false
                binding.profileNextButton.revertAnimation()
                binding.profileNextButton.text = "Failed loading next posts. Click to try again"
                Log.i("failed123", "failed123")

            }
        }

        binding.retryButtonPosts.setOnClickListener {
            check = true
            checkNextPost = true

            if (ResponseNumbers.loadingFailed) {
                viewModel.getPosts(allPostsRawData)
                Log.i("endcursor789", endCursor.toString())

            } else if (ResponseNumbers.loadingFailedNextPost) {
                val allPostsRawData2 = AllPostsRawData(
                    id!!, 48, endCursor
                )
                viewModel.getPosts(allPostsRawData2)
                Log.i("endcursor789", endCursor.toString())
            }
            visibleShimmerEffect()
            binding.failedToConnectServerPostTv.visibility = View.INVISIBLE
            binding.retryButtonPosts.visibility = View.INVISIBLE

            startAnimation()
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
            binding.postScrollView.smoothScrollTo(0, binding.profileRecyclerView.top)
            (binding.profileRecyclerView.layoutManager as LinearLayoutManager).smoothScrollToPosition(
                binding.profileRecyclerView,
                null,
                0
            )
            if (viewModel.getPostsResponse.value == "Failed to connect next") {
                if (binding.profileRecyclerView.visibility == View.VISIBLE)
                    binding.profileRecyclerView.visibility = View.INVISIBLE
                if (binding.profileNextButton.visibility == View.VISIBLE)
                    binding.profileNextButton.visibility = View.INVISIBLE


                binding.failedToConnectServerPostTv.visibility = View.INVISIBLE
                binding.retryButtonPosts.visibility = View.INVISIBLE

                visibleShimmerEffect()
                startAnimation()

                //      var endCursor = viewModel.getPosts.value?.data?.user?.edgeOwnerToTimelineMedia?.pageInfo?.endCursor
                //    endCursor =
                //     viewModel.getPosts.value?.data?.user?.edgeOwnerToTimelineMedia?.pageInfo?.endCursor
                Log.i("endcursor1111", endCursor.toString())

                val allPostsRawData3 = AllPostsRawData(id!!, 48, endCursor)

                viewModel.getPosts(allPostsRawData3)
                checkNextPost = true
                check = true
                Log.i("nextpost123", viewModel.getPosts.value.toString())
                viewModel.getPostsResponse.value = ""
                ResponseNumbers.responseNumberPosts = 0
            } else {
                adapter.update(
                    viewModel.getPosts.value?.response?.body?.items?.toCollection(
                        ArrayList()
                    )
                )
                checkNextPost = true
                viewModel.getPostsResponse.value = ""
            }
            //  binding.profileRecyclerView.visibility = View.VISIBLE


            //  }
            Log.i("number123", viewModel.getPostsAddedResponse.value.toString())
        }

    }

    private fun startAnimation() {
        binding.profileShimmer1.startShimmerAnimation()
        binding.profileShimmer2.startShimmerAnimation()
        binding.profileShimmer3.startShimmerAnimation()
        binding.profileShimmer4.startShimmerAnimation()
    }

    private fun visibleShimmerEffect() {
        binding.profileShimmer1.visibility = View.VISIBLE
        binding.profileShimmer2.visibility = View.VISIBLE
        binding.profileShimmer3.visibility = View.VISIBLE
        binding.profileShimmer4.visibility = View.VISIBLE
    }

    private fun invisibleShimmerEffect() {
        binding.profileShimmer1.visibility = View.INVISIBLE
        binding.profileShimmer2.visibility = View.INVISIBLE
        binding.profileShimmer3.visibility = View.INVISIBLE
        binding.profileShimmer4.visibility = View.INVISIBLE
    }

}
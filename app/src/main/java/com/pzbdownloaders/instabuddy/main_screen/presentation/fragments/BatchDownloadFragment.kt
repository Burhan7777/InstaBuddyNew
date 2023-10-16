package com.pzbdownloaders.instabuddy.main_screen.presentation.fragments

import android.content.Context
import android.content.Context.INPUT_METHOD_SERVICE
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import androidx.compose.runtime.key
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.pzbdownloaders.instabuddy.common.presentation.MainActivityViewModel
import com.pzbdownloaders.instabuddy.databinding.FragmentBatchDownloadBinding
import com.pzbdownloaders.instabuddy.main_screen.data.model.SearchHistory
import com.pzbdownloaders.instabuddy.main_screen.data.model.Users
import com.pzbdownloaders.instabuddy.main_screen.presentation.util.SearchAdapter


class BatchDownloadFragment : Fragment() {
    lateinit var binding: FragmentBatchDownloadBinding
    lateinit var viewModel: MainActivityViewModel
    var listOfUsers: ArrayList<Users>? = ArrayList()
    lateinit var adapter: SearchAdapter
    lateinit var navController: NavController
    lateinit var searchHistoryAdapter: SearchHistoryAdapter
    var history: ArrayList<SearchHistory> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewModel = ViewModelProvider(requireActivity())[MainActivityViewModel::class.java]
        binding = FragmentBatchDownloadBinding.inflate(inflater, container, false)
        navController = findNavController()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.searchEdittext.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                viewModel.getSearchResults("https://apiprofi.com/api/search?user=${binding.searchEdittext.text.toString()}")
                binding.shimmerLayout.visibility = View.VISIBLE
                binding.shimmerLayout1.visibility = View.VISIBLE
                binding.shimmerLayout2.visibility = View.VISIBLE
                binding.shimmerLayout3.visibility = View.VISIBLE
                binding.shimmerLayout4.visibility = View.VISIBLE
                binding.shimmerLayout5.visibility = View.VISIBLE
                binding.shimmerLayout.startShimmerAnimation()
                binding.shimmerLayout1.startShimmerAnimation()
                binding.shimmerLayout2.startShimmerAnimation()
                binding.shimmerLayout3.startShimmerAnimation()
                binding.shimmerLayout4.startShimmerAnimation()
                binding.shimmerLayout5.startShimmerAnimation()
                view.clearFocus()
                val imm = view.context?.getSystemService(Context.INPUT_METHOD_SERVICE)
                        as InputMethodManager
                imm.hideSoftInputFromWindow(view.windowToken, 0)
                binding.searchRecyclerView.visibility = View.GONE
                binding.searchHistory.visibility = View.INVISIBLE

                insertIntoSearchHistory(binding.searchEdittext.text.toString())
            }
            true
        }
        viewModel.searchResults.observe(requireActivity()) {
            listOfUsers = it?.users?.toCollection(ArrayList())
            adapter.updateListOfUsers(listOfUsers)
            binding.shimmerLayout.visibility = View.INVISIBLE
            binding.shimmerLayout1.visibility = View.INVISIBLE
            binding.shimmerLayout2.visibility = View.INVISIBLE
            binding.shimmerLayout3.visibility = View.INVISIBLE
            binding.shimmerLayout4.visibility = View.INVISIBLE
            binding.shimmerLayout5.visibility = View.INVISIBLE
            binding.searchRecyclerView.visibility = View.VISIBLE
        }
        adapter = SearchAdapter(listOfUsers, requireContext(), navController)
        binding.searchRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.searchRecyclerView.adapter = adapter

        binding.searchEdittext.setOnFocusChangeListener { view, b ->
            binding.searchHistory.visibility = View.VISIBLE
        }

        searchHistoryAdapter = SearchHistoryAdapter(history, viewModel)
        binding.searchHistoryRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.searchHistoryRecyclerView.adapter = searchHistoryAdapter
        viewModel.getHistory().observe(requireActivity()) {
            searchHistoryAdapter.update(it.toCollection(ArrayList()))
        }

        viewModel.getHistory().observe(requireActivity()) {
            if (it.isEmpty()) {
                binding.searchHistory.visibility = View.INVISIBLE
            }
        }

        binding.deleteHistory.setOnClickListener {
            viewModel.deleteAll()
        }

        binding.searchEdittext.setOnClickListener {
            binding.searchHistory.visibility = View.VISIBLE
        }

        viewModel.searchUserName.observe(requireActivity()) {
            Log.i("login","login")
            viewModel.getSearchResults("https://apiprofi.com/api/search?user=${viewModel.searchUserName.value}")
            binding.searchEdittext.setText(viewModel.searchUserName.value)
            binding.searchHistory.visibility = View.INVISIBLE
            //  viewModel.sendSearchRequest.value = false
            binding.shimmerLayout.visibility = View.VISIBLE
            binding.shimmerLayout1.visibility = View.VISIBLE
            binding.shimmerLayout2.visibility = View.VISIBLE
            binding.shimmerLayout3.visibility = View.VISIBLE
            binding.shimmerLayout4.visibility = View.VISIBLE
            binding.shimmerLayout5.visibility = View.VISIBLE
            binding.shimmerLayout.startShimmerAnimation()
            binding.shimmerLayout1.startShimmerAnimation()
            binding.shimmerLayout2.startShimmerAnimation()
            binding.shimmerLayout3.startShimmerAnimation()
            binding.shimmerLayout4.startShimmerAnimation()
            binding.shimmerLayout5.startShimmerAnimation()
            binding.searchRecyclerView.visibility = View.GONE

        }

        binding.hideSearchHistory.setOnClickListener {
            binding.searchHistory.visibility = View.INVISIBLE
        }
    }

    private fun insertIntoSearchHistory(username: String) {
        val searchHistory = SearchHistory(0, username)
        viewModel.insertUserName(searchHistory)
    }
}
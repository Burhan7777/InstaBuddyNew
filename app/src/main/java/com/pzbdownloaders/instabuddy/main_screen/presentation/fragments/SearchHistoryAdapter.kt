package com.pzbdownloaders.instabuddy.main_screen.presentation.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.pzbdownloaders.instabuddy.R
import com.pzbdownloaders.instabuddy.common.presentation.MainActivityViewModel
import com.pzbdownloaders.instabuddy.main_screen.data.model.SearchHistory

class SearchHistoryAdapter constructor(
    private var history: ArrayList<SearchHistory>,
    private val viewModel: MainActivityViewModel
) :
    RecyclerView.Adapter<SearchHistoryAdapter.SearchHistoryViewHolder>() {


    fun update(history: ArrayList<SearchHistory>) {
        this.history = history
        notifyDataSetChanged()
    }

    class SearchHistoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var searchName: TextView = view.findViewById(R.id.searchHistoryUsername)
        var clearImageView = view.findViewById<ImageView>(R.id.searchHistoryClear)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchHistoryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.single_row_search_history, parent, false)
        return SearchHistoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: SearchHistoryViewHolder, position: Int) {
        holder.searchName.text = history[position].userName
        holder.clearImageView.setOnClickListener {
            viewModel.deleteUserName(history[position].userName)
        }
    }

    override fun getItemCount(): Int {
        return history.size
    }
}
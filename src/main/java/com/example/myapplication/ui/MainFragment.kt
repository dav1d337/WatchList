package com.example.myapplication.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.App
import com.example.myapplication.R
import com.example.myapplication.utils.BaseFragment
import kotlinx.android.synthetic.main.fragment_movies.*

class MainFragment: BaseFragment<MainViewModel>() {

    private var rootView: View? = null
    private val adapter = MainAdapter(listOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(R.layout.fragment_movies, container, false)
        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        (context?.applicationContext as App).applicationComponent.inject(this)

        viewModel.popularMovies.observe(this, Observer {
            adapter.replaceData(it.movies)
        })

        super.onActivityCreated(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        movies_recycler_view.adapter = adapter
        //movies_recycler_view.addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.HORIZONTAL))

    }
}
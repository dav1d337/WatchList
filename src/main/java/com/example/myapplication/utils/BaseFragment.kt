package com.example.myapplication.utils

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import javax.inject.Inject

abstract class BaseFragment<T : ViewModel>(
    @LayoutRes val layoutRes: Int? = null
) : Fragment() {

    @Inject
    lateinit var viewModel: T

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        AndroidInjection.inject(this)

        viewModel.let {
            val viewModelFactory = it.createFactory()
            ViewModelProviders.of(this, viewModelFactory).get(it.javaClass)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if (layoutRes != null) {
            return inflater.inflate(layoutRes, container, false)

        } else {
            return super.onCreateView(inflater, container, savedInstanceState)
        }
    }

//    fun onActivityCreated(@Nullable savedInstanceState: Bundle) {
//        super.onActivityCreated(savedInstanceState)
//        val viewModelFactory = ViewModelUtil.createFor(viewModel)
//        ViewModelProviders.of(this, viewModelFactory).get(viewModel!!.getClass())
//    }
}
package com.ennoblesoft.kotlinoverview.base.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.ennoblesoft.kotlinoverview.base.utils.autoCleared

abstract class BaseFragment<T: Any> : Fragment() {

    var binding: ViewDataBinding by autoCleared()

    abstract fun getLayoutId(): Int

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // View is created using layout Id
        binding = DataBindingUtil.inflate(inflater, getLayoutId(), container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //ViewModel is set as Binding Variable
        binding.apply {
            lifecycleOwner = this@BaseFragment
        }
    }

    @JvmName("getDataBinding1")
    fun getDataBinding() = binding
}

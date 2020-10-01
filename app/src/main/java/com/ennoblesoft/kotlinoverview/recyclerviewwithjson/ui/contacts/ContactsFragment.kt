package com.ennoblesoft.kotlinoverview.recyclerviewwithjson.ui.contacts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ennoblesoft.kotlinoverview.base.utils.autoCleared
import com.ennoblesoft.kotlinoverview.databinding.FragmentContactsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ContactsFragment: Fragment() {
    private var binding: FragmentContactsBinding by autoCleared()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentContactsBinding.inflate(inflater, container, false)
        return binding.root
    }
}
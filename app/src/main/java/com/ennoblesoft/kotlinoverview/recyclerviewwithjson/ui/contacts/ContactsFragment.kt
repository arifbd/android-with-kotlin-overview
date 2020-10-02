package com.ennoblesoft.kotlinoverview.recyclerviewwithjson.ui.contacts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.ennoblesoft.kotlinoverview.base.utils.autoCleared
import com.ennoblesoft.kotlinoverview.databinding.FragmentContactsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ContactsFragment: Fragment() {
    private var binding: FragmentContactsBinding by autoCleared()
    private val viewModel: ContactsViewModel by viewModels()
    private lateinit var adapter: ContactAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentContactsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecyclerView()
        subscribeToObservers()
    }

    private fun setRecyclerView() {
        adapter = ContactAdapter()
        binding.rvContacts.layoutManager = LinearLayoutManager(requireContext())
        binding.rvContacts.adapter = adapter
    }

    private fun subscribeToObservers() {
        viewModel.contacts.observe(viewLifecycleOwner, {
            if(!it.data.isNullOrEmpty()) {
                adapter.setItems(ArrayList(it.data))
            }
        })
    }
}
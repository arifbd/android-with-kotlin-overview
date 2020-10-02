package com.ennoblesoft.kotlinoverview.recyclerviewwithjson.ui.contacts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ennoblesoft.kotlinoverview.databinding.ItemContactBinding
import com.ennoblesoft.kotlinoverview.recyclerviewwithjson.data.dto.Contact

class ContactAdapter : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {
    private val items: ArrayList<Contact> = ArrayList()

    fun setItems(items: ArrayList<Contact>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = ItemContactBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = items[position]
        holder.binding.item = contact
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ContactViewHolder(val binding: ItemContactBinding) : RecyclerView.ViewHolder(binding.root)
}
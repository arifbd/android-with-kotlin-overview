package com.ennoblesoft.kotlinoverview.recyclerviewwithjson.ui.contacts

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.ennoblesoft.kotlinoverview.recyclerviewwithjson.data.dto.ContactList
import com.ennoblesoft.kotlinoverview.recyclerviewwithjson.data.repository.ContactRepository

class ContactsViewModel @ViewModelInject constructor(private val repository: ContactRepository): ViewModel() {
    val contacts: LiveData<ContactList> = repository.getContacts()
}
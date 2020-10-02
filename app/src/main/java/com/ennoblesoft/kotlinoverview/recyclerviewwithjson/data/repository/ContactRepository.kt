package com.ennoblesoft.kotlinoverview.recyclerviewwithjson.data.repository

import androidx.lifecycle.LiveData
import com.ennoblesoft.kotlinoverview.recyclerviewwithjson.data.dto.ContactList
import com.ennoblesoft.kotlinoverview.recyclerviewwithjson.data.local.LocalJsonParser
import javax.inject.Inject

class ContactRepository @Inject constructor(private val localJsonParser: LocalJsonParser) {
    fun getContacts(): LiveData<ContactList> = localJsonParser.getContacts()
}
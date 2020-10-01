package com.ennoblesoft.kotlinoverview.recyclerviewwithjson.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.ennoblesoft.kotlinoverview.recyclerviewwithjson.data.dto.ContactList
import com.ennoblesoft.kotlinoverview.recyclerviewwithjson.data.local.LocalJsonParser
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class ContactRepository @Inject constructor(private val localJsonParser: LocalJsonParser) {
    fun getContacts(): LiveData<ContactList> = liveData(Dispatchers.IO) {
        val source = localJsonParser.getContacts()
        emitSource(source)
    }
}
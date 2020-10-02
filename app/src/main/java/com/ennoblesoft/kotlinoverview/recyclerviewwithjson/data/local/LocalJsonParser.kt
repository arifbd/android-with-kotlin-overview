package com.ennoblesoft.kotlinoverview.recyclerviewwithjson.data.local

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ennoblesoft.kotlinoverview.base.utils.getJsonString
import com.ennoblesoft.kotlinoverview.recyclerviewwithjson.data.dto.ContactList
import com.google.gson.Gson
import javax.inject.Inject

class LocalJsonParser @Inject constructor(private val context: Context) {
    fun getContacts(): LiveData<ContactList> {
        val contactList = Gson().fromJson(getJsonString(context, "contacts.json"), ContactList::class.java)
        val converted: MutableLiveData<ContactList> = MutableLiveData()
        converted.value = contactList
        return converted
    }
}

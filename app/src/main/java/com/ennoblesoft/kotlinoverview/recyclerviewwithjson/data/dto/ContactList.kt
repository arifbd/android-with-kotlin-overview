package com.ennoblesoft.kotlinoverview.recyclerviewwithjson.data.dto

import com.ennoblesoft.kotlinoverview.base.data.dto.BaseDto

data class ContactList(
    val status: String,
    val data: List<Contact>
): BaseDto()
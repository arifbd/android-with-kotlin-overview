package com.ennoblesoft.kotlinoverview.recyclerviewwithjson.data.dto

import com.ennoblesoft.kotlinoverview.base.data.dto.BaseDto

data class Contact(
    val name: String,
    val number: String
) : BaseDto()
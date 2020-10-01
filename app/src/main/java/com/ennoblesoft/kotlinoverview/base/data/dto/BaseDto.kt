package com.ennoblesoft.kotlinoverview.base.data.dto

import com.google.gson.GsonBuilder
import java.io.Serializable

abstract class BaseDto : Serializable {
    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}
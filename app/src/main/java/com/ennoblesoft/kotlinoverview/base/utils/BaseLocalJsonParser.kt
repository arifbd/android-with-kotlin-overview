package com.ennoblesoft.kotlinoverview.base.utils

import android.content.Context

fun getJsonString(context: Context, fileName: String): String? {
    var json: String? = null
    try {
        val inputStream = context.assets.open(fileName)
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        json = String(buffer)
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return json
}
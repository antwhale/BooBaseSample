package com.boo.sample.base.utils

import java.text.SimpleDateFormat
import java.util.*

object Formatted {

    object Date {
        fun now(format: String = "yyyy-MM-dd HH:mm:ss"): String {
            val date = Date(System.currentTimeMillis())
            return SimpleDateFormat(format, Locale.getDefault()).format(date)
        }
    }
}
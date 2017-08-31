package com.example.learningkotlin

import android.app.Activity

/**
 * リスト表示のデータ
 */
data class SampleItem(val title: String, val activityClass: Class<out Activity>)
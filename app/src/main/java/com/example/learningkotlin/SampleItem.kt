package com.example.learningkotlin

import android.support.v7.app.AppCompatActivity

/**
 * リスト表示のデータ
 */
data class SampleItem(val title: String, val activityClass: Class<out AppCompatActivity>)
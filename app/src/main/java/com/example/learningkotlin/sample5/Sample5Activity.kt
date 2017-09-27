package com.example.learningkotlin.sample5

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.learningkotlin.R

/**
 * 第5章のサンプルを表示する画面です。
 */
class Sample5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample5)

        if (savedInstanceState == null) {
            fragmentManager.beginTransaction().add(R.id.content, Sample5Fragment()).commit()
        }
    }

}
package com.example.learningkotlin.sample2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.learningkotlin.R

/**
 * 第2章のサンプルを表示する画面です。
 */
class Sample2Activity : AppCompatActivity() {

    /**
     * 初期化処理を行います。
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample2)

        if (savedInstanceState == null) {
            fragmentManager.beginTransaction().add(android.R.id.content, Sample2Fragment()).commit()
        }
    }

}
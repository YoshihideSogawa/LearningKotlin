package com.example.learningkotlin.sample4

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.learningkotlin.R

/**
 * 第4章のサンプルを表示する画面です。
 */
class Sample4Activity : AppCompatActivity() {

    /**
     * 初期化を行います
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample4);

        if (savedInstanceState == null) {
            fragmentManager.beginTransaction().add(R.id.content, Sample4Fragment()).commit()
        }

    }

}
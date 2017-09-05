package com.example.learningkotlin.sample2

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.learningkotlin.R

/**
 * アナログ時計とデジタル時計を切り替えるボタンです。<br/>
 */
class Sample2Fragment : Fragment() {

    /**
     * Viewの設定を行います。
     */
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
            inflater.inflate(R.layout.fragment_sample2, container, false).also { rootView ->
                // アナログ時計
                val analogClock = rootView.findViewById<View>(R.id.analog_clock)
                // デジタル時計
                val digitalClock = rootView.findViewById<View>(R.id.digital_clock)

                // アナログ表示ボタン
                rootView.findViewById<View>(R.id.show_analog_button).apply {
                    // アナログ表示ボタンをクリックした場合
                    setOnClickListener {
                        // アナログ時計を表示
                        analogClock.visibility = View.VISIBLE
                        // デジタル時計を非表示
                        digitalClock.visibility = View.GONE
                    }
                }

                // デジタル表示ボタン
                rootView.findViewById<View>(R.id.show_digital_button).apply {
                    // デジタル表示ボタンをクリックした場合
                    setOnClickListener {
                        // アナログ時計を非表示
                        analogClock.visibility = View.GONE
                        // デジタル時計を表示
                        digitalClock.visibility = View.VISIBLE
                    }
                }
            }

}
package com.example.learningkotlin.sample5

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.learningkotlin.R
import java.util.Random

/**
 * 運勢を表示する画面です。<br/>
 * ボタンを押すと運勢が表示されます。
 */
class Sample5Fragment : Fragment(), View.OnClickListener {

    /**
     * 本日の運勢を表すテキスト
     */
    private lateinit var todayFortune: TextView

    /**
     * 運勢を行うテキスト
     */
    private lateinit var fortuneButton: TextView

    /**
     * レイアウトを設定します。
     * @param inflater LayoutInflater
     * @param container ViewGroup
     * @param savedInstanceState Bundle
     */
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
            inflater.inflate(R.layout.fragment_sample5, container, false).also { rootView ->
                // 運勢ボタンの表示
                todayFortune = rootView.findViewById(R.id.today_fortune)

                // 「占う」ボタンの処理を設定
                fortuneButton = rootView.findViewById<TextView>(R.id.button_fortune)
                fortuneButton.setOnClickListener(this@Sample5Fragment)
            }

    /**
     * クリックした時にここが呼び出されます。
     */
    override fun onClick(view: View) {
        // 0〜３までのランダムな値を生成
        val randomInt = Random().nextInt(4)

        // 本日の運勢をif文で決めます
        updateTodayFortune1(randomInt)
        // 本日の運勢をwhen文で決めます
        // updateTodayFortune2(randomInt)
    }

    /**
     * 本日の運勢をif文で決めます
     *
     * @param randomInt 0〜3のランダムな数値
     */
    private fun updateTodayFortune1(randomInt: Int) {
        // おみくじの内容を更新
        // TODO:ここにif文で処理を書きます
        val text =
                if (randomInt == 0) {
                    "大吉"
                } else if (randomInt == 1) {
                    "中吉"
                } else if (randomInt == 2) {
                    "小吉"
                } else if (randomInt == 3) {
                    "凶"
                } else {
                    ""
                }

        todayFortune.text = text
    }

    /**
     * 本日の運勢をwhen文で決めます
     *
     * @param randomInt 0〜3のランダムな数値
     */
    private fun updateTodayFortune2(randomInt: Int) {
        // おみくじの内容を更新
        // TODO:ここにwhen文で処理を書きます
        val text = when (randomInt) {
            0 -> "大吉"
            1 -> "中吉"
            2 -> "小吉"
            3 -> "凶"
            else -> ""
        }

        todayFortune.text = text
    }
}
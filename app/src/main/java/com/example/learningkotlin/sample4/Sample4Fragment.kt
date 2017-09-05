package com.example.learningkotlin.sample4

import android.app.Fragment
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.learningkotlin.R

// TODO:定数の書き方はこれで良いのか？命名規約としては大文字統一？
const val TAG = "Variable"

/**
 * 変数を用いた表示をするクラスです。
 */
class Sample4Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
            inflater.inflate(R.layout.fragment_sample4, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // TODO:ここに変数の処理を書いていきましょう(System.outはLogCatに出ないね)
        val a = 123
        Log.d(TAG, "aは$a")

        var tasu = 5
        tasu += 3
        Log.d(TAG, "$tasu")

        var hiku = 5
        hiku -= 3
        Log.d(TAG, "$hiku")

        var kakeru = 5
        kakeru *= 3
        Log.d(TAG, "$kakeru")

        var waru = 5
        waru /= 3
        Log.d(TAG, "$waru")

        var amari = 5
        amari %= 3
        Log.d(TAG, "$amari")

        var kuwaeru = 5
        kuwaeru++
        Log.d(TAG, "$kuwaeru")

        var herasu = 5
        herasu--
        Log.d(TAG, "$herasu")
    }

}
package com.example.learningkotlin.sample4

import android.app.Fragment
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.learningkotlin.R

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
        Log.d("Variable", "aは$a")

        var tasu = 5
        tasu = tasu + 3
        Log.d("Variable", "$tasu")

        var hiku = 5
        hiku = hiku - 3
        Log.d("Variable", "$hiku")

        var kakeru = 5
        kakeru = kakeru * 3
        Log.d("Variable", "$kakeru")

        var waru = 5
        waru = waru / 3
        Log.d("Variable", "$waru")

        var amari = 5
        amari = amari % 3
        Log.d("Variable", "$amari")
    }

}
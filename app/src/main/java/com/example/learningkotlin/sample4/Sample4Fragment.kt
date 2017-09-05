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

    /**
     * Viewの作成を行います。
     */
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
            inflater.inflate(R.layout.fragment_sample4, container, false)

    /**
     * 変数の計算と表示処理を行います。
     */
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

        val kadai1 = 15 + 2
        Log.d(TAG, "kadai1:$kadai1")

        val kadai2 = -4 + 9
        Log.d(TAG, "kadai2:$kadai2")

        val kadai3 = 17 - 7
        Log.d(TAG, "kadai3 $kadai3")

        val kadai4 = 6 - 48
        Log.d(TAG, "kadai4 $kadai4")

        val kadai5 = 19 * 2
        Log.d(TAG, "kadai5 $kadai5")

        val kadai6 = -5 * 3
        Log.d(TAG, "kadai6 $kadai6")

        val kadai7: Int = 51 / 18
        Log.d(TAG, "kadai7 $kadai7")

        var kadai8: Double = 51.toDouble() // or 51.0
        kadai8 /= 18
        Log.d(TAG, "kadai8 $kadai8")

        val kadai9: Int = -17 / 5
        Log.d(TAG, "kadai9 $kadai9")

        var kadai10: Double = -17.toDouble()
        kadai10 /= 5
        Log.d(TAG, "kadai10 $kadai10")

        val kadai11 = 23 % 7
        Log.d(TAG, "kadai11 $kadai11")

        val kadai12 = 105 % 19
        Log.d(TAG, "kadai12 $kadai12")
    }

}
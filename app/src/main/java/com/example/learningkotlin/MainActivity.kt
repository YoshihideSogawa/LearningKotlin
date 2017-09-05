package com.example.learningkotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import com.example.learningkotlin.sample2.Sample2Activity
import com.example.learningkotlin.sample4.Sample4Activity

/**
 * メインActivity
 */
class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    /**
     * レイアウトの初期化を行います。
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ListView>(R.id.list_view).apply {
            adapter = SampleListAdapter(this@MainActivity, createListItems())
            onItemClickListener = this@MainActivity
        }
    }

    /**
     * リスト項目を作成します。
     * @return SampleListAdapterの1項目
     */
    private fun createListItems(): List<SampleItem> = ArrayList<SampleItem>().apply {
        add(SampleItem("第2章 アプリを動かしてみよう", Sample2Activity::class.java))
        add(SampleItem("第4章 変数", Sample4Activity::class.java))
    }

    /**
     * リストをクリックした時の処理を行います。
     */
    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val sampleItem = parent?.getItemAtPosition(position) as SampleItem
        startActivity(Intent(this, sampleItem.activityClass))
    }

}
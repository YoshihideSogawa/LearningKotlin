package com.example.learningkotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import com.example.learningkotlin.sample2.Sample2Activity

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

        val listView = findViewById<ListView>(R.id.list_view)
        listView.adapter = SampleListAdapter(this, createListItems())
        listView.onItemClickListener = this
    }

    /**
     * リスト項目を作成します。
     * @return SampleListAdapterの1項目
     */
    private fun createListItems(): List<SampleItem> {
        val sampleItemList = ArrayList<SampleItem>()
        sampleItemList.add(SampleItem("サンプル2", Sample2Activity::class.java))

        return sampleItemList
    }

    /**
     * リストをクリックした時の処理を行います。
     */
    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val sampleItem = parent?.getItemAtPosition(position) as SampleItem
        startActivity(Intent(this, sampleItem.activityClass))
    }

}
package com.example.learningkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

/**
 * サンプルリストアダプタ
 */
class SampleListAdapter(context: Context, sampleDataList: List<SampleItem>) : ArrayAdapter<SampleItem>(context, 0, sampleDataList) {

    /**
     * LayoutInflater
     */
    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    /**
     * リスト項目の生成と再利用を行います。
     */
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val targetView: View
        val holder: ViewHolder

        if (convertView == null) {
            targetView = inflater.inflate(R.layout.list_item_sample, parent, false) ;

            holder = ViewHolder()
            holder.title = targetView.findViewById<TextView>(R.id.item_title)

            targetView.tag = holder
        } else {
            targetView = convertView
            holder = targetView.getTag() as ViewHolder
        }

        val sampleItem = getItem(position)
        holder.title.text = sampleItem.title

        return targetView
    }

    /**
     * ViewHolder
     */
    internal class ViewHolder {

        /**
         * タイトル
         */
        lateinit var title: TextView
    }

}
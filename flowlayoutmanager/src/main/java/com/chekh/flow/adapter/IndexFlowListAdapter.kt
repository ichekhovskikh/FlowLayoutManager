package com.chekh.flow.adapter

import androidx.recyclerview.widget.RecyclerView

abstract class IndexFlowListAdapter<VH : RecyclerView.ViewHolder> : FlowListAdapter<VH>() {

    abstract fun getItemColumnIndex(position: Int): Int
    abstract fun getItemRowIndex(position: Int): Int
    abstract fun getItemColumnCount(position: Int): Int
    abstract fun getItemRowCount(position: Int): Int

    override fun getItemX(position: Int, columnWidth: Int) =
        getItemColumnIndex(position) * columnWidth

    override fun getItemY(position: Int, rowHeight: Int) =
        getItemRowIndex(position) * rowHeight

    override fun getItemWidth(position: Int, columnWidth: Int) =
        getItemColumnCount(position) * columnWidth

    override fun getItemHeight(position: Int, rowHeight: Int) =
        getItemRowCount(position) * rowHeight
}

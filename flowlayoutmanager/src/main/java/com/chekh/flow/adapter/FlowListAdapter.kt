package com.chekh.flow.adapter

import androidx.recyclerview.widget.RecyclerView

abstract class FlowListAdapter<VH : RecyclerView.ViewHolder> : RecyclerView.Adapter<VH>() {

    abstract fun getItemX(position: Int, columnWidth: Int): Int
    abstract fun getItemY(position: Int, rowHeight: Int): Int
    abstract fun getItemWidth(position: Int, columnWidth: Int): Int
    abstract fun getItemHeight(position: Int, rowHeight: Int): Int
}

package com.chekh.flow.adapter

import androidx.recyclerview.widget.RecyclerView
import kotlin.math.max
import kotlin.math.round

abstract class PixelFlowListAdapter<VH : RecyclerView.ViewHolder> : FlowListAdapter<VH>() {

    abstract fun getItemX(position: Int): Int
    abstract fun getItemY(position: Int): Int
    abstract fun getItemWidth(position: Int): Int
    abstract fun getItemHeight(position: Int): Int

    override fun getItemX(position: Int, columnWidth: Int) =
        round(getItemX(position).toFloat() / columnWidth).toInt() * columnWidth

    override fun getItemY(position: Int, rowHeight: Int) =
        round(getItemY(position).toFloat() / rowHeight).toInt() * rowHeight

    override fun getItemWidth(position: Int, columnWidth: Int) =
        max(
            round(getItemWidth(position).toFloat() / columnWidth).toInt(),
            MIN_SPAN_COUNT
        ) * columnWidth

    override fun getItemHeight(position: Int, rowHeight: Int) =
        max(
            round(getItemHeight(position).toFloat() / rowHeight).toInt(),
            MIN_SPAN_COUNT
        ) * rowHeight

    private companion object {
        const val MIN_SPAN_COUNT = 1
    }
}

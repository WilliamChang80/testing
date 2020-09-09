package com.example.bnccapllication.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.bnccapllication.data.LookupData
import kotlinx.android.synthetic.main.item_look_up.view.*

class LookupViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    fun bind(data: LookupData) {
        itemView.tvLookupProvinceName.text = data.provinceName
    }
}
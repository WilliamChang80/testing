package com.example.bnccapllication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bnccapllication.R
import com.example.bnccapllication.data.LookupData

class LookupAdapter(private val lookupList: MutableList<LookupData>) :
    RecyclerView.Adapter<LookupViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LookupViewHolder {
        return LookupViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_look_up,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return lookupList.size
    }

    override fun onBindViewHolder(holder: LookupViewHolder, position: Int) {
        holder.bind(lookupList[position])
    }

}
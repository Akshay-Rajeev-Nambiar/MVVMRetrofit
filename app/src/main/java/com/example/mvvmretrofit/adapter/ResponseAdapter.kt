package com.example.mvvmretrofit.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmretrofit.R

class ResponseAdapter(private val dataList: List<Any>) : RecyclerView.Adapter<ResponseAdapter.ResponseViewHolder>(){
    class ResponseViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val itemText: TextView = itemView.findViewById(R.id.response_item_tv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResponseViewHolder {
        return ResponseViewHolder(LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_view, parent, false))
    }

    override fun onBindViewHolder(holder: ResponseViewHolder, position: Int) {
        holder.itemText.text = dataList[position].toString()
    }

    override fun getItemCount(): Int = dataList.size


}
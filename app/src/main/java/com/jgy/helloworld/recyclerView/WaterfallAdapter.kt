package com.jgy.helloworld.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.jgy.helloworld.R
import com.jgy.helloworld.listview.Fruit

/**
 * RecyclerAdapter 1.0
 * <pre>
 * Copyright 2017-2021 GE-SOFT, Inc. All rights reserved.
 * GE-SOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @description 请 jiangguangyu 填写注释
 * @author Jiangguangyu
 * @createdate: 2021/11/11 16:46
 * </pre>
 */
class WaterfallAdapter(private val fruitList: List<Fruit>) :
    RecyclerView.Adapter<WaterfallAdapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val fruitImage: ImageView = view.findViewById(R.id.fruitImage)
        val fruitName: TextView = view.findViewById(R.id.fruitName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fruit_item_waterfall,parent,false)
            return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fruit = fruitList[position]
        holder.fruitImage.setImageResource(fruit.imageId)
        holder.fruitName.text = fruit.name

        holder.itemView.setOnClickListener {
            val position = holder.absoluteAdapterPosition
            val fruit = fruitList[position]
            Toast.makeText(holder.itemView.context, fruit.name, Toast.LENGTH_SHORT).show()
        }
        holder.fruitImage.setOnClickListener {
            val position = holder.absoluteAdapterPosition
            val fruit = fruitList[position]
            Toast.makeText(holder.itemView.context, fruit.name, Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        return fruitList.size
    }
}
package com.aranteknoloji.genericrecycleritemview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

class MyAdapter : RecyclerView.Adapter<RecyclerViewHolder>() {

    private val data = mutableListOf<RecyclerItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return RecyclerViewHolder(DataBindingUtil.inflate(layoutInflater, viewType, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        data[position].bind(holder.binding)
        holder.binding.executePendingBindings()
    }

    override fun getItemCount(): Int = data.size

    override fun getItemViewType(position: Int): Int =
        data[position].layoutId

    fun setData(list: List<RecyclerItem>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()
    }
}

class RecyclerViewHolder(val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root)

data class RecyclerItem(
    val data: Any,
    @LayoutRes val layoutId: Int,
    val variableId: Int
) {
    fun bind(binding: ViewDataBinding) {
        binding.setVariable(variableId, data)
    }
}
package com.ezatpanah.viewbinding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ezatpanah.viewbinding.databinding.ItemRowBinding


class SampleAdapter(private val items: MutableList<SampleModel>) :
    RecyclerView.Adapter<SampleAdapter.ViewHolder>() {

    private lateinit var binding: ItemRowBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding= ItemRowBinding.inflate(inflater,parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])

    }

    override fun getItemCount() = items.size

    inner class ViewHolder(itemView: ItemRowBinding) : RecyclerView.ViewHolder(itemView.root) {

        fun bind(item: SampleModel) {
            binding.apply {
                tvId.text = item.id.toString()
                tvName.text = item.name
            }


        }

    }


}

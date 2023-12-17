package com.example.dtask

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dtask.databinding.ItemPhotosBinding

class RecyclerViewPublicAdapter (private val dataArrayList: ArrayList<DataList>) :
    RecyclerView.Adapter<RecyclerViewPublicAdapter.ViewHolder>()
{

    data class DataList(val title: String, val imageRes : Int)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemPhotosBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataArrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataArrayList[position]
        holder.bind(data)
    }

    class ViewHolder(private val binding : ItemPhotosBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(data : DataList){
            binding.imageViewPhotos.setImageResource(data.imageRes)
            binding.itemTextViewPhotos.text = data.title

        }

    }
}
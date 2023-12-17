package com.example.dtask

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dtask.databinding.ItemPhotosBinding
import com.example.dtask.databinding.ItemPhotosDetailsBinding

class PhotosDetailsAdapter(private val dataArrayList: ArrayList<DataList>) :
    RecyclerView.Adapter<PhotosDetailsAdapter.ViewHolder>()

{
    data class DataList(val title: String, val imageRes : Int)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PhotosDetailsAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemPhotosDetailsBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PhotosDetailsAdapter.ViewHolder, position: Int) {
        val data = dataArrayList[position]
        holder.bind(data)

    }

    override fun getItemCount(): Int {
        return dataArrayList.size
    }

    class ViewHolder(private val binding : ItemPhotosDetailsBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(data : PhotosDetailsAdapter.DataList){
            binding.imageViewPhotosDetails.setImageResource(data.imageRes)
            binding.itemTextViewPhotosDetails.text = data.title

        }

    }

}
package com.example.dtask.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dtask.PhotosDetailsAdapter
import com.example.dtask.R
import com.example.dtask.RecyclerViewPublicAdapter
import com.example.dtask.databinding.FragmentTab1Binding

class Tab1Fragment : Fragment() {

    private var _binding: FragmentTab1Binding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentTab1Binding.inflate(inflater,container,false);
        val view = binding.root;

        val item:ArrayList<RecyclerViewPublicAdapter.DataList> = ArrayList()
        item.add(RecyclerViewPublicAdapter.DataList("Omi", R.drawable.image1))
        item.add(RecyclerViewPublicAdapter.DataList("uyt", R.drawable.image2))
        item.add(RecyclerViewPublicAdapter.DataList("ytu", R.drawable.image3))
        item.add(RecyclerViewPublicAdapter.DataList("Otrfujhmi", R.drawable.image5))

        val recyclerViewD : RecyclerView = binding.recyclerViewPhotos
        recyclerViewD.layoutManager = GridLayoutManager(context,4)
        recyclerViewD.adapter = RecyclerViewPublicAdapter(item)


        val recyclerView : RecyclerView = binding.recyclerViewPhotosl
        recyclerView.layoutManager = GridLayoutManager(context, 2)
        recyclerView.adapter = RecyclerViewPublicAdapter(dataList())


        return view;

    }

    private fun dataList(): ArrayList<RecyclerViewPublicAdapter.DataList>{

        val item:ArrayList<RecyclerViewPublicAdapter.DataList> = ArrayList()
        item.add(RecyclerViewPublicAdapter.DataList("One", R.drawable.one))
        item.add(RecyclerViewPublicAdapter.DataList("Two", R.drawable.two))
        item.add(RecyclerViewPublicAdapter.DataList("Three", R.drawable.three))
        item.add(RecyclerViewPublicAdapter.DataList("Four", R.drawable.four))
        item.add(RecyclerViewPublicAdapter.DataList("Five", R.drawable.five))
        item.add(RecyclerViewPublicAdapter.DataList("Six", R.drawable.six))

        return item
    }


}
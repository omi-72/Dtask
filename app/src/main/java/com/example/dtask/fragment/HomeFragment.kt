package com.example.dtask.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dtask.PhotosDetailsAdapter
import com.example.dtask.R
import com.example.dtask.RecyclerViewPublicAdapter
import com.example.dtask.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding:FragmentHomeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater,container,false);
        val view = binding.root;

        val item:ArrayList<PhotosDetailsAdapter.DataList> = ArrayList()
        item.add(PhotosDetailsAdapter.DataList("Jannatul Bakey Omi", R.drawable.ic_killer))
        item.add(PhotosDetailsAdapter.DataList("Jannatul Bakey Omi", R.drawable.pk_master))
        item.add(PhotosDetailsAdapter.DataList("Jannatul Bakey Omi", R.drawable.marks_man))
        item.add(PhotosDetailsAdapter.DataList("Jannatul Bakey Omi", R.drawable.runner_up))

        val recyclerViewD : RecyclerView = binding.recyclerViewPhotosYY
        recyclerViewD.layoutManager = LinearLayoutManager(context)
        recyclerViewD.adapter = PhotosDetailsAdapter(item)


        val recyclerView : RecyclerView = binding.recyclerViewPhotos
        recyclerView.layoutManager = GridLayoutManager(context, 3)
        recyclerView.adapter = RecyclerViewPublicAdapter(dataList())


        return view;


    }

    private fun dataList(): ArrayList<RecyclerViewPublicAdapter.DataList>{

        val item:ArrayList<RecyclerViewPublicAdapter.DataList> = ArrayList()
        item.add(RecyclerViewPublicAdapter.DataList("Omi", R.drawable.image1))
        item.add(RecyclerViewPublicAdapter.DataList("uyt", R.drawable.image2))
        item.add(RecyclerViewPublicAdapter.DataList("ytu", R.drawable.image3))
        item.add(RecyclerViewPublicAdapter.DataList("yutu", R.drawable.image4))
        item.add(RecyclerViewPublicAdapter.DataList("Otrfujhmi", R.drawable.image5))
        item.add(RecyclerViewPublicAdapter.DataList("Omtfhi", R.drawable.image6))

        return item
    }

}
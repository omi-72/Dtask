package com.example.dtask.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.dtask.R
import com.example.dtask.databinding.FragmentCategoryBinding
import com.example.dtask.databinding.FragmentHomeBinding

class CategoryFragment : Fragment() {

    private var _binding: FragmentCategoryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCategoryBinding.inflate(inflater,container,false);
        val view = binding.root;

        val imageSlider = view.findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel("https://images.immediate.co.uk/production/volatile/sites/3/2019/04/Avengers-Endgame-Banner-2-de7cf60.jpg?quality=90&resize=620,413"))
        imageList.add(SlideModel("https://img.cinemablend.com/filter:scale/quill/3/7/0/0/8/e/37008e36e98cd75101cf1347396eac8534871a19.jpg?mw=600"))
        imageList.add(SlideModel("https://www.adgully.com/img/800/201711/spider-man-homecoming-banner.jpg"))
        imageList.add(SlideModel("https://live.staticflickr.com/1980/29996141587_7886795726_b.jpg"))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)


        return view;
    }

}




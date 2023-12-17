package com.example.dtask.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.dtask.MyViewAdapter
import com.example.dtask.R
import com.example.dtask.databinding.FragmentCategoryBinding
import com.example.dtask.databinding.FragmentSettingsBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class SettingsFragment : Fragment() {


    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var adapter: MyViewAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSettingsBinding.inflate(inflater,container,false);
        val view = binding.root;


        tabLayout = view.findViewById(R.id.tabP)
        viewPager2 = view.findViewById(R.id.viewP)

        adapter = MyViewAdapter(childFragmentManager, lifecycle)
        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Profile"
                }
                1 -> {
                    tab.text = "Badges"
                }
            }
        }.attach()

        return view;

    }


}
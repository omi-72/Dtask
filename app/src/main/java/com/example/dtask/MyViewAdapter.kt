package com.example.dtask

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.dtask.fragment.Tab1Fragment
import com.example.dtask.fragment.Tab2Fragment

class MyViewAdapter(fragmentManager : FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(
    fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {

        return when(position){
            0 -> {
                Tab1Fragment()
            }
            1 -> {
                Tab2Fragment()
            }
            else ->{
                Tab1Fragment()
            }
        }
    }
}
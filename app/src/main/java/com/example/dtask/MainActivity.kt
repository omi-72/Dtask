package com.example.dtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.dtask.databinding.ActivityMainBinding
import com.example.dtask.fragment.CategoryFragment
import com.example.dtask.fragment.HomeFragment
import com.example.dtask.fragment.ProfileFragment
import com.example.dtask.fragment.SettingsFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewHome.setOnClickListener {
            replaceFragment(HomeFragment())
        }

        binding.imageViewCategory.setOnClickListener {
            replaceFragment(CategoryFragment())
        }

        binding.imageViewSetting.setOnClickListener {
            replaceFragment(SettingsFragment())
        }

        binding.imageViewProfile.setOnClickListener {
            replaceFragment(ProfileFragment())
        }



    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fargmentContainer, fragment)
        fragmentTransaction.commit()
    }
}
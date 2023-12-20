package com.example.dtask.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.dtask.R
import com.example.dtask.databinding.FragmentHomeBinding
import com.example.dtask.databinding.FragmentProfileBinding
import com.google.android.material.appbar.AppBarLayout

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentProfileBinding.inflate(inflater,container,false);
        val view = binding.root;

        // Use view.findViewById to find views within the fragment's layout
        val toolbar = view.findViewById<Toolbar>(R.id.toolbarP)
        (requireActivity() as AppCompatActivity).setSupportActionBar(toolbar)


        val titleTextViewPs = view.findViewById<TextView>(R.id.titleTextViewP)
        val icon1P = view.findViewById<ImageView>(R.id.icon1P)
        val icon2P = view.findViewById<ImageView>(R.id.icon2P)
        val appBarLayout = view.findViewById<AppBarLayout>(R.id.appBarLayoutP)

        var isShow = false
        var scrollRange = -1

        appBarLayout.addOnOffsetChangedListener { appBarLayout, verticalOffset ->
            if (scrollRange == -1) {
                scrollRange = appBarLayout.totalScrollRange
            }
            if (scrollRange + verticalOffset == 0) {
                // Collapsed
                toolbar.visibility = View.VISIBLE
                titleTextViewPs.visibility = View.GONE
                icon1P.visibility = View.VISIBLE
                icon2P.visibility = View.VISIBLE
                icon2P.setOnClickListener {
                }
                isShow = true
            } else if (isShow) {
                // Expanded
                toolbar.visibility = View.GONE
                titleTextViewPs.visibility = View.GONE
                icon1P.visibility = View.GONE
                icon2P.visibility = View.GONE
                isShow = false
            }
        }


        return view;
    }


}
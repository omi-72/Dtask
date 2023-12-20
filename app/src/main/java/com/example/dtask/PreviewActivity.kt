package com.example.dtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.dtask.databinding.ActivityPreviewBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class PreviewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPreviewBinding
    private lateinit var viewModel: PreviewViewModel

//    private lateinit var userNameTextView: TextView
//    private lateinit var ageTextView: TextView
//    private lateinit var heightTextView: TextView
//    private lateinit var bloodGroupTextView: TextView
//    private lateinit var phoneNumberTextView: TextView
//    private lateinit var emailTextView: TextView
//    private lateinit var addressTextView: TextView
//    private lateinit var professionTextView: TextView
//    private lateinit var hobbiesTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)



//        val userId = intent.getIntExtra("userId", -1)
//        Log.e("error", userId.toString())
//
//        // Retrieve and display user details
//        getUserDetails(userId)
    }

//    private fun getUserDetails(userId: Int) {
//        GlobalScope.launch {
//            val user = UserDatabase.getDatabase(applicationContext).personalDao().getUserById(userId)
//
//            // Display user details in TextViews
//            runOnUiThread {
//                userNameTextView.text = "User Name: ${user?.userName}"
//                ageTextView.text = "Age: ${user?.age}"
//                heightTextView.text = "Height: ${user?.height}"
//                bloodGroupTextView.text = "Blood Group: ${user?.bloodGroup}"
//                phoneNumberTextView.text = "Phone Number: ${user?.phoneNumber}"
//                emailTextView.text = "Email: ${user?.email}"
//                addressTextView.text = "Address: ${user?.address}"
//                professionTextView.text = "Profession: ${user?.profession}"
//                hobbiesTextView.text = "Hobbies: ${user?.hobbies}"
//            }
//        }
//    }
}
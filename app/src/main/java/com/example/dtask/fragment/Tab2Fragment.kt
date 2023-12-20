package com.example.dtask.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.dtask.PreviewActivity
import com.example.dtask.R
import com.example.dtask.UserInfoViewModel
import com.example.dtask.databinding.FragmentTab2Binding
import com.example.dtask.entityClass.User
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Tab2Fragment : Fragment() {

    private lateinit var binding: FragmentTab2Binding

    private lateinit var viewModel: UserInfoViewModel



//    private lateinit var etUserName: EditText
//    private lateinit var etAge: EditText
//    private lateinit var etHeight: EditText
//    private lateinit var etBloodGroup: EditText
//    private lateinit var etPhoneNumber: EditText
//    private lateinit var etEmail: EditText
//    private lateinit var etAddress: EditText
//    private lateinit var etProfession: EditText
//    private lateinit var etHobbies: EditText
//    private lateinit var btnNext: Button



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTab2Binding.inflate(inflater, container, false)
        return binding.root


//        etUserName = view?.findViewById(R.id.editTextName)!!
//        etAge = view.findViewById(R.id.editTextAge)
//        etHeight = view.findViewById(R.id.editTextHeight)
//        etBloodGroup = view.findViewById(R.id.editTextBloodGroup)
//        etPhoneNumber = view.findViewById(R.id.editTextContactPhone)
//        etEmail = view.findViewById(R.id.editTextEmail)
//        etAddress = view.findViewById(R.id.editTextAddress)
//        etProfession = view.findViewById(R.id.editTextProfession)
//        etHobbies = view.findViewById(R.id.editTextHobbies)
//        btnNext = view.findViewById(R.id.buttonNextPersonalDetails)
//
//        binding?.buttonNextPersonalDetails?.setOnClickListener {
//            saveUserDetails()
//        }





    }

//    private fun saveUserDetails() {
//
//        val userName = etUserName.text.toString()
//        val age = etAge.text.toString().toInt()
//        val height = etHeight.text.toString().toDouble()
//        val bloodGroup = etBloodGroup.text.toString()
//        val phoneNumber = etPhoneNumber.text.toString()
//        val email = etEmail.text.toString()
//        val address = etAddress.text.toString()
//        val profession = etProfession.text.toString()
//        val hobbies = etHobbies.text.toString()
//
//        // Create UserEntityData object
//        val user = UserEntityData(
//            userName = userName,
//            age = age,
//            height = height,
//            bloodGroup = bloodGroup,
//            phoneNumber = phoneNumber,
//            email = email,
//            address = address,
//            profession = profession,
//            hobbies = hobbies
//        )
//
//        // Save data to Room database
//        GlobalScope.launch {
//            UserDatabase.getDatabase(requireContext()).personalDao().insert(user)
//        }
//
//        // Navigate to PreviewActivity
//        val previewIntent = Intent(requireContext(), PreviewActivity::class.java)
//        previewIntent.putExtra("userId", user.id)
//        startActivity(previewIntent)
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(UserInfoViewModel::class.java)

        binding.btnSave.setOnClickListener {
            val firstName = binding.editFirstName.text.toString()
            val lastName = binding.editLastName.text.toString()
            val age = binding.editAge.text.toString().toInt()

            viewModel.saveUser(User(firstName, lastName, age))

            val intent = Intent(activity, PreviewActivity::class.java)
            startActivity(intent)
        }
    }

}
package com.example.dtask

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.dtask.entityClass.User
import com.example.dtask.room.AppDatabase

class PreviewViewModel : ViewModel() {

    private val repository = UserRepository(AppDatabase.getDatabase(MyApplication.context).userDao())

    fun getAllUsers(): LiveData<List<User>> {
        return repository.getAllUsers()
    }
}
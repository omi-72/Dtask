package com.example.dtask

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dtask.entityClass.User
import com.example.dtask.room.AppDatabase
import kotlinx.coroutines.launch

class UserInfoViewModel(application: Application) : ViewModel(application) {

    private val repository = UserRepository(AppDatabase.getDatabase(MyApplication.context).userDao())

    fun saveUser(user: User) {
        viewModelScope.launch {
            repository.insertUser(user)
        }
    }
}
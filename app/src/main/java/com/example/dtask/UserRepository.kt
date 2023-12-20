package com.example.dtask

import androidx.lifecycle.LiveData
import com.example.dtask.dao.UserDao
import com.example.dtask.entityClass.User

class UserRepository(private val userDao: UserDao) {

    suspend fun insertUser(user: User) {
        userDao.insertUser(user)
    }

    fun getAllUsers(): LiveData<List<User>> {
        return userDao.getAllUsers()
    }
}
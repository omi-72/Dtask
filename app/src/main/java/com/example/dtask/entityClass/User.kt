package com.example.dtask.entityClass

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "user_table")
data class User(
    val userName: String,
    val lastName : String,
    val age: Int

)
{
    @PrimaryKey(autoGenerate = true)
    var id : Long = 0
}

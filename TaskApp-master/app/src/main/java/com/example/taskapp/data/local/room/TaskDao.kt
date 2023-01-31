package com.example.taskapp.data.local.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.taskapp.ui.home.TaskMode


@Dao
interface TaskDao {

    @Insert
    fun insert(task: TaskMode?)

    @Query("SELECT * FROM TaskMode")
    fun getAllTask(): List<TaskMode>?

    @Query("SELECT * FROM TaskMode ORDER BY title DESC")
    fun getAllTaskByAlphabetAz(): List<TaskMode?>?

    @Query("SELECT * FROM TaskMode ORDER BY title ASC")
    fun getAllTaskByAlphabetZa(): List<TaskMode?>?

    @Query("SELECT * FROM TaskMode ORDER BY id DESC")
    fun getAllTaskByDate(): List<TaskMode?>?

    @Delete
    fun delete(task: TaskMode?)
}
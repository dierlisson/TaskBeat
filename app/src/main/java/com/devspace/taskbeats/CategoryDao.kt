package com.devspace.taskbeats

import androidx.room.Dao
import androidx.room.Query


@Dao
interface CategoryDao {

    @Query("Select * From categoryentity")
    fun getAll(): List<CategoryEntity>
}
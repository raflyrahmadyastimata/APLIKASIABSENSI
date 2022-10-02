package com.example.myapplication.database

import androidx.room.Database
import com.example.myapplication.model.ModelDatabase
import androidx.room.RoomDatabase
import com.example.myapplication.database.dao.DatabaseDao

@Database(entities = [ModelDatabase::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao?
}
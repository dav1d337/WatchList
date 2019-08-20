package com.example.myapplication.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.reactivex.Flowable

@Dao
interface RoomMovieDao {

    @Query("SELECT * FROM Movie")
    fun getAll(): Flowable<List<RoomMovie>>


    @Query("SELECT * FROM Movie WHERE id = :id")
    fun get(id: Long): Flowable<RoomMovie>

    @Query("DELETE FROM Movie")
    fun deleteAll()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(roomMovie: RoomMovie): Long
}
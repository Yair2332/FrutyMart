package com.thiagoyairlezcano.frutymart.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.thiagoyairlezcano.frutymart.domain.models.Fruit
import kotlinx.coroutines.flow.Flow

@Dao
interface FuitDao {

    @Insert
    suspend fun addFruit(fruit: Fruit): Boolean

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateFruit(fruit: Fruit): Boolean

    @Query("SELECT * FROM Fruits")
    fun getFruit(): Flow<List<Fruit>>

    @Query("DELETE FROM Fruits WHERE id = :fruitId")
    suspend fun deleteFruitById(fruitId: Int): Int

}
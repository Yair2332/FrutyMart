package com.thiagoyairlezcano.frutymart.data.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.thiagoyairlezcano.frutymart.domain.models.Fruit

@Database(entities = [Fruit::class], version = 1)
abstract class Database : RoomDatabase() {
    abstract fun fruitDato(): FuitDao
}
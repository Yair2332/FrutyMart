package com.thiagoyairlezcano.frutymart.domain.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Fruits")
data class Fruit(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = 0,
    @ColumnInfo("imgUrl")
    // val imgUrl: String = "",
    val imgUrl: Int, // Puesto para probar el renderizado de la imagen
    @ColumnInfo("name")
    val name: String = "",
    @ColumnInfo("price")
    val price: Float = 0.0f,
    @ColumnInfo("description")
    val description: String = "",
    @ColumnInfo("quantity")
    val quantity: String = ""
)

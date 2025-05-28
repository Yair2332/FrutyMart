package com.thiagoyairlezcano.frutymart.ui.component.list

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.thiagoyairlezcano.frutymart.domain.models.Fruit
import com.thiagoyairlezcano.frutymart.ui.component.item.FruitItem
import androidx.compose.foundation.lazy.items
import com.thiagoyairlezcano.frutymart.R


@Composable
fun FruitList(fruits: List<Fruit>) {
    LazyColumn {
        items(fruits) { fruit ->
            FruitItem(fruit = fruit)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewFruitList() {
    val mockFruits = listOf(
        Fruit(
            id = 1,
            imgUrl = R.drawable.frutilla,
            name = "Frutilla",
            price = 3200f,
            description = "Frutillas frescas, dulces y jugosas",
            quantity = "1"
        ),
        Fruit(
            id = 2,
            imgUrl = R.drawable.banana,
            name = "Banana",
            price = 2800f,
            description = "Bananas ricas en potasio",
            quantity = "2"
        )
    )

    FruitList(fruits = mockFruits)
}

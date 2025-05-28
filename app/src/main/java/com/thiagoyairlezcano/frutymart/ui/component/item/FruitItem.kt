package com.thiagoyairlezcano.frutymart.ui.component.item

import androidx.benchmark.perfetto.Row
import com.thiagoyairlezcano.frutymart.R
import androidx.compose.foundation.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.IconButton
import androidx.compose.ui.res.painterResource
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import com.thiagoyairlezcano.frutymart.domain.models.Fruit
import coil.compose.AsyncImage
import com.thiagoyairlezcano.frutymart.ui.theme.pastelGradient


@Composable
fun FruitItem(fruit: Fruit) {
    val favorito = remember { mutableStateOf(false) }

    Box(
        modifier = Modifier.fillMaxSize()
            .background(color = Color.White),
        contentAlignment = Alignment.Center
    ) {


        Card(
            modifier = Modifier
                .width(320.dp)
                .padding(16.dp),
            shape = RoundedCornerShape(24.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 12.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Box (
                modifier = Modifier
                    .background(brush = pastelGradient)
                    .fillMaxWidth()
                    .height(400.dp),
                contentAlignment = Alignment.Center
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(24.dp)
                ) {
                    /*AsyncImage(
                    model = fruit.imgUrl,
                    contentDescription = "Imagen de ${fruit.name}",
                    modifier = Modifier
                        .size(150.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )*/
                    Image(
                        painter = painterResource(id = fruit.imgUrl),
                        contentDescription = fruit.name,
                        modifier = Modifier.size(100.dp)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = fruit.name,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFD6336C)
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = fruit.description,
                        fontSize = 14.sp,
                        color = Color.Gray,
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "$${fruit.price} x kg",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF4CAF50)
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("Cantidad:", fontSize = 14.sp)
                        Spacer(modifier = Modifier.width(8.dp))
                        OutlinedTextField(
                            value = fruit.quantity,
                            onValueChange = {}, // Aca conectariamos con un viewmodel???
                            modifier = Modifier.width(60.dp),
                            singleLine = true
                        )
                    }
                }

                IconButton(
                    onClick = { favorito.value = !favorito.value },
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(8.dp)
                ) {
                    Icon(
                        imageVector = if (favorito.value) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
                        contentDescription = "Favorito",
                        tint = if (favorito.value) Color(0xFFE91E63) else Color.LightGray
                    )
                }
            }
        }
    }
}


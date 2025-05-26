package com.thiagoyairlezcano.frutymart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.thiagoyairlezcano.frutymart.ui.component.navegation.Navegation
import com.thiagoyairlezcano.frutymart.ui.theme.FrutyMartTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FrutyMartTheme {
                Navegation()
            }
        }
    }
}


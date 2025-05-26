package com.thiagoyairlezcano.frutymart.ui.component.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.thiagoyairlezcano.frutymart.ui.view.FruitScreen
import com.thiagoyairlezcano.frutymart.ui.view.HomeScreen
import com.thiagoyairlezcano.frutymart.ui.view.LoginScreen
import com.thiagoyairlezcano.frutymart.ui.view.RegisterScreen

sealed class Screen(val route: String) {
    object HomeScreen : Screen(route = "home")
    object LoginScreen : Screen(route = "login")
    object RegisterScreen : Screen(route = "register")
    object FruitScreen : Screen(route = "fruit")
}

@Composable
fun Navegation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(Screen.HomeScreen.route) { HomeScreen() }
        composable(Screen.LoginScreen.route) { LoginScreen() }
        composable(Screen.RegisterScreen.route) { RegisterScreen() }
        composable(Screen.FruitScreen.route) { FruitScreen() }
    }

}
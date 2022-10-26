package com.example.exam_63410043

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Nav(){
    val navContorller = rememberNavController()

    NavHost(navController = navContorller, startDestination = "Home"){
        composable(route =  "Home") {
            Home(navController = navContorller)
        }
        composable(route =  "Detail"){
            Detailpage(navController = navContorller)
        }
    }
}
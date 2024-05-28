package com.ebc.cupcakemakerapp.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ebc.cupcakemakerapp.enums.ScreensId
import com.ebc.cupcakemakerapp.views.onboarding.SplashScreen

@Composable
fun NavManager() {
    val navController = rememberNavController()
    
    Scaffold() {
        NavHost(
            navController = navController,
            startDestination = ScreensId.Splash.name,
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            composable(ScreensId.Splash.name) {
                SplashScreen(navController = navController)
            }
            composable(ScreensId.OnBoarding.name) {
                Text(text = "OnBoarding!!!!!")
            }
            
        }
    }
}
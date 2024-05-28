package com.ebc.cupcakemakerapp.views.onboarding

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.ebc.cupcakemakerapp.R
import com.ebc.cupcakemakerapp.enums.ScreensId
import com.ebc.cupcakemakerapp.ui.theme.CupcakeMakerAppTheme
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {

    var screen by remember {
        mutableStateOf("")
    }

    screen = ScreensId.OnBoarding.name

    LaunchedEffect(key1 = true) {
        delay(3000)
        navController.navigate(screen) {
            popUpTo(0)
        }
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
    ) {
        val compositionCat by rememberLottieComposition(
            LottieCompositionSpec.RawRes(R.raw.cat)
        )

        LottieAnimation(
            composition =  compositionCat,
            iterations = LottieConstants.IterateForever,
            modifier = Modifier
                .size(400.dp)
                .fillMaxWidth()
                .align(alignment = Alignment.Center)
        )
    }
}
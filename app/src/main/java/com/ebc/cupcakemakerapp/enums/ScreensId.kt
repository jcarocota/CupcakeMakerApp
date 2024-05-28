package com.ebc.cupcakemakerapp.enums

import androidx.annotation.StringRes
import com.ebc.cupcakemakerapp.R

enum class ScreensId (@StringRes val title: Int) {
    Splash(title = R.string.Splash),
    OnBoarding(title = R.string.OnBoarding)
}
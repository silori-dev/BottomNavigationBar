package com.xtremedevx.bottomnavbar.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp



@Composable
fun ProfileScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
       contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Profile Screen",
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
    }
}
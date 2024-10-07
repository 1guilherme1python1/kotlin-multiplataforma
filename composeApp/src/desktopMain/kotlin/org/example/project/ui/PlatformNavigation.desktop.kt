package org.example.project.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
actual fun PlatformNavigation() {
    Row(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .width(250.dp)
                .fillMaxHeight()
                .background(Color.Black)
        ) {
            Text("Home", modifier = Modifier.padding(16.dp), color = Color.White)
            Text("Settings", modifier = Modifier.padding(16.dp), color = Color.White)
            Text("Profile", modifier = Modifier.padding(16.dp), color = Color.White)
        }

        Box(modifier = Modifier.fillMaxSize().padding(start = 6.dp, top = 6.dp)) {
            UserInputForm()
        }
    }
}
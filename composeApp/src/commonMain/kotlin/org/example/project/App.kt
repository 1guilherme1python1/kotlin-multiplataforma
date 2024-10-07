package org.example.project

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import org.example.project.ui.PlatformNavigation
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
fun App() {
    MaterialTheme {
        Scaffold(modifier = Modifier.fillMaxSize()){
            PlatformNavigation()
        }
    }
}
//
//@Composable
//expect fun NavBar()
//
//@Composable
//expect fun DrawerNavigation()
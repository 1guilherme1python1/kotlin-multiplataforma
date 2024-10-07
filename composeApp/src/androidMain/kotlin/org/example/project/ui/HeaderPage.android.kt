package org.example.project.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import org.example.project.R

@Composable
actual fun HeaderPage() {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(painter = painterResource(id = R.drawable.mp_logo), contentDescription = null)
    }
}
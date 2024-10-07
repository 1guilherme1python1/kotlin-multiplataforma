package org.example.project.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import km_learn_multi.composeapp.generated.resources.Res
import km_learn_multi.composeapp.generated.resources.logo_sigep
import km_learn_multi.composeapp.generated.resources.mp_logo
import org.jetbrains.compose.resources.painterResource

@Composable
actual fun HeaderPage() {
    Row(
        modifier = Modifier.shadow(1.dp, shape = MaterialTheme.shapes.small, spotColor = Color.Black)
        .fillMaxWidth().height(80.dp).padding(12.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(painterResource(Res.drawable.mp_logo), null, modifier = Modifier.height(60.dp))
        Image(painterResource(Res.drawable.logo_sigep), null, modifier = Modifier.height(60.dp))
        Spacer(modifier = Modifier.width(10.dp))
    }
}
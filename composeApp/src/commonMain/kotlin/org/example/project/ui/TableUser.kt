package org.example.project.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UserTable(users: List<User>) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .background(Color(0xFFF5F5F5), shape = RoundedCornerShape(8.dp))
            .border(1.dp, Color.Gray, shape = RoundedCornerShape(8.dp))
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFE0E0E0))
                .padding(8.dp)
            ,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            HeaderCell(text = "Nome")
            HeaderCell(text = "CPF")
            HeaderCell(text = "Telefone")
        }

        users.forEachIndexed { index, user ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .background(if (index % 2 == 0) Color(0xFFF9F9F9) else Color.White),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                DataCell(text = user.name)
                DataCell(text = user.cpf)
                DataCell(text = user.phone)
            }
        }


    }
}

@Composable
fun HeaderCell(text: String) {
    Text(
        text = text,
        modifier = Modifier
            .padding(4.dp),
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        color = Color.Black
    )
}

@Composable
fun DataCell(text: String) {
    Text(
        text = text,
        modifier = Modifier
            .padding(4.dp),
        fontSize = 14.sp,
        color = Color.DarkGray
    )
}

data class User(
    val name: String,
    val cpf: String,
    val phone: String
)
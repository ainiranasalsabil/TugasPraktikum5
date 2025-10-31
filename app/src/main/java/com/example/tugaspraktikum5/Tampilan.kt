package com.example.tugaspraktikum5

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun FormDataDiri(modifier: Modifier = Modifier) {
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textStatus by remember { mutableStateOf("") }

    val gender = listOf("Laki-laki", "Perempuan")
    val statusKawin = listOf("Janda", "Lajang", "Duda")

    Column (
        modifier = modifier
            .fillMaxSize()
            .background(Color.LightGray),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.Blue),
            contentAlignment = Alignment.Center
        ) {
            Text (
                text = "Formulir Pendaftaran",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}

package com.teo.t3p1.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.teo.t3p1.Routes

@Composable
fun Screen2(navigationController: NavHostController, number: Number) {
    val onNextClick = {
        navigationController.navigate(Routes.Screen3.createRoute(3))
    }
    val onPreviousClick = {
        navigationController.navigate(Routes.Screen1.route)
    }
    Screen2View(
        number,
        onNextClick,
        onPreviousClick
    )
}

@Composable
fun Screen2View(number: Number, onNextClick: () -> Unit, onPreviousClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp),
        ) {
            Text(
                text = number.toString(),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(20.dp),
            ) {
                Button(onPreviousClick) {
                    Text("Anterior")
                }
                Button(onNextClick) {
                    Text("Siguiente")
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Screen2Preview() {
    Screen2View(number = 1, onNextClick = {}, onPreviousClick = {})
}
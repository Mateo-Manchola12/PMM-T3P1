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
fun Screen1(navigationController: NavHostController) {
    val onNextClick = {
        navigationController.navigate(Routes.Screen2.createRoute(2))
    }
    val onPreviousClick = {
        navigationController.navigate(Routes.Screen3.route)
    }

    Screen1View(
        onNextClick,
        onPreviousClick,
    )
}

@Composable
fun Screen1View(onNextClick: () -> Unit, onPreviousClick: () -> Unit) {
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
                text = "1",
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
fun Screen1Preview() {
    Screen1View(onNextClick = {}, onPreviousClick = {})
}
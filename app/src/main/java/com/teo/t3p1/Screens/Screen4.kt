package com.teo.t3p1.Screens

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
import androidx.navigation.compose.rememberNavController
import com.teo.t3p1.Routes

@Composable
fun Screen4(navigationController: NavHostController) {
    val onNextClick = {
        navigationController.navigate(Routes.Screen1.route)
    }
    val onPreviousClick = {
        navigationController.navigate(Routes.Screen3.route)
    }
    Screen4View(
        onNextClick,
        onPreviousClick
    )
}

@Composable
fun Screen4View(onNextClick: () -> Unit, onPreviousClick: () -> Unit) {
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
                text = "4",
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
fun Screen4Preview() {
    val navigationController = rememberNavController()
    Screen4(navigationController)
}
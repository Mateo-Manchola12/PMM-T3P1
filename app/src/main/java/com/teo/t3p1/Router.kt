package com.teo.t3p1

sealed class Routes(val route: String) {
    object Screen1 : Routes("screen1")
    object Screen2 : Routes("screen2/{number}") {
        fun createRoute(number: Int) = "screen2/$number"
    }

    object Screen3 : Routes("screen3?number={number}") {
        fun createRoute(number: Int) = "screen3?number=$number"
    }
}
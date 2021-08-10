package com.example.weatherforecast

data class WeatherModel(
    val city: CityModel,
    val temperature: Int,
    val humidity: Int,
    val speedWind: Double
) {}
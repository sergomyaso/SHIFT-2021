package com.example.weatherforecast

interface CurrentCityView : BaseView {
    fun bindWeather(weather: WeatherModel)
}
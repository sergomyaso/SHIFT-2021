package com.example.weatherforecast

import android.app.Application

class WeatherForecastApplication : Application() {

    lateinit var cityStorage: CityStorage
    lateinit var weatherStorage: WeatherStorage

    override fun onCreate() {
        super.onCreate()
        val cityLoader = LocalCityLoader()
        cityStorage = CityStorage()
        cityStorage.setData(cityLoader.loadData())
        val weatherLoader = LocalWeatherLoader(cityStorage.getAllData())
        weatherStorage = WeatherStorage()
        weatherStorage.setData(weatherLoader.loadData())

    }
}
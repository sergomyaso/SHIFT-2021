package com.example.weatherforecast

class CurrentCityPresenterFactory(private val storage: WeatherStorage, val id: Int) {
    fun create(): CurrentCityPresenter {
        return CurrentCityPresenter(storage, id)
    }

}
package com.example.weatherforecast

class ListPresenter(private val storage: CityStorage) : BasePresenter<ListView>() {

    fun onViewResumed() {
        val cities = storage.getAllData()
        view?.bindCities(cities)
    }

    fun onCityClicked(city:CityModel) {
        view?.openCurrentCityScreen(city)
    }
}
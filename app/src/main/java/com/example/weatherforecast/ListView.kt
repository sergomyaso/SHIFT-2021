package com.example.weatherforecast

interface ListView : BaseView {
    fun bindCities(cities: ArrayList<CityModel>)
    fun openCurrentCityScreen(city: CityModel)
}
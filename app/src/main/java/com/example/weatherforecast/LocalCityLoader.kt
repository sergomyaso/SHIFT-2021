package com.example.weatherforecast

class LocalCityLoader : Loader {

    private val cities = arrayListOf(
        CityModel(0, "Novosibirsk", "Russia"),
        CityModel(1, "Moscow", "Russia"),
        CityModel(2, "Tomsk", "Russia"),
        CityModel(3, "Mumbai", "India"),
        CityModel(4, "Tokyo", "Japan")
    )

    override fun loadData(): ArrayList<CityModel> {
        return cities
    }
}
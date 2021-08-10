package com.example.weatherforecast

class LocalWeatherLoader(cityList: ArrayList<CityModel>) : Loader {
    private val cityList = cityList
    private val weatherList = arrayListOf<WeatherModel>(
        WeatherModel(cityList[0], -30, 30, 12.5),
        WeatherModel(cityList[1], -10, 60, 7.5),
        WeatherModel(cityList[2], -50, 90, 18.5),
        WeatherModel(cityList[3], 20, 85, 3.2),
        WeatherModel(cityList[4], 16, 80, 9.3)
    )

    override fun loadData(): ArrayList<WeatherModel> {
        return weatherList
    }

}
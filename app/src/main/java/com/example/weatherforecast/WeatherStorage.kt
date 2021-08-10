package com.example.weatherforecast

class WeatherStorage : Storage {
    private val weatherList = ArrayList<WeatherModel>()
    override fun getAllData(): ArrayList<WeatherModel> {
        return weatherList
    }

    fun getDataByIndex(index:Int) : WeatherModel?{
       return this.weatherList.find { item : WeatherModel -> item.city.id == index}
    }

    fun setData(element: WeatherModel) {
        this.weatherList.add(element)
    }

    fun setData(elements_list: ArrayList<WeatherModel>) {
        this.weatherList.addAll(elements_list)
    }

}
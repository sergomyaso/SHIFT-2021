package com.example.weatherforecast

class CityStorage() : Storage {
    private val cityList = ArrayList<CityModel>()
    override fun getAllData(): ArrayList<CityModel> {
        return cityList
    }

    fun getTitlesCities(): ArrayList<String> {
        var titlesList = ArrayList<String>()
        for (element in this.cityList) {
            titlesList.add(element.title)
        }
        return titlesList
    }

    fun getDataByIndex(index: Int) : CityModel? {
        return this.cityList.find { item:CityModel -> item.id == index }
    }

    fun setData(element: CityModel) {
        this.cityList.add(element)
    }

    fun setData(elements_list: ArrayList<CityModel>) {
        this.cityList.addAll(elements_list)
    }
}
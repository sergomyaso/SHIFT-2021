package com.example.weatherforecast

class CurrentCityPresenter(
    private val weatherStorage: WeatherStorage,
    private val cityId: Int
) : BasePresenter<CurrentCityView>() {

    override fun onViewAttached() {
        val currentWeather = weatherStorage.getDataByIndex(cityId)
        if (currentWeather != null) {
            view?.bindWeather(currentWeather)
        }

    }


}

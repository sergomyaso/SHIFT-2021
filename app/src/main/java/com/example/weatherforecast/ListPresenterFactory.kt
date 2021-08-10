package com.example.weatherforecast

class ListPresenterFactory(private val storage: CityStorage) {
    fun create(): ListPresenter {
        return ListPresenter(storage)
    }
}
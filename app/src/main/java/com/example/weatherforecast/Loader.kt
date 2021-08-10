package com.example.weatherforecast

interface Loader {
    fun loadData() : ArrayList<*>
}
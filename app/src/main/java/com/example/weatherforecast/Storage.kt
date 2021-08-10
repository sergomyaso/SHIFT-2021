package com.example.weatherforecast

interface Storage {
    fun getAllData(): ArrayList<*>
}
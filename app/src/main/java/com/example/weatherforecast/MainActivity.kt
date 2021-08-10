package com.example.weatherforecast

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), com.example.weatherforecast.ListView {

    private val presenter by lazy {
        ListPresenterFactory((application as WeatherForecastApplication).cityStorage).create()
    }

    private lateinit var peopleList: RecyclerView
    private val recycleAdapter = AdapterRecycleView() {
        presenter.onCityClicked(it)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.attachView(this)

        peopleList = findViewById(R.id.cityList)
        peopleList.layoutManager = LinearLayoutManager(this)
        peopleList.adapter = recycleAdapter
    }

    override fun onResume() {
        super.onResume()
        presenter.onViewResumed()
    }


    override fun bindCities(list: ArrayList<CityModel>) {
        recycleAdapter.cities = list
    }


    override fun openCurrentCityScreen(city: CityModel) {
        val intent = Intent(this, CurrentCityActivity::class.java)
        intent.putExtra("id", city.id)
        startActivity(intent)
    }


    override fun onDestroy() {
        presenter.destroyView()
        super.onDestroy()
    }

}



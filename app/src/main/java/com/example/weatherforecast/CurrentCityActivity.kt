package com.example.weatherforecast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_current_city.*

class CurrentCityActivity : AppCompatActivity(), CurrentCityView {
    private lateinit var temperature: TextView
    private lateinit var humidity: TextView
    private lateinit var wind: TextView
    private lateinit var title: TextView
    private lateinit var country: TextView

    private val presenter by lazy {
        intent.extras?.getInt("id")?.let {
            CurrentCityPresenterFactory((application as WeatherForecastApplication).weatherStorage, it).create()
        }
    }

    private fun initViews() {
        temperature = findViewById(R.id.Temperature)
        humidity = findViewById(R.id.Humidity)
        wind = findViewById(R.id.WindSpeed)
        title = findViewById(R.id.Title)
        country = findViewById(R.id.Country)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_current_city)
        initViews()
        presenter?.attachView(this)
    }

    override fun bindWeather(weather: WeatherModel) {
        temperature.text = getString(R.string.temperature, weather.temperature.toString())
        wind.text = getString(R.string.windSpeed, weather.speedWind.toString())
        humidity.text = getString(R.string.humidity, weather.humidity.toString())
        title.text = getString(R.string.title, weather.city.title)
        country.text = getString(R.string.country, weather.city.country)
    }

}
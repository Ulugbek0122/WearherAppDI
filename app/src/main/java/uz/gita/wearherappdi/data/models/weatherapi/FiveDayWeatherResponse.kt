package com.example.weatherapp.service.dataclasses.fivedayweather

import uz.gita.data.models.fivedayweather.City

data class FiveDayWeatherResponse(
    val cod: String,
    val message: Int,
    val cnt: Int,
    val list: List<WeatherHourly>,
    val city: City
)

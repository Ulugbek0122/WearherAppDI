package uz.gita.wearherappdi.data.remote.api

import com.example.weatherapp.service.dataclasses.fivedayweather.FiveDayWeatherResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import uz.gita.wearherappdi.data.models.BaseResponse

interface WeatherApi {
    @GET("forecast")
    suspend fun getFiveDayWeather(@Query("lat")lat:Double,@Query("lon")lon:Double,@Query("appid")appid:String = "19a36a333d48e220809630dd06b9b155",@Query("units")units:String = "metric"):Response<BaseResponse<FiveDayWeatherResponse>>
}
package uz.gita.wearherappdi.domain.repositories

import com.example.weatherapp.service.dataclasses.fivedayweather.FiveDayWeatherResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response
import uz.gita.wearherappdi.data.models.BaseResponse

interface WeatherRepository {

    suspend fun getFiveDayWeather(lat:Double,lon:Double):Flow<BaseResponse<FiveDayWeatherResponse>>
}
package uz.gita.wearherappdi.domain.repositories.impl

import com.example.weatherapp.service.dataclasses.fivedayweather.FiveDayWeatherResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import uz.gita.wearherappdi.data.models.BaseResponse

import uz.gita.wearherappdi.data.remote.api.WeatherApi
import uz.gita.wearherappdi.domain.repositories.WeatherRepository
import uz.gita.wearherappdi.utils.hasConnection
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WeatherRepositoryImpl @Inject constructor(private val weatherApi: WeatherApi): WeatherRepository {


    override suspend fun getFiveDayWeather(lat: Double, lon: Double): Flow<BaseResponse<FiveDayWeatherResponse>> = flow {
        val response = weatherApi.getFiveDayWeather(lat, lon)

        if (hasConnection()){
            if (response.body() != null){
                
            }
        }
    }


}
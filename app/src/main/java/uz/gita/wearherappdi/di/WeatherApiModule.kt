package uz.gita.wearherappdi.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import uz.gita.wearherappdi.data.remote.api.WeatherApi
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
interface WeatherApiModule {

    @Provides
    fun provideWeatherApi(@Named("Weather") retrofit: Retrofit):WeatherApi = retrofit.create(WeatherApi::class.java)
}
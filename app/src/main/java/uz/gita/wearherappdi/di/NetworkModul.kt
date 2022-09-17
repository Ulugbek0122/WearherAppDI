package uz.gita.wearherappdi.di

import com.chuckerteam.chucker.api.ChuckerInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import uz.gita.wearherappdi.app.App
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModul {

    private val BASE_URL_GEO = "http://api.openweathermap.org/geo/1.0/"
    private val BASE_URL_WEATHER = "http://api.openweathermap.org/data/2.5/"

    @[Provides Singleton]
    fun provideHttpLogginInterceptor()=
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)


    @[Provides Singleton]
    fun provideChuckerInterceptor() =
        ChuckerInterceptor.Builder(App.instanse).build()


    @[Provides Singleton]
    fun provideHttpClient(
        loggingInterceptor: HttpLoggingInterceptor,
        chuckerInterceptor: ChuckerInterceptor
    ) =OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .addInterceptor(chuckerInterceptor)
        .build()

    @[Provides Singleton Named("Geo")]
    fun provideGeoRetrofit(client: OkHttpClient)=
        Retrofit.Builder()
            .baseUrl(BASE_URL_GEO)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()

    @[Provides Singleton Named("Weather")]
    fun provideWeatherRetrofit(client: OkHttpClient)=
        Retrofit.Builder()
            .baseUrl(BASE_URL_WEATHER)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
}
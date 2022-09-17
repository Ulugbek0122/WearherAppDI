package uz.gita.wearherappdi.di

import android.location.Location
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import uz.gita.wearherappdi.data.remote.api.GeoApi
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
interface GeoApiModule {

    @Provides
    fun provideLocationApi(@Named("Geo") retrofit: Retrofit):GeoApi = retrofit.create(GeoApi::class.java)
}
package uz.gita.wearherappdi.data.remote.api

import retrofit2.http.GET
import retrofit2.http.Query
import uz.gita.wearherappdi.data.models.geo.LocationResponse

interface GeoApi {

    @GET("direct")
    suspend fun getLocation(@Query("q")cityName:String,@Query("limit")limit:Int,@Query("appid")key:String = "19a36a333d48e220809630dd06b9b155"):LocationResponse
}
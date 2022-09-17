package uz.gita.wearherappdi.data.models.geo

data class LocationResponseItem(
    val country: String,
    val lat: Double,
    val local_names: LocalNames,
    val lon: Double,
    val name: String,
    val state: String
)
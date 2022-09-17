package uz.gita.wearherappdi.data.models

data class BaseResponse<T>(
    val message:String,
    val data:T?
)

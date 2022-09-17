package uz.gita.wearherappdi.app

import android.app.Application

class App:Application() {

    companion object{
        lateinit var  instanse:App

    }

    override fun onCreate() {
        super.onCreate()
        instanse = this
    }
}
package ua.turskyi.dagger2example

import android.app.Application
import ua.turskyi.dagger2example.dagger.AppComponent
import ua.turskyi.dagger2example.dagger.DaggerAppComponent
import ua.turskyi.dagger2example.dagger.DriverModule

class ExampleApp : Application() {
    private var component: AppComponent? = null
   override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.factory().create(DriverModule("Hans"))
    }

    val appComponent: AppComponent?
        get() = component
}
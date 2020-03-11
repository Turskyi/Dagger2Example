package ua.turskyi.dagger2example

import android.app.Application
import ua.turskyi.dagger2example.dagger.AppComponent
import ua.turskyi.dagger2example.dagger.DaggerAppComponent

class ExampleApp : Application() {
    private var component: AppComponent? = null
   override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.create()
    }

    val appComponent: AppComponent?
        get() = component
}
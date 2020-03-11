package ua.turskyi.dagger2example.dagger

import dagger.Component
import ua.turskyi.dagger2example.car.Driver
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {
    val driver: Driver
}
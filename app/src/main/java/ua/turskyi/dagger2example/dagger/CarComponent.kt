package ua.turskyi.dagger2example.dagger

import dagger.Component
import ua.turskyi.dagger2example.MainActivity
import ua.turskyi.dagger2example.car.Car

@Component(modules = [WheelsModule::class, DieselEngineModule::class])
interface CarComponent {
    val car: Car?

    fun inject(mainActivity: MainActivity?)
}
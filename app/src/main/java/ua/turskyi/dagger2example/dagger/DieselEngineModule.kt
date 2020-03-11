package ua.turskyi.dagger2example.dagger

import dagger.Module
import dagger.Provides
import ua.turskyi.dagger2example.car.DieselEngine
import ua.turskyi.dagger2example.car.Engine


@Module
class DieselEngineModule(private val horsePower: Int) {
    @Provides
    fun provideEngine(): Engine {
        return DieselEngine(horsePower)
    }
}
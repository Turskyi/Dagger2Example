package ua.turskyi.dagger2example.dagger

import dagger.Binds
import dagger.Module
import ua.turskyi.dagger2example.car.DieselEngine
import ua.turskyi.dagger2example.car.Engine

@Module
abstract class DieselEngineModule {
    @Binds
    abstract fun bindEngine(engine: DieselEngine?): Engine?
}
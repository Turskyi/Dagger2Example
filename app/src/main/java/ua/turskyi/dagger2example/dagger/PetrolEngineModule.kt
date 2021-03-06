package ua.turskyi.dagger2example.dagger

import dagger.Binds
import dagger.Module
import ua.turskyi.dagger2example.car.Engine
import ua.turskyi.dagger2example.car.PetrolEngine

@Module
abstract class PetrolEngineModule {
    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine
}
package ua.turskyi.dagger2example.dagger

import dagger.Module
import dagger.Provides
import ua.turskyi.dagger2example.car.Driver
import javax.inject.Singleton

@Module
object DriverModule {
    @Provides
    @Singleton
    fun provideDriver(): Driver {
        return Driver()
    }
}
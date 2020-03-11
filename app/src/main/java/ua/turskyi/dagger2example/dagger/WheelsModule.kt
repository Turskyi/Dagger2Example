package ua.turskyi.dagger2example.dagger

import dagger.Module
import dagger.Provides
import ua.turskyi.dagger2example.car.Rims
import ua.turskyi.dagger2example.car.Tires
import ua.turskyi.dagger2example.car.Wheels

@Module
object WheelsModule {
    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims?, tires: Tires?): Wheels {
        return Wheels(rims!!, tires!!)
    }
}
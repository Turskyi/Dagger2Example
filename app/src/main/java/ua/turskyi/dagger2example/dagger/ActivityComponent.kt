package ua.turskyi.dagger2example.dagger

import dagger.BindsInstance
import dagger.Subcomponent
import ua.turskyi.dagger2example.MainActivity
import ua.turskyi.dagger2example.car.Car
import javax.inject.Named

@PerActivity
@Subcomponent(modules = [WheelsModule::class, PetrolEngineModule::class])
interface ActivityComponent {
    val car: Car

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @Named("horse power") horsePower: Int,
            @BindsInstance @Named("engine capacity") engineCapacity: Int
        ): ActivityComponent
    }
}
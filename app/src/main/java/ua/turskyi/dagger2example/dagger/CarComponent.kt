package ua.turskyi.dagger2example.dagger

import dagger.BindsInstance
import dagger.Component
import ua.turskyi.dagger2example.MainActivity
import ua.turskyi.dagger2example.car.Car
import javax.inject.Named

@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {
    val car: Car

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun horsePower(@Named("horse power") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity: Int): Builder
        fun build(): CarComponent
    }
}
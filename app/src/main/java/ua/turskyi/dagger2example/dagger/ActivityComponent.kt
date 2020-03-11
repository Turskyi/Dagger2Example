package ua.turskyi.dagger2example.dagger

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import ua.turskyi.dagger2example.MainActivity
import ua.turskyi.dagger2example.car.Car
import javax.inject.Named

@PerActivity
@Subcomponent(
    modules = [WheelsModule::class, DieselEngineModule::class]
)
interface ActivityComponent {
    val car: Car

    fun inject(mainActivity: MainActivity)

/*    @Component.Builder
    interface Builder {
        @BindsInstance
        fun horsePower(@Named("horse power") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity: Int): Builder
        fun appComponent(component: AppComponent?): Builder
        fun build(): ActivityComponent
    }*/
}
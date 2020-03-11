package ua.turskyi.dagger2example.dagger

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {
    fun getActivityComponent(dieselEngineModule: DieselEngineModule): ActivityComponent
}
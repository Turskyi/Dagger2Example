package ua.turskyi.dagger2example

import dagger.Component

@Component
interface CarComponent {
    val car: Car?

    fun inject(mainActivity: MainActivity?)
}
package ua.turskyi.dagger2example

import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car
}
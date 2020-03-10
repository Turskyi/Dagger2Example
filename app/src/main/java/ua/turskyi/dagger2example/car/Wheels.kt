package ua.turskyi.dagger2example.car

import ua.turskyi.dagger2example.car.Rims
import ua.turskyi.dagger2example.car.Tires

class Wheels(//we don't own this class so we can't annotate it with @Inject
    private val rims: Rims, private val tires: Tires
)
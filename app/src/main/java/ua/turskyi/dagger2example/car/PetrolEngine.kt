package ua.turskyi.dagger2example.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @param:Named("horse power") private val horsePower: Int,
    @param:Named("engine capacity") private val engineCapacity: Int
) : Engine {
    companion object {
        private const val TAG = "Car"
    }

    override fun start() {
        Log.d(
            TAG, """
     Petrol engine started. 
     Horsepower: $horsePower
     Engine capacity: $engineCapacity
     """.trimIndent()
        )
    }
}
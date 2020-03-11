package ua.turskyi.dagger2example.car

import android.util.Log

class DieselEngine(private val horsePower: Int) : Engine {
    companion object {
        private const val TAG = "Car"
    }
    override fun start() {
        Log.d(
            TAG,
            "Diesel engine started. Horsepower: $horsePower"
        )
    }
}
package ua.turskyi.dagger2example.car

import android.util.Log

class Tires {
    companion object {
        //we don't own this class so we can't annotate it with @Inject
        private const val TAG = "Car"
    }

    fun inflate() {
        Log.d(TAG, "Tires inflated")
    }
}
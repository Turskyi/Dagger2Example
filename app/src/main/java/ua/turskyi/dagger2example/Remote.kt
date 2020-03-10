package ua.turskyi.dagger2example

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {
    companion object {
        private const val TAG = "Car"
    }
    fun setListener(car: Car?) {
        Log.d(TAG, "Remote connected")
    }
}
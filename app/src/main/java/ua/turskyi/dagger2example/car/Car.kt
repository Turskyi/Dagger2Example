package ua.turskyi.dagger2example.car

import android.util.Log
import ua.turskyi.dagger2example.dagger.PerActivity
import javax.inject.Inject

@PerActivity
class Car @Inject constructor(
    private val driver: Driver,
    private val engine: Engine,
    private val wheels: Wheels
) {
    companion object {
        private const val TAG = "Car"
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Log.d(TAG, "$driver drives $this")
    }
}
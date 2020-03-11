package ua.turskyi.dagger2example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ua.turskyi.dagger2example.car.Car
import ua.turskyi.dagger2example.dagger.DaggerCarComponent
import ua.turskyi.dagger2example.dagger.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component = DaggerCarComponent.builder()
            .dieselEngineModule(DieselEngineModule(100))
            .build()
        component.inject(this)
        car.drive()
    }
}
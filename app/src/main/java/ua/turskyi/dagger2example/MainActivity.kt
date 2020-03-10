package ua.turskyi.dagger2example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ua.turskyi.dagger2example.car.Car
import ua.turskyi.dagger2example.dagger.CarComponent
import ua.turskyi.dagger2example.dagger.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component: CarComponent = DaggerCarComponent.create()
        component.inject(this)
        car.drive()
    }
}
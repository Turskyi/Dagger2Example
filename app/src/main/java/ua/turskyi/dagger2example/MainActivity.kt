package ua.turskyi.dagger2example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private var car: Car? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val component: CarComponent = DaggerCarComponent.create()

        car = component.getCar()
        car?.drive()
    }
}

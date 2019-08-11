package krizsanmilan.com.kotlinproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    var carList: ArrayList<CarModel>?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createList()

        val recycleView = findViewById<RecyclerView>(R.id.recycleView)
        recycleView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        var adapter = ListAdapter(carList!!, this)
        recycleView.adapter = adapter
    }

    private fun createList(){
        var car1 = CarModel("Ford", "Fiesta", EnginePower.LOW.ordinal, "automatic", "green")
        var car2 = CarModel("Ford", "Focus", EnginePower.MEDIUM.ordinal, "manual", "white")
        var car3 = CarModel("Ford", "Mustang", EnginePower.HIGH.ordinal, "manual", "red")
        carList = ArrayList<CarModel>()
        carList!!.add(car1)
        carList!!.add(car2)
        carList!!.add(car3)
    }
}

package com.example.myrecycleviewritg2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecycleviewritg2.data.Product
import com.example.myrecycleviewritg2.data.ProductAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productList = listOf<Product>(
            Product("Apple", 2.50, R.drawable.ic_baseline_ac_unit_24),
            Product("Durian", 12.50, R.drawable.ic_baseline_add_alert_24),
            Product("Orange", 1.30, R.drawable.ic_baseline_ac_unit_24),
            Product("Pen", 5.30, R.drawable.ic_baseline_add_alert_24),
            Product("Apple", 2.50, R.drawable.ic_baseline_ac_unit_24),
            Product("Durian", 12.50, R.drawable.ic_baseline_ac_unit_24),
            Product("Orange", 1.30, R.drawable.ic_baseline_add_alert_24),
            Product("Pen", 5.30, R.drawable.ic_baseline_ac_unit_24),
            Product("Apple", 2.50, R.drawable.ic_baseline_add_alert_24),
            Product("Durian", 12.50, R.drawable.ic_baseline_ac_unit_24),
            Product("Orange", 1.30, R.drawable.ic_baseline_add_alert_24),

        )

        val myRecyclerView : RecyclerView = findViewById(R.id.productRecycleView)
        myRecyclerView.adapter = ProductAdapter(productList)
        myRecyclerView.setHasFixedSize(true)

    }
}
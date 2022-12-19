package com.example.coderswag_2.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coderswag_2.R
import com.example.coderswag_2.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
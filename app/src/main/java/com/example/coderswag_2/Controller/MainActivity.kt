package com.example.coderswag_2.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.coderswag_2.Adapters.CategoryAdapter
import com.example.coderswag_2.Model.Category
import com.example.coderswag_2.Model.Product
import com.example.coderswag_2.R
import com.example.coderswag_2.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this@MainActivity, DataService.categories)
        categoryListView.adapter = adapter
    }
}
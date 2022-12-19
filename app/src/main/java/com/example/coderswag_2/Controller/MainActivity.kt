package com.example.coderswag_2.Controller

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.Adapters.CategoryRecyclerAdapter
import com.example.coderswag_2.Model.Category
import com.example.coderswag_2.R
import com.example.coderswag_2.Services.DataService
import com.example.coderswag_2.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(this@MainActivity, DataService.categories){ it
            Toast.makeText(this@MainActivity, it.title, Toast.LENGTH_SHORT).show()
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, it.title)
           startActivity(productIntent)
        }
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)
        }
    }

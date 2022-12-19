package com.example.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag_2.Model.Category
import com.example.coderswag_2.R

class CategoryRecyclerAdapter(private val context: Context, private val categories: List<Category>)
    : RecyclerView.Adapter<CategoryRecyclerAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item, parent, false)
      return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindCategory(categories[position], context)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        private val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category: Category, context: Context) {
            val resourceId = context.resources.getIdentifier(category.image, "drawable",
                context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title
        }
    }

}
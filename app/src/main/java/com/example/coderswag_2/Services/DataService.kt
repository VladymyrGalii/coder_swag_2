package com.example.coderswag_2.Services

import com.example.coderswag_2.Model.Category
import com.example.coderswag_2.Model.Product
import java.nio.file.Files.list

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )
    val hats = listOf(
        Product("Hat1", "$12", "hat1"),
        Product("Hat2", "$15", "hat2"),
        Product("Hat3", "$13", "hat3"),
        Product("Hat4", "$14", "hat4")
    )
    val hoodie = listOf(
        Product("Hoodie1", "$12", "hodie1"),
        Product("Hoodie2", "$15", "hodie2"),
        Product("Hoodie3", "$13", "hodie3"),
        Product("Hoodie4", "$14", "hodie4")
    )
    val shirt = listOf(
        Product("Short1", "$12", "hat1"),
        Product("Short2", "$15", "hat2"),
        Product("Short3", "$13", "hat3"),
        Product("Short4", "$14", "hat4")
    )
    val digitalGood = listOf<Product>()

    fun getProducts(category: String): List<Product> {
        return when (category) {
            "SHIRTS" -> shirt
            "HOODIES" -> hoodie
            "HATS" -> hats
            else -> digitalGood
        }
    }


}
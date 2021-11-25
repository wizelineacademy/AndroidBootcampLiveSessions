package com.wizeline.androidbootcamplivesessions.ui.main.session_five

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProductsRepository @Inject constructor() {
  private val products = listOf(
    Product(id = 1, name = "laptop"),
    Product(id = 1, name = "keyboard"),
    Product(id = 3, name = "mouse")
  )

  fun getProducts(): List<Product> {
    return products
  }

  fun saveProduct(product: Product) {
    // some code to save product
  }
}
package com.wizeline.androidbootcamplivesessions.ui.main.session_five

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(
  val repository: ProductsRepository
  // and any other dependencies
) : ViewModel() {
  val productsLiveData = MutableLiveData<List<Product>>()
  // this is manual instantiation
  // private val repository = ProductsRepository()

  fun loadProducts() {
    productsLiveData.value = repository.getProducts()
  }

  fun saveProduct() {
    repository.saveProduct(Product(id = 1, name = "product name"))
  }
}

// Hilt is generating a Dependency Graph
/*
@HiltAndroidApp -> CustomApplication
 |_ @AndroidEntryPoint -> ProductsActivity
   |_ @HiltViewModel -> ProductsViewModel
     |_ @Inject -> ProductsRepository
 |- @AndroidEntryPoint -> ConstraintActivity
 |_ etc

*/
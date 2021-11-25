package com.wizeline.androidbootcamplivesessions.ui.main.session_five

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.wizeline.androidbootcamplivesessions.CustomApplication
import com.wizeline.androidbootcamplivesessions.R
import com.wizeline.androidbootcamplivesessions.databinding.ActivityProductsBinding
import com.wizeline.androidbootcamplivesessions.ui.main.session_four.CoolTextView.Presentation
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProductsActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProductsBinding
  val viewModel: ProductsViewModel by viewModels()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityProductsBinding.inflate(layoutInflater)
    setContentView(binding.root)
    bindProducts()
  }

  private fun bindProducts() {
    binding.coolTextViewOne.bind(Presentation(
      title = R.string.product_one_name,
      description = R.string.product_one_description,
      buttonText = R.string.buy_now,
      onButtonClicked = {
        Toast.makeText(applicationContext, "you clicked buy...", Toast.LENGTH_LONG)
          .show()
      }
    ))
    binding.coolTextViewTwo.bind(Presentation(
      title = R.string.product_two_name,
      description = R.string.product_two_description,
      buttonText = R.string.buy_now,
      onButtonClicked = {
        Toast.makeText(applicationContext, "you clicked buy...", Toast.LENGTH_LONG)
          .show()
      }
    ))
  }
}
package com.wizeline.androidbootcamplivesessions

import android.app.Application
import com.wizeline.androidbootcamplivesessions.ui.main.session_five.ProductsRepository
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class CustomApplication : Application() {

  override fun onCreate() {
    super.onCreate()
    // here you can add some third-party configuration
  }
}
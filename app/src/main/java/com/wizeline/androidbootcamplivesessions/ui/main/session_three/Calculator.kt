package com.wizeline.androidbootcamplivesessions.ui.main.session_three

class Calculator {
  private val noData = -1
  var currentResult: Int = noData
    private set

  fun add(number: Int) {
    if (currentResult == noData) {
      currentResult = 0
    }
    currentResult += number
  }
}
package com.wizeline.androidbootcamplivesessions.ui.main.session_three

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito

class CalculatorTest {
  private lateinit var calculator: Calculator

  @Before fun setUp() {
    calculator = Calculator()
  }

  @Test fun `initial result is -1 when there's no operations`() {
    // Given

    // When
    val initialResult = calculator.currentResult

    // Then
    assertEquals(-1, initialResult)
  }

  @Test fun `add increases the current result by the new number`() {
    // Given
    val newNumber = 5
    val expectedTotal = newNumber + newNumber

    // When
    calculator.add(newNumber)
    calculator.add(newNumber)

    // Then
    // assertEquals(5, calculator.currentResult)
    assertEquals(10, calculator.currentResult)
    assertEquals(expectedTotal, calculator.currentResult)
  }
}
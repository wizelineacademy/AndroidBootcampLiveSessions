package com.wizeline.androidbootcamplivesessions.ui.main

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.setMain
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainViewModelTest {
  private lateinit var mainViewModel: MainViewModel
  @ExperimentalCoroutinesApi val dispatcher = TestCoroutineDispatcher()

  @get:Rule
  val rule = InstantTaskExecutorRule()

  @ExperimentalCoroutinesApi
  @Before fun setUp() {
    Dispatchers.setMain(dispatcher)
    mainViewModel = MainViewModel()
  }

  @ExperimentalCoroutinesApi
  @Test fun `loadData`() {
    // Given

    // When
    mainViewModel.loadData()
    dispatcher.advanceUntilIdle()

    // Then
    assertEquals("Data loading successful!", mainViewModel.message.value)
  }
}
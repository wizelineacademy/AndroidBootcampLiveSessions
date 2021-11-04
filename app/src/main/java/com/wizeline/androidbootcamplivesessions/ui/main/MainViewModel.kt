package com.wizeline.androidbootcamplivesessions.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

sealed class NetworkState
object Success : NetworkState()
object Error : NetworkState()
object Warning : NetworkState()
object Loading: NetworkState()

class MainViewModel : ViewModel() {
  private val _message: MutableLiveData<String> = MutableLiveData()
  val message: LiveData<String> = _message

  // We simulate data loading from API
  fun loadData() {
    viewModelScope.launch {
      _message.postValue("Loading.....")
      delay(2000)
      _message.postValue("Data loading successful!")
    }
    // _message.value = "Data loading successful!"
  }

  /**
   * return Success if connection is working, otherwise network error
   */
  fun verifyNetworkConnection(): NetworkState {
    val isConnected = false
    return if (isConnected) Success else Error
  }
}
package com.wizeline.androidbootcamplivesessions.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.wizeline.androidbootcamplivesessions.databinding.MainFragmentBinding

class MainFragment : Fragment() {

  companion object {
    fun newInstance() = MainFragment()
  }

  private lateinit var binding: MainFragmentBinding
  private val mainViewModel: MainViewModel by viewModels()

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    binding = MainFragmentBinding.inflate(inflater, container, false)
    return binding.root
  }

  override fun onViewCreated(
    view: View,
    savedInstanceState: Bundle?
  ) {
    super.onViewCreated(view, savedInstanceState)
    // val textview = findViewByID(R.id.textView)
    // textView.text = "the new text"
    // binding.primaryButton.setOnClickListener {
    //   binding.messageTextView.text = "the new text - more text"
    // }
    mainViewModel.message.observe(viewLifecycleOwner, {
      binding.messageTextView.text = it
    })
    binding.primaryButton.setOnClickListener {
      mainViewModel.loadData()
    }
  }
}
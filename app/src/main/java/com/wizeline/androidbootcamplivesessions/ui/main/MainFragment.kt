package com.wizeline.androidbootcamplivesessions.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.wizeline.androidbootcamplivesessions.databinding.MainFragmentBinding
import com.wizeline.androidbootcamplivesessions.ui.main.session_five.ProductsActivity
import com.wizeline.androidbootcamplivesessions.ui.main.session_four.ConstraintActivity
import com.wizeline.androidbootcamplivesessions.ui.main.session_two.Direction
import com.wizeline.androidbootcamplivesessions.ui.main.session_two.Presentation
import com.wizeline.androidbootcamplivesessions.ui.main.session_two.User
import com.wizeline.androidbootcamplivesessions.ui.main.session_two.cleanString
import com.wizeline.androidbootcamplivesessions.ui.main.session_two.formatText

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

  /*
  fun handlingNullSamples() {
    var user: User? = null

    var userName = user?.name ?: "default Name"
    var password = user.getPassword() ?: "noPassword"

    userName = user!!.name // this throws exception when the variable is null

    val number: Any = 1
    val numberCast = number as Int // can throw exception when the variable cannot be casted
    val numberCastOptional = number as? Int
  }

   */

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

    liveSessionTwo()

    val presentation = Presentation(
      userNameText = "Paul",
      errorMessage = "something went wrong. Please try again..",
      buttonText = "Continue",
      onButtonClicked = {
        Toast.makeText(activity, "click works from Presentation", Toast.LENGTH_SHORT).show()
      }
    )
    presentation.userNameText.cleanString()
    // binding.secondaryButton.text = presentation.buttonText
    binding.secondaryButton.text = presentation.formatText()
    binding.secondaryButton.setOnClickListener {
      // presentation.onButtonClicked.invoke()
      presentation.onButtonClicked()
    }

    binding.secondActivity.setOnClickListener {
      val intent = Intent(context, ConstraintActivity::class.java)
      startActivity(intent)
    }
    binding.productsButton.setOnClickListener {
      val intent = Intent(context, ProductsActivity::class.java)
      startActivity(intent)
    }
  }

  private fun liveSessionTwo() {
    val user = User(id = "1", name = "Paul", lastName = "Estrada", age = 18)
    val userTwo = User(id = "2", name = "Paul", lastName = "Estrada", age = 18)
    val result = user == userTwo
    var message = if (result) "They are equal" else "They are different"
    Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()

    val userCopy = user.copy(name = "Juan")

    val networkState = mainViewModel.verifyNetworkConnection()
    message = if (networkState == Success) "is connected" else "something went wrong.."
    Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()

    // Ordinal is the unique identifier for each Enum value
    Direction.NORTH.ordinal
  }
}
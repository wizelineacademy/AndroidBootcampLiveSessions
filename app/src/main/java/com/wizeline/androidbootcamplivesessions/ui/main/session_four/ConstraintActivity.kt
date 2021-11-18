package com.wizeline.androidbootcamplivesessions.ui.main.session_four

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.wizeline.androidbootcamplivesessions.R
import com.wizeline.androidbootcamplivesessions.ui.main.session_four.CoolTextView.Presentation

class ConstraintActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_constraint)

    val coolTextView = findViewById<CoolTextView>(R.id.cool_text_view_one)
    coolTextView.bind(Presentation(
      title = R.string.title,
      description = R.string.description,
      buttonText = R.string.click_me,
      onButtonClicked = {
        Toast.makeText(applicationContext, "click works in custom view...", Toast.LENGTH_LONG)
          .show()
      }
    ))
  }
}
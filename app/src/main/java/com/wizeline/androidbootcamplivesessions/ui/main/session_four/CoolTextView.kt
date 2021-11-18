package com.wizeline.androidbootcamplivesessions.ui.main.session_four

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.StringRes
import com.wizeline.androidbootcamplivesessions.R
import com.wizeline.androidbootcamplivesessions.databinding.CoolTextViewBinding

class CoolTextView @JvmOverloads constructor(
  context: Context,
  attrs: AttributeSet? = null,
  defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {
  // Behaviors
  // set title
  // set description
  // configure button (text and onClick event)
  private lateinit var binding: CoolTextViewBinding

  class Presentation(
    @StringRes val title: Int,
    @StringRes val description: Int,
    @StringRes val buttonText: Int,
    val onButtonClicked: () -> Unit,

    )

  init {
    View.inflate(context, R.layout.cool_text_view, this)
    // Alternatively you can use ViewBinding instead for inflating following current best practices
    // binding = CoolTextViewBinding.inflate(LayoutInflater.from(context), this, false)
  }

  fun bind(presentation: Presentation) {
    val title = findViewById<TextView>(R.id.title)
    val description = findViewById<TextView>(R.id.description)
    val actionButton = findViewById<Button>(R.id.actionButton)
    title.setText(presentation.title)
    description.setText(presentation.description)
    actionButton.setText(presentation.buttonText)
    actionButton.setOnClickListener { presentation.onButtonClicked() }

    // Alternatively you can use the generated Binding class for all views
    // binding.apply {
    //   title.setText(presentation.title)
    //   description.setText(presentation.description)
    //   actionButton.setText(presentation.buttonText)
    //   actionButton.setOnClickListener { presentation.onButtonClicked() }
    // }
  }
}
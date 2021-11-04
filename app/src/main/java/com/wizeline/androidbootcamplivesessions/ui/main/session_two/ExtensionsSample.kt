package com.wizeline.androidbootcamplivesessions.ui.main.session_two

fun Presentation.formatText(): String {
  return "The user name is: ${this.userNameText}"
}

fun String.cleanString(): String {
  return this.replace("{}", " ", ignoreCase = true)
}
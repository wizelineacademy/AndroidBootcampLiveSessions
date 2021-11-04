package com.wizeline.androidbootcamplivesessions.ui.main.session_two;

import androidx.annotation.Nullable;

public class UserJava {
  String name;
  String lastName;
  int age;

  @Override public boolean equals(@Nullable Object obj) {
    UserJava userJava = (UserJava) obj;
    return this.name.equals(userJava.name) && this.age == userJava.age
        && this.lastName.equals(userJava.lastName);
    //return super.equals(obj);
  }
}

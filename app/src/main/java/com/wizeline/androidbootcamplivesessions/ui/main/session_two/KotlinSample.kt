package com.wizeline.androidbootcamplivesessions.ui.main.session_two

class KotlinSample

data class User(
  val id: String,
  val name: String,
  val lastName: String,
  val age: Int
)

enum class Direction {
  NORTH,
  SOUTH,
  WEST,
  EAST
}


// class Direction {
//   val north = 4
//   val south = 5
//   val west = 6
//   val east = 7
//
//   fun verifyDirection() : Boolean {
//     return north < 2
//   }
// }

// class User(
//   val name: String,
//   val lastName: String,
//   val age: Int
// )

// JAVA
// class User {
//   private String name;
//   private int age;
//
//   public User(String name, int age) {
//     this.name = name;
//     this.age = age;
//   }
//
//   public String getName() {
//     return name;
//   }
//
//   public int getAge() {
//     return age;
//   }
//
//   public setName(String name) {
//     this.name = name;
//   }
//
//   public boolean equals(User otherUser) {
//
//   }
// }
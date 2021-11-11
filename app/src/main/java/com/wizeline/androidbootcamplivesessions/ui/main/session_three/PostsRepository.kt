package com.wizeline.androidbootcamplivesessions.ui.main.session_three

class PostsRepository(
  private val apiService: ApiService
) {

  private fun doSomething() {

  }

  fun createPosts() {
    doSomething()
  }

  /**
   * returns a list of posts from an API
   */
  fun fetchPosts(): List<Post> = apiService.getPosts()
}

class Post(
  val id: Int,
  val body: String
)

class ApiService {
  fun getPosts() : List<Post> {
    return listOf(
      Post(1, "first message"),
      Post(2, "first message"),
      Post(3, "first message")
    )
  }
}

class CryptoCoin(
  val success: Boolean,
  val payload: String
)
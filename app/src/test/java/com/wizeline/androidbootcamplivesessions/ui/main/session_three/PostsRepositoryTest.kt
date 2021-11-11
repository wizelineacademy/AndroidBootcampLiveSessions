package com.wizeline.androidbootcamplivesessions.ui.main.session_three

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

class PostsRepositoryTest {
  private lateinit var postsRepository: PostsRepository
  @Mock
  private lateinit var apiService: ApiService
  val posts = listOf(
    Post(1, "first message"),
    Post(2, "first message"),
    Post(3, "first message")
  )

  @Before fun setUp() {
    apiService = mock()
    postsRepository = PostsRepository(apiService)
  }

  @Test fun `fetchPosts returns a list of Posts`() {
    // Given
    whenever(apiService.getPosts()) doReturn posts

    // When
    val posts = postsRepository.fetchPosts()

    // Then
    assertFalse(posts.isEmpty())
  }

  @Test fun `posts contains data`() {
    // Given

    // When
    val posts = postsRepository.fetchPosts()

    // Then
    posts.forEach {
      assertTrue(it.id > 0)
      assertTrue(it.body.isNotEmpty())
    }
  }

  @Test fun `repository can return empty posts`() {
    // Given
    whenever(apiService.getPosts()) doReturn emptyList()

    // When
    val posts = postsRepository.fetchPosts()

    // Then
    assertTrue(posts.isEmpty())
  }
}
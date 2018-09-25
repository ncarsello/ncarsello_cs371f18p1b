package hw

import org.junit.Assert._

import org.junit.After

import org.junit.Before

import org.junit.Test

//remove if not needed
import scala.collection.JavaConversions._

class TestHelloWorld {

  private var fixture: HelloWorld = _

  @Before
  def setUp(): Unit = {
    fixture = new HelloWorld()
  }

  @After
  def tearDown(): Unit = {
    fixture = null
  }

  @Test
  def getMessage(): Unit = {
    assertNotNull(fixture)
    assertEquals("hello world", fixture.getMessage)
  }

  @Test
  def getMessage2(): Unit = {
// this test is broken - fix it!
    assertNull(fixture)
    assertEquals("hello world", fixture.getMessage)
  }

  @Test
  def getYear(): Unit = {
// this test is OK, fix HelloWorld.java to make it pass!
    assertNotNull(fixture)
    assertEquals(2018, fixture.getYear)
  }

}

package example

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
  class WorksheetSuite extends FunSuite {

  test("sqrt 2") {
    assert(Session.abs(-1) === 1)
  }
  test("sqrt 0.001") {
    assert(Session.sqrt(0.001) === 0.03162277660168379)
  }
  test("sqrt 1.0e20") {
    assert(Session.sqrt(1.0e20) === 1)
  }

  test("factorial") {
    assert(Session.factorial(4, 1) === 24)
  }
}

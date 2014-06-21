import org.scalatest.FunSuite
import com.github.tnoda.uppwerlowerbound.BinarySearch._

class BinarySearchSuite extends FunSuite {

  test("lowerBound") {
    val A = Array(1, 2, 3, 3, 3, 5, 8)
    val expected = Array(0, 1, 2, 5, 5, 6, 6, 6, 7, 7)
    (0 until 10)foreach { i =>
      assert(lowerBound(A, 0, A.length, i + 1) == expected(i))
    }
  }

  test("upperBound") {
    val A = Array(1, 2, 3, 3, 3, 5, 8)
    val expected = Array(1, 2, 5, 5, 6, 6, 6, 7, 7, 7)
    (0 until 10).foreach { i =>
      assert(upperBound(A, 0, A.length, i + 1) == expected(i))
    }
  }
}

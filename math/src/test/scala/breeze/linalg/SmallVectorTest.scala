package breeze.linalg

import breeze.math._
import breeze.storage.Zero
import org.junit.runner.RunWith
import org.scalacheck._
import org.scalatest._
import org.scalatest.junit._

import scala.reflect.ClassTag

/**
 *
 * @author Boleyn Su
 */

@RunWith(classOf[JUnitRunner])
class SmallVectorTest extends FunSuite {

  test("smallDotProductFloat") {
    val v = new DenseVector(Array(.1f,.2f,.3f,.4f,.5f,.6f,.7f))
    val w = new DenseVector(Array(1.0f,1.0f,1.0f,1.0f,1.0f,1.0f,1.0f))
    assert(breeze.numerics.closeTo(v.dot(w), 2.8f))
  }

  test("smallDotProductDouble") {
    val v = new DenseVector(Array(.1,.2,.3,.4,.5,.6,.7))
    val w = new DenseVector(Array(1.0,1.0,1.0,1.0,1.0,1.0,1.0))
    assert(breeze.numerics.closeTo(v.dot(w), 2.8))
  }
}

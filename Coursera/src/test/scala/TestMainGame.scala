import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.flatspec.AnyFlatSpec

class TestMainGame extends AnyFlatSpec {
  behavior of "MainGame"
  it should   "start witl 'Hello' " in {
    assert("Hello World".startsWith("Hello"))
  }
}

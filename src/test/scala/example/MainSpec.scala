package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MainSpec extends AnyFlatSpec with Matchers {
  "The Main object" should "say hello" in {
    Main.greeting shouldEqual "helloname: scala library sample 001, version: 0.4.7-SNAPSHOT, scalaVersion: 2.13.1, sbtVersion: 1.6.2, builtAtString: 2022-04-22 07:27:48.527+0000, builtAtMillis: 1650612468527"
  }
}

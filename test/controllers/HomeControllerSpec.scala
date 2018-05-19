package controllers

import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import play.api.test._
import play.api.test.Helpers._
import play.api._
import play.api.mvc._

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 *
 * For more information, see https://www.playframework.com/documentation/latest/ScalaTestingWithScalaTest
 */
class HomeControllerSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {

  "HomeController GET" should {

    "Test service /codebreaker/5276" in {
      val controller = inject[HomeController]
      val home = controller.codeBreakerService(5276).apply(FakeRequest(GET, "/codebreaker/5276"))

      status(home) mustBe OK
      contentType(home) mustBe Some("application/json")
      contentAsString(home) must include ("X__")
    }

    "Test Hola Mundo ('Pilar') From Unit" in {
      val controller = new HomeController(stubControllerComponents())
      val r = controller.testHolaMundo("Pilar")
      r mustBe "Hola, Pilar"
    }

    "Test CodeBreaker (5623) From Unit" in {
      val controller = new HomeController(stubControllerComponents())
      val r = controller.codeBreaker(5623)
      r mustBe "XXXX"
    }

    "Test CodeBreaker (2365) From Unit" in {
      val controller = new HomeController(stubControllerComponents())
      val r = controller.codeBreaker(2365)
      r mustBe "____"
    }

     "Test CodeBreaker (1497) From Unit" in {
      val controller = new HomeController(stubControllerComponents())
      val r = controller.codeBreaker(1497)
      r mustBe ""
    }


     "Test CodeBreaker (5607) From Unit" in {
      val controller = new HomeController(stubControllerComponents())
      val r = controller.codeBreaker(5607)
      r mustBe "XX"
    }


 "Test CodeBreaker (5287) From Unit" in {
      val controller = new HomeController(stubControllerComponents())
      val r = controller.codeBreaker(5287)
      r mustBe "X_"
    }

     "Test CodeBreaker (2583) From Unit" in {
      val controller = new HomeController(stubControllerComponents())
      val r = controller.codeBreaker(2583)
      r mustBe "X__"
}
      "Test CodeBreaker (334433) From Unit" in {
      val controller = new HomeController(stubControllerComponents())
      val r = controller.codeBreaker(334433)
      r mustBe "error"
      }

      "Test CodeBreaker (3333) From Unit" in {
      val controller = new HomeController(stubControllerComponents())
      val r = controller.codeBreaker(3333)
      r mustBe "error"
      }

  }
}

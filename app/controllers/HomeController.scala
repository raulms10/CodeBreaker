package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def dec2rom(n: Int) = Action {
    var rom = dec2romFun(n)
  
    Ok(rom)
}

def testHolaMundo(nombre: String) :String = {
  var r = "Hola, ";
  r = r + nombre;
  return r;
}

def codeBreakerService(n: Int) = Action {
    var r = codeBreaker(n)

    Ok(Json.obj("valor" -> r))
}

def codeBreaker(n: Int) :String = {
  var nSecret = "5623"
  var nro = n.toString
  var listResult = List("")
  var r = "";
  var i = 0;
  var j = 0;
  if(nSecret.equals(nro)){
    return "XXXX"
  }
  if(nro.length()==4){
    for(i <- 0 to 3){
      for(j <- 0 to 3){
        if(nro.charAt(i).equals(nro.charAt(j)) && i!=j){
          return "error"
        }
        if (nSecret.charAt(i).equals(nro.charAt(j)) && i == j){
          listResult = "X"::listResult;
        }else if(nSecret.charAt(i).equals(nro.charAt(j))){
          listResult = "_"::listResult;
        }
      }
    }
  }else{
    return "error"
  }
  listResult = listResult.sorted
  r = listResult mkString ""
  println(r)
  return r
}

def dec2romFun(n: Int) :String = {
  var rom = ""
  var num = n
  if(num < 1 || num > 100){
    return "El numero no está en el rango"
  }else{
    if(num>=100)   {rom = rom + "C"    ;num=num-100; }
    if(num>=90)    {rom = rom + "XC"   ;num=num-90;  }
    if(num>=50)    {rom = rom + "L"    ;num=num-50;  }
    if(num>=40)    {rom = rom + "XL"   ;num=num-40;  }
    if(num>=30)    {rom = rom + "X"    ;num=num-10;  }
    if(num>=20)    {rom = rom + "X"    ;num=num-10;  }
    if(num>=10)    {rom = rom + "X"    ;num=num-10;  }
    if(num>=9) {rom = rom + "IX"   ;num=num-9;   }
    if(num>=5) {rom = rom + "V"    ;num=num-5;   }
    if(num>=4) {rom = rom + "IV"   ;num=num-4;   }
    if(num>=3) {rom = rom + "III";num=num-3;     }
    if(num>=2) {rom = rom + "II"   ;num=num-2;   }
    if(num>=1) {rom = rom + "I"    ;num=num-1;   }
  }
  return ("El número es " + rom)
}

}

package org.example



fun String.decorate():String{
    var newString = "--$this--"
    return newString
}

enum class Language{
    Arabic,
    English,
}
enum class Language2(val num:Int){
    Arabic(0),
    English(1),
}

sealed class Shape2{
    class Circle(var radius:Float):Shape2()
    class Square(var length:Float):Shape2()
    class Rectangle(var length:Float, var width:Float):Shape2()
    object NotShape:Shape2()
}
fun printShape(e:Shape2){
    when(e){
        is Shape2.Circle -> println("Circle")
        is Shape2.Rectangle -> println("Rectangle")
        is Shape2.Square -> println("Square")
        else -> println("Not Shape2")
    }
}

sealed class Vehicle{
    class Car(var wheelNum:Int):Vehicle()
    class Bike(var wheelNum:Int):Vehicle()
    class Plane(var maxSpeed:Int, var maxWeight:Int):Vehicle()
}

fun printVehicleType(e:Vehicle){
    when(e){
        is Vehicle.Car -> println("Car")
        is Vehicle.Bike -> println("Bike")
        is Vehicle.Plane -> println("Plane")
        else -> println("Not Vehicle")
    }
}
//generics
class Company<T>(val text:T){
    fun printTest(){
        println(text)
    }
}

class Test<T>(val value:T){
    fun printing(){
        println(value)
    }
}

fun main(){
    var t = Test("STRING")
    var t2 = Test(5000)

    t.printing()
    t2.printing()
//    var string = "hello everyone"
//    println(string.decorate())
//    println(Language.English.name)
//    var circle = Shape2.Circle(2.5f)
//    var square = Shape2.Square(2.5f)

//    var car = Vehicle.Car(4)
//    var bike = Vehicle.Bike(2)
//    var plane = Vehicle.Plane(2, 500)
//
//    printVehicleType(bike)

    var x = Company("12")
//    x.printTest()

}

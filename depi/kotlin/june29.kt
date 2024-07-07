package org.example

//public, private, protected(class and any inherited class), internal(seen within my package)
//primary constructor is the brackets next to the class name
//primary constructors is used everytime an object is created
class Student(){
//    property must be initialized or abstract or use lateinit(late initialization) or lazy(only declared when needed)
//    lazy means initialize but dont store in memory unless needed?? check later
//    var name:String
    init{
//        as soon as i create an object this block runs
    }
    var name:String="Fatma"
    fun printName(){
        println(name)
    }
//you can also create a constructor here
}
//anything that is used as data, use data class because it has built in tostring, getters and setters
//in data class you have to specify val or var
data class Employee(var name:String,var age:Int)

fun main(){
//    when creating objects, logically you always store it in val
    val emp1 = Employee("Fatma",20)
    val emp2 = emp1.copy(name="menah")
    val emp3 = emp1.copy()
    println(emp1.toString())
    println(emp2.toString())
    println(emp3.toString())

//    list can hold any data type together
//    cant add or change the list
//    val x = listOf(1,2,3,4,5,"string",5.5)
//    kotlin list is immutable, it cant be changed
//    var y= listOf(1,2,3,4,5,"string")
//    val z:MutableList<Int> = mutableListOf(1,2,3,4,5)
//    var a = mutableListOf(1,2,3,4,"hi")
//    a.add("hello")
//    diff between val and var in mutable lists, is that i cant use listname = another list
//    val or var only affect the reference to the list, but both val and var allows modifying list elements
//    println(x)
//    println(a)
//    a.addAll(listOf(6,7,8,9,"string"))
//    println(a)
//    set removes duplicates
//    var seta = setOf(1,2,3,4,5,5,5,-3,-6,-2,4,7,10,-40)
//    println(seta)
//    set has the same methods as list, add, remove etc..
//    for(item in seta){
//        println(item)
//    }
//    println("")
//    println(seta.count())
//    var pos = seta.filter{x -> x>0}
//    println(pos)
//    you can also write it as x*2 directly without the x -> but check this later, not sure
//    ^ only works if you use it
//    var dbl = seta.map{x -> x*2}
//    var dbl = seta.map{it*2}
//    println(dbl)

//    first@ for(i in 1..5){
//        second@ for(j in 1..9){
//            if(i==2) break@first
//            println("$i $j")
//        }
//    }
//    ----------------------
    val student1 = Student()
    student1.printName()
//    -------------------------
//    null safety
//    ? mean nullable
    var x:Int?=null
    val y:String?
    if(x!=null){
        println("x = $x")
    }
//    !! means if x is not null then store it in z because z is not nullable
//    var z = x!!
//    var a = x?:"Hello"
//    to use any method on a nullable variable, use x?.methodName() to make sure x isnt null when using the method
    var num1:Int? = 4
    var num2:Int? = 20
//    if num1 is null, replace it with 1, else use the value in num1
    println((num1?:1) * (num2?:1))
}
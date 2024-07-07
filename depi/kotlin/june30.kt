package org.example

fun main(){
    val t = Teacher(20, "Fatma", 100)
    val p = Player(22, "Menah", 200)
    t.printTeacher()
    p.printPlayer()
    var students = mutableListOf(Students("Fatma",20),Students("Menah",30))
    println(students)

    val x=AbTeacher("Fatma")
    x.displayJob("CS")
    val obj = B()
    obj.function()
    obj.hello()
}
// default class is final, cant be inherited.
// we use open to make the class not final
open class Person(age:Int, name:String, salary:Int){
    var age = age
    var name = name
    var salary = salary
    init{
        println(age)
        println(name)
        println(salary)
    }
    open fun calculateSalary(){
        println(salary*100)
    }

}
//inherited classes must have the same primary constructor as the parent class but can have additional parameters

class Teacher(age:Int, name:String, salary:Int):Person(age, name, salary){
    fun printTeacher(){
        println("Im a teacher")
    }
}

class Player(age:Int, name:String, salary:Int):Person(age, name, salary){
    fun printPlayer(){
        println("Im a player")
    }
}

data class Students(val name:String, val age:Int)

abstract class AbClass(name:String){
    init{
        println(name)
    }
    fun displayAge(age:Int){
        println(age)
    }
    abstract fun displayJob(job:String)
}

class AbTeacher(name:String):AbClass(name){
//    have to override any abstract function in the parent class
    override fun displayJob(job:String) {
        println(job)
    }
}
//INTERFACES
interface A{
//    the attributes in interface shouldnt have a value, you shouldnt initialize it
    val test:Int
//    you dont have to write the keyword abstract
//    there can be a default implementation
    fun function()
    fun hello(){
        println("HELLO")
    }
}
interface C{
    fun hello(){
        println("hello")
    }
}
class B:A,C{
    override val test:Int =25
    override fun function(){
        println("function")
    }
    override fun hello(){
//    call interface A's method
        super<A>.hello()
//    call interface A's method
        super<C>.hello()
    }

}


//TASK -> mutable lists from students that have many
//hashmap, key is
//
//        list of students, each student has 5 grades and calc average.
//        depending on the averga they will have an overall grade
//        map that will hold string and a mutableList of the students
//        so that the key is the grade and the value is a list of students with that grade
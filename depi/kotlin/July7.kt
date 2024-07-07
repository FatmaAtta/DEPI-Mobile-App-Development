package org.example

class AA{
//    class B wont see any functions or attributes in the class A but class A can see everything in class B
//    but if you add the word inner next to class B, B can see functions and atrributes of class A
    class B{
        val text="hello"
        fun printText(){
            println("Hello from nested class")
        }
    }
}
class CC{
    val x="Inner class"
    inner class D{
        val text="hello"
        fun printText(){
            println("hello from nested class")
        }
    }
}
class Person2{
    companion object test{
        val x="hello"
        fun printText(){
            println("companion object")
        }
    }
}
//extension class when i want to add something to a class but dont want to modify it
fun String.removeFirstLastChar():String=this.substring(1,this.length-1)


fun main(){
    println(AA.B().text)
    println(AA.B().printText())
    println(Person2.x)
    Person2.printText()
    var test:String="Testing"
    println(test.removeFirstLastChar())
}


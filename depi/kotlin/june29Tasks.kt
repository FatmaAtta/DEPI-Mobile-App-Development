package org.example

fun main(){
    var a = mutableListOf("a","b","c", 1, 2, 3, 4)
    a.add(20)
    a.remove("a")
    a.addAll(listOf("abc", "bcd", "cde"))
    a[4]="test"
//    println(a)
//    ----------------
    first@ for(i in 1..10){
        second@ for(j in i..10){
            if(j in 2..5) break@second
            print("O")
        }
        println(" ")
    }
}
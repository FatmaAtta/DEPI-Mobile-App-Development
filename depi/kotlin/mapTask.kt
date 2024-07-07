package org.example

data class StudentGrades(var name: String, var grades: List<Int>){
    fun grade(number: Int):Char{
        return when{
            number >= 80 -> 'A'
            number >= 60 -> 'B'
            number >= 50 -> 'C'
            number >= 40 -> 'D'
            else -> 'F'
        }
    }
    fun calcAvg(grades: List<Int>):Int{
        var sum = grades.sum();
        var avg = sum/grades.size
        return avg
    }
    var finalGrade = calcAvg(grades)
    var gradeLetter:Char = grade(finalGrade)
}

fun main(){

    var students = mutableListOf<StudentGrades>(StudentGrades("Fatma",listOf(10,20,30,40,50)),
        StudentGrades("Fatma",listOf(10,20,10,20,70)),
        StudentGrades("Fatma1",listOf(10,5,30,10,50)),
        StudentGrades("Fatma2",listOf(10,15,10,20,10)),
        StudentGrades("Fatma3",listOf(30,40,50,50,60)),
        StudentGrades("Fatma4",listOf(40,50,60,90,100)),
        StudentGrades("Fatma5",listOf(30,20,32,27,21)),
        StudentGrades("Fatma6",listOf(10,20,40,12,23)),
        StudentGrades("Fatma7",listOf(10,20,19,14,30)),
        StudentGrades("Fatma8",listOf(7,3,10,50,8))
    )

    var gradeMap = mutableMapOf<Char, MutableList<StudentGrades>>()
    for(student in students){
        gradeMap.getOrPut(student.gradeLetter){mutableListOf()}.add(student)
    }

    var ch = 'F'

    if(gradeMap.containsKey(ch)){
        val students = gradeMap[ch]
        for(student in students!!){
            println(student.name)
        }
    }
    else{
        println("No students with that grade")
    }




}
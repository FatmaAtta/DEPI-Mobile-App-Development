package org.example

fun CumulativeSum(nums:Array<Int>):Int{
    var sum = 0
    for(num in nums){
        sum+=num
    }
    return sum
}

fun EvenCumulativeSum(nums:Array<Int>):Int{
    var sum = 0
    for(num in nums){
        if(num%2==0){
           sum+=num
        }
    }
    return sum
}

fun factorial(num:Int):Int{
    var fact = 1;
    var number = num
    if(number==1){
        return fact
    }
    while(number>0){
        fact*=number
        number-=1
    }
    return fact
}

fun main() {
    var arr = arrayOf(4,2,7,13,72,45,78,24,32,13,49)
    var sum = CumulativeSum(arr)
    var evenSum = EvenCumulativeSum(arr)
    println(sum)
    println(evenSum)
    var factorial = factorial(5)
    println("factorial of 5 is $factorial")
}

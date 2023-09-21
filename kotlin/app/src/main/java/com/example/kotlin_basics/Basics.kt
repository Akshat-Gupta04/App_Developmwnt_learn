package com.example.kotlin_basics
//fun stand for function
fun main() {
//    declaring a variable
    var name = "Akshat"
//    print a message
//    print("Hello World")
    print("myself" + name)
//    to make variable unchangeable/no overwrite
    val n = "me"
    var myage = 23
    val mybyte: Byte = 12

//    use $ for concatination in strings
    print("myself $name")
//operators
//logical

//    when loop
//    var season =4
//    when(season){
//        1 -> println("spring")
//        2 -> println("summer")
//        else -> println("winter")
    // Do while loop
    // The do-while loop is similar to while loop except that it
    // tests the condition at the end of the loop.
    // This means that it will at least execute the body once
    var z = 1
    do {
        print("$z ")
        z++
    } while (z <= 10)

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold") {
        roomTemp++
        if (roomTemp == 20) {
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }


    // For Loop
    // A for-loop is used to iterate through ranges, arrays, collections, or anything
    // that provides an iterator (You’ll learn about iterator, arrays, ranges and collections in a future lectur    e).
    for (num in 1..10) {
        print("$num ")
    }

    // infix notation
    for (i in 1 until 10) { // Same as - for(i in 1.until(10))
        print("$i ")
    }

    for (i in 10 downTo 1) {     // Same as - for(i in 10.downTo(1))
        print("$i ")
    }

    for (i in 1 until 10 step 2) { // Same as - for(i in 1.until(10).step(2))
        print("$i ")
    }



}


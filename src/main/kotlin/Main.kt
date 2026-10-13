package org.example

fun sum(a : Int, b : Int) : Int {
    return a + b
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    print("Enter your name: ")
    val name = readln()
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, ${name.split(' ')[0]}")

    print("Enter your StudentID: ")
    val studentID = readln()

    println("Your student ID is $studentID")
    println(sum(12, 15))
//    for (i in 1..10) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        println("i = $i")
//    }
}
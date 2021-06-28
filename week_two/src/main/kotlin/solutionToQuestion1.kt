fun main(args: Array<String>) {
    //Define 10 if statements and 5 conditional expressions using the when keyword.
//Answer:
// ten if statements
    var time: Int = 23
    var temperature: Int = 67
    if (time < 5) {
        println("it”s too early to wake up")
    }
    if (time == 6) {
        println("it’s time to wake up and prepare for work")
    }
    if (time == 7) {
        println("time for Breakfast")
    }
    if (time == 8) {
        println("you are running late for work")
    }
    if (time == 12) {
        println("Break and Lunch time")
    }
    if (time > 12) {
        println("timer’s work done for the day")
    }
    if (temperature <= 10) {
        println("Weather too cold you need a blanket")
    }
    if (temperature >= 20 && temperature <= 25) {
        println("normal room temperature")
    }
    if (temperature > 25) {
        println("room temperature getting too hot you need an air conditional")
    }
    if (temperature == 100) {
        println("boiling point of water")
    }

    //5 conditional expressions using the when keyword
//example1
    var number = 7
    when (number) {
        in 1..5 -> println("Input is provided in the range 1 to 5")
        in 6..10 -> println("Input is provided in the range 6 to 10")
        else -> println("none of the above")
    }
//Example2
    var number2 = 8
    when (number2) {
        3, 4, 5, 6 ->
            println("It is summer season")
        7, 8, 9 ->
            println("It is rainy season")
        10, 11 ->
            println("It is autumn season")
        12, 1, 2 ->
            println("It is winter season")
        else -> println("invalid input")
    }
//example3
    var weekday = 1
    when (weekday) {
        1 -> {
            println("Monday")
            println("First day of the week")
        }
        7 -> println("Sunday")
        else -> println("Other days")
    }
//example4
    var number3 = 5
    when (number3) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")
        else -> println("invalid number")
    }
//example5
    var number4 = 4
    var numberProvided = when (number4) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "invalid number"
    }
    println("You provide $numberProvided")


}
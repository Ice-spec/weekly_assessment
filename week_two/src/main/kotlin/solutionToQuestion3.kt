fun main() {
    //Using a loop and the modulus operator, write a program which will print out only the even numbers between 10 and 20 and the odd numbers between 20 and 30: NB: Use only one loop


    for (names in 10..30) {

        if (names % 2 == 0 && names >= 10 && names <= 20) {
            print("$names ")
        }
        if (names % 2 == 1 && names > 20 && names <= 30) {
            print("\n$names ")
        }
    }
}
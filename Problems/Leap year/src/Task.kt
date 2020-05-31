import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val year = scanner.nextInt()
    if (year in 1900..3000) {
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                print("Leap")
            } else if (year % 100 == 0) {
                print("Regular")
            } else {
                print("Leap")
            }
        } else {
            print("Regular")
        }
    }
}
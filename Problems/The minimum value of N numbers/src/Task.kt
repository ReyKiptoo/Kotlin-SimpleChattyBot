import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val numbers = scanner.nextInt()
    val first = scanner.nextInt()
    var min = first
    for (i in 1 until numbers) {
     val number = scanner.nextInt()
        if (number < min) {
            min = number
        }
    }
    print(min)
}
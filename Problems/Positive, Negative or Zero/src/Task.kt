import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()

        print(if (number > 0) "positive" else if (number < 0) "negative" else "zero")
}
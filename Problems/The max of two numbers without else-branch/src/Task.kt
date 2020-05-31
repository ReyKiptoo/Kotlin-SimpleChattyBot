import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()

    if (a != b) {
        if (a > b) {
            print(a)
        }
        if (b > a) {
            print(b)
        }
    }
}
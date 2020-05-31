import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val a = scanner.nextLong()
    val b = scanner.nextLong()
    var product: Long = a
    for (i in a + 1 until b) {
        product *= i
    }
    print(product)
}
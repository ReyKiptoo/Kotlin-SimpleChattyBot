import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val first = scanner.nextInt()
    val second = scanner.nextInt()
    val third = scanner.nextInt()
    val fourth = scanner.nextInt()
    val fifth = scanner.nextInt()
    val firstRange = first..second
    val secondRange = third..fourth
    println(fifth in firstRange || fifth in secondRange)
    // write your code here
}
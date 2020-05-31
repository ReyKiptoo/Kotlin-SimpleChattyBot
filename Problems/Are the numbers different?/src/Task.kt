import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val first = scanner.nextInt()
    val second = scanner.nextInt()
    val third = scanner.nextInt()

    print((first != second) && (first != third) && (second != third))
}
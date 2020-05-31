import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var first = scanner.next().first()
    var second = scanner.next().first()
    var third = scanner.next().first()

//    val follow = ((first < second) && (second < third))
    val followImmediately = ((second == first + 1) && (third == second + 1))

    print(followImmediately)
}
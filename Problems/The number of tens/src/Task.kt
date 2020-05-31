import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    var integer = scanner.nextInt()
    var result = (integer / 10) % 10
    print(result)
}
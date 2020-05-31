import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val ch = scanner.next().first()
    val isDigit = ch in '\u0031'..'\u0039'
    val isCapital = ch.isUpperCase()
    print(isDigit || isCapital)
}
import java.lang.Double.POSITIVE_INFINITY
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val integer = scanner.nextInt()
    val firstRange = -14..12
    val secondRange = 15..16
    val thirdRange = 19..POSITIVE_INFINITY.toInt()
    print(if (integer in firstRange || integer in secondRange || integer in thirdRange) "True" else "False")
}
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here

    val number = scanner.nextInt()
    val weekend = scanner.nextBoolean()

    print(((!weekend) && (number>=10) && (number <=20)) || ((weekend) && (number>=15) && (number <=25)))
}
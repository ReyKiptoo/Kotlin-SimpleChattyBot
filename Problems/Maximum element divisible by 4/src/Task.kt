import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val sequence = scanner.nextInt()
    var max = 0
    repeat(sequence) {
        val num = scanner.nextInt()
        if (num <= 1000 && num % 4 == 0) {
            if (num > max) {
                max = num
            }
        }
    }
    print(max)
}
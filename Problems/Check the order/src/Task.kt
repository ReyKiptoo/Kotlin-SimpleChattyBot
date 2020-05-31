import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val first = scanner.nextInt()
    var last = first
    var answer = true
    for (i in 1 until n) {
        val num = scanner.nextInt()
       if (num < last) {
           answer = false
       }
        last = num
    }
    if (answer) {
        print("YES")
    } else {
        print("NO")
    }
}
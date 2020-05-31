import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()

    if (x1 == x2 || y1 == y2 || (Math.abs(x2 - x1) == Math.abs(y2 - y1))) {
        println("YES")
    } else {
        print("NO")
    }

}
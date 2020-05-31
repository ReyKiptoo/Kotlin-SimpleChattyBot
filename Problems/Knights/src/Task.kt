import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()

    if (Math.abs(y2 - y1) == 1 && Math.abs(x2 - x1) == 2 || Math.abs(x2 - x1) == 1 && Math.abs(y2 - y1) == 2) {
        print("YES")
    } else {
        print("NO")
    }
}
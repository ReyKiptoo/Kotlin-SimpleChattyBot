import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var ready = 0
    var larger = 0
    var rejects = 0

    val n = scanner.nextInt()
    repeat(n) {
        val num = scanner.nextInt()
        when(num) {
           0-> ready++
            1->larger++
            -1->rejects++
        }
    }
    print("$ready $larger $rejects")
}
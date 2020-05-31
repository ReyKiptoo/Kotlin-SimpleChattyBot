import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val A = scanner.nextInt()
    val B = scanner.nextInt()
    val H = scanner.nextInt()
    if (A <= B) {
        if (H < A) {
            print("Deficiency")
        } else if (H > B) {
            print("Excess")
        } else {
            print("Normal")
        }
    }
    // write your code here
}
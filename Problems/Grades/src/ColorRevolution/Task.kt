import java.lang.Double.POSITIVE_INFINITY
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numberOfTestCases = scanner.nextInt()
    //if (numberOfTestCases in 1..1000)
    val nkArray = IntArray(2 * numberOfTestCases)

    for (i in 1..numberOfTestCases) {
        val n = scanner.nextInt() //total number of participants
        val k = scanner.nextInt() //ratio
        var n1 = 1
        var n2 = 1
        var n3 = 1
        var n4 = 1
       for (i in 1..n) {
           n1 = i
           n2 = n1 * k
           n3 = n2 * k
           n4 = n3 * k
           if (n1 + n2 + n3 + n4 == n) {
               print("$n1 $n2 $n3 $n4")
           }
       }
    }
}
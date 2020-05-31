import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
//    val n = scanner.nextInt()
//    val first = scanner.nextInt()
//    var previous = first
//    var longestNonDescending = 1
//    var currentCount = 1
//    if (n == 1) {
//       longestNonDescending = 1
//    } else if (n > 1) {
//        for (i in 1 until n) {
//            val num = scanner.nextInt()
//            if (num >= previous && longestNonDescending >= currentCount) {
//                currentCount++
//                previous = num
//                longestNonDescending = currentCount
//            } else {
//                currentCount = 1
//                previous = num
//            }
//        }
//    }
//    print(longestNonDescending)
    for (i in 11 downTo 10 step 2) {
        print(i)
    }
}

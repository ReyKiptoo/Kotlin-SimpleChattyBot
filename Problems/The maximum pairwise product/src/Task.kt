import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val firstNumber = scanner.nextInt()
    var largestNumber = firstNumber
    var previous = 0
    if (n == 1) {
        print(firstNumber)
    } else if (n == 2) {
        var secondNumber = scanner.nextInt()
        print(firstNumber * secondNumber)
    } else if (n > 2) {
        var secondLargestNumber = 0
        for (i in 2..n) {
            val number = scanner.nextInt()
            if (number > largestNumber) {
                largestNumber = number
            } else if (number <= largestNumber || number >= previous) {
                secondLargestNumber = number
            }
            previous = number
        }
      print(largestNumber * secondLargestNumber)
    }
}
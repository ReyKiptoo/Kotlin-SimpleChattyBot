import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var hour = scanner.nextInt()
    var minutes = scanner.nextInt()
    var seconds = scanner.nextInt()
    var HOUR = scanner.nextInt()
    var MINUTES = scanner.nextInt()
    var SECONDS = scanner.nextInt()

    var time = (HOUR * 3600 + MINUTES * 60 + SECONDS ) - (hour * 3600 + minutes * 60 + seconds )
    println(time)
}
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var n = scanner.nextInt()
    var a = 0
    var b = 0
    var c = 0
    var d = 0
    repeat(n) {
        val num = scanner.nextInt()
      if (num == 2) {
          d++
      } else if (num == 3) {
          c++
      } else if (num == 4) {
          b++
      } else if (num == 5) {
          a++
      }
    }
    print("$d $c $b $a")
}
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(if (a > c) {
        // put your code here
         if(a > b) {
             a
         } else {
             if (a < b) {
                 b
             } else{
                 c
             }
         }
    } else {
        // and here
        if (b > c) {
            b
        }
        else
            c
    })

}
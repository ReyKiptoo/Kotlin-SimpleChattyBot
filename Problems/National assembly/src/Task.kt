import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    var population = scanner.nextInt()
    var assembly = Math.cbrt(population.toDouble())

    print(assembly.toInt())

}
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val z1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()
    val z2 = scanner.nextInt()

    val box1Bottom = x1 * y1
    val box1PhaseA = x1 * z1
    val box1PhaseB = y1 * z1

    val box2Bottom = x2 * y2
    val box2PhaseA = x2 * z2
    val box2PhaseB = y2 * z2

    val volumeOfBox1 = x1 * y1 * z1
    val volumeOfBox2 = x2 * y2 * z2

    if (volumeOfBox2 > volumeOfBox1) {
        //Checking if box 1 can fit into box 2 in any way. (Volume of Box 2 is greater than volume of Box 1)
        if (((box2Bottom >= box1Bottom) && (z2 >= z1) && (((x2 >= x1) && (y2 >= y1)) || ((x2 >= y1) && (y2 >= x1)))) || ((box2Bottom > box1PhaseA) && (z2 >= y1) && (((x2 >= x1) && (y2 >= z1)) || ((x2 >= z1) && (y2 >= x1)))) || ((box2Bottom >= box1PhaseB) && (z2 >= x1) && (((x2 >= y1) && (y2 >= z1)) || ((x2 >= z1) && (y2 >= y1))))) {
//            print("first evaluated")
            print("Box 1 < Box 2")
        } else if (((box2PhaseA >= box1Bottom) && (z2 >= z1) && (((x2 >= x1) && (z2 >= y1)) || ((x2 >= y1) && (z2 >= x1)))) || ((box2PhaseA >= box1PhaseA) && (y2 >= y1) && (((x2 >= x1) && (z2 >= z1)) || ((x2 >= z1) && (z2 >= x1)))) || ((box2PhaseA >= box1PhaseB) && (y2 >= x1) && (((x2 >= y1) && (z2 >= z1)) || ((x2 >= z1) && (z2 >= y1))))) {
//            print("second evaluated")
            print("Box 1 < Box 2")
        } else if (((box2PhaseB >= box1Bottom) && (x2 >= z1) && (((y2 >= x1) && (z2 >= y1)) || ((y2 >= y1) && (z2 >= x1)))) || ((box2PhaseB >= box1PhaseA) && (x2 >= y1) && (((y2 >= x1) && (z2 >= z1)) || ((y2 >= z1) && (z2 >= x1)))) || ((box2PhaseB >= box1PhaseB) && (x2 >= x1) && (((y2 >= y1) && (z2 >= z1)) || ((y2 >= z1) && (z2 >= y1))))) {
//            print("third evaluated")
            print("Box 1 < Box 2")
        }
        else {
            print("Incomparable")
        }
    } else if (volumeOfBox2 < volumeOfBox1) {
        // Checking if box 2 can fit into box 1 in any way . (Volume of Box 1 is greater than volume of box 2)
        if (((box1Bottom >= box2Bottom) && (z1 >= z2) && (((x1 >= x2) && (y1 >= y2)) || ((x1 >= y2) && (y1 >= x2)))) || ((box1Bottom >= box2PhaseA) && (z1 >= y2) && (((x1 >= x2) && (y1 >= z2)) || ((x1 >= z2) && (y1 >= x2)))) || ((box1Bottom >= box2PhaseB) && (z1 >= x2) && (((x1 >= y2) && (y1 >= z2)) || ((x1 >= z2) && (y1 >= y2))))) {
//            print("first evaluated")
            print("Box 1 > Box 2")
        } else if (((box1PhaseA >= box2Bottom) && (y1 >= z2) && (((x1 >= x2) && (z1 >= y2)) || ((x1 >= y2) && (z1 >= x2)))) || ((box1PhaseA >= box2PhaseA) && (y1 >= y2) && (((x1 >= x2) && (z1 >= z2)) || ((x1 >= z2) && (z1 >= x2)))) || ((box1PhaseA >= box2PhaseB) && (y1 >= x2) && (((x1 >= y2) && (z1 >= z2)) || ((x1 >= z2) && (z1 >= y2))))) {
//            print("second evaluated")
            print("Box 1 > Box 2")
        } else if (((box1PhaseB >= box2Bottom) && (x1 >= z2) && (((y1 >= x2) && (z1 >= y2)) || ((y1 >= y2) && (z1 >= x2)))) || ((box1PhaseB >= box2PhaseA) && (x1 >= y2) && (((y1 >= x2) && (z1 >= z2)) || ((y1 >= z2) && (z1 >= x2)))) || ((box1PhaseB >= box2PhaseB) && (x1 >= x2) && (((y1 >= y2) && (z1 >= z2)) || ((y1 >= z2) && (z1 >= y2))))) {
//            print("third evaluated")
            print("Box 1 > Box 2")
        }
        else {
            print("Incomparable")
        }
    } else if (volumeOfBox1 == volumeOfBox2) {
        print("Box 1 = Box 2")
    }



//checking if box 1 and box 2 are equal
//    if (((box1Bottom > box2Bottom) && (z1 >= z2)) || ((box1Bottom > box2PhaseA) && (z1 >= y2)) || ((box1Bottom > box2PhaseB) && (z1 >= x2))) {
//        print("first evaluated")
//        print("Box 1 = Box 2")
//    } else if (((box1PhaseA > box2Bottom) && (y1 >= z2)) || ((box1PhaseA > box2PhaseA) && (y1 >= y2)) || ((box1PhaseA > box2PhaseB) && (y1 >= x2))) {
//        print("second evaluated")
//        print("Box 1 = Box 2")
//    } else if (((box1PhaseB > box2Bottom) && (x1 >= z2)) || ((box1PhaseB > box2PhaseA) && (x1 >= y2)) || ((box1PhaseB > box2PhaseB) && (x1 >= x2))) {
//        print("third evaluated")
//        print("Box 1 = Box 2")
//    }
}
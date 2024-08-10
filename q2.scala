import scala.io.StdIn

@main def main()={
    
    println("Enter number 1: ");
    var num1:Int =StdIn.readLine().toInt

    var multOfThree:Int =>Boolean = (n: Int) => if(n%3 == 0) true else false
    var multoffive:Int =>Boolean = (n: Int) => if (n%5 == 0) true else false

    var result: String = (multOfThree(num1),multoffive(num1)) match {
        case (true, true) => " is a multiple of both 3 and 5";
        case (true, false) => " is a multiple of 3";
        case (false, true) =>  " is a multiple of 5";
        case (false, false) => " is a multiple of neither 3 nor 5";
    }   

    println(num1 + result);
}
import scala.io.StdIn.readLine
import scala.util.Random
import MathExtensions._

object PrimeTimeApp extends App {
  
  // define constants and variables.
  
  val MinAnswer = 201
  val MaxAnswer = 499
  var reply = "?"

  // Generate a list of numbers from 200 to 500
  
  var primeList = MinAnswer primeListTo MaxAnswer

  // Loop
  
  do {

    // Generate a random number from 200 to 500

    var answer = 0

    while (answer % 2 == 0 || answer % 5 == 0) {

      answer = Random.nextInt(MaxAnswer - MinAnswer) + MinAnswer

    }

    // Show the number and ask player if it is a prime
    
    println(s"Is $answer a prime number? (Y/N/X=Exit)")
    reply = readLine().toUpperCase()

    // Show the answer
    val isPrime = primeList contains answer 

    if (isPrime) {
      print(if (reply == "Y") "Correcrt" else "Incorrect")
      println(s" $answer is prime")
    }
    else {
      print(if (reply == "Y") "Incorrecrt" else "Correct")
      println(s" $answer is not prime")
    }
    

  } while ( reply != "X" )

} 

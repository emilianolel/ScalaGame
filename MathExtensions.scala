import scala.collection.mutable.ListBuffer

object MathExtensions {

  implicit class IntPredicates(i: Int) {
    def primeListBufferTo (upperLimit: Int) : ListBuffer [Int] = makePrimeListBuffer(i, upperLimit)
    def primeListTo(upperLimit: Int) : List[Int] = (makePrimeListBuffer(i, upperLimit).toList)
  }

  def makePrimeListBuffer (lowerLimit: Int, upperLimit: Int) : ListBuffer[Int] = {
  
  val list = ListBuffer[Int]()
  
  if (upperLimit < 2 || lowerLimit > upperLimit) {
    return list
  }
  
  def isNextPrime(test: Int) : Boolean = {
  
    for (n <- list) {
      if (test % n == 0) return false
    }
  
    return true
  
  }
  
  var current = 2
  
  while (current <= upperLimit) {
  
    if (isNextPrime(current)) list += current
    current += 1
  
  }
  
  list.filter(_ >= lowerLimit)
  
  }
}

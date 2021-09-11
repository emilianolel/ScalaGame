import scala.collection.mutable.ListBuffer


val primes = List(2, 3, 5, 7, 11)

println(s"$primes")

println(primes.take(2))

println(primes.takeWhile(_ <= 6))

println(primes.filter(_ > 6))

println(primes.indexOf(5))

println(primes.contains(8))

val primesBuffer = primes.toBuffer

primesBuffer += 13 // se appendea 13

println(primesBuffer)


for (n <- primesBuffer) {
	println(s"$n")
}

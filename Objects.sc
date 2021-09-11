class Employee(var name: String, var id:String){

	def printIdentity: Unit = {
		println(s"$id $name")
	}

}

object President {
	var name="Jane Doe"
}

val programmer = new Employee( name="Joe Doe", id="123" )
val analyst = new Employee( name="Emiliano", id="154" )

programmer.printIdentity

println(s"${analyst.id}, ${analyst.name}")

println(s"President ${President.name}")

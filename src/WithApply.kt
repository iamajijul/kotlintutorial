fun main(args: Array<String>) {
    val person = Person("", "")

    var d = with(person) {
        name = "Ajijul"
        id = "101"

    } // We can't call method with "with"
    var qd = with(person, {
        name = "Ajijul"
        id = "101"

    }) // We can't call method with "with", returning sending person as a receiver "this"

    var g = person.apply {
        name = "Ajijul"
        id = "101"
    }.startRun() // We can call method with "apply",  returning  calling receiver "this" person


}

class Person(var name: String, var id: String) {

    fun startRun() {
        println("I'm ready to start")
    }
}
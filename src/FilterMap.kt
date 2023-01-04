
fun main(args: Array<String>) {
    val peoples = listOf<Person>(
        Person("Ajijul", "12"),
        Person("Samrat", "13"),
        Person("Rajib", "14"))
    val namesWithS: List<String> = peoples.filter { s->s.name.startsWith("A") }.map {it.name+"11" }

    for (people in namesWithS){
      println(people)
    }

    val myNumbers = listOf(2,3,5,6,7,8)
    val mySquaredNumber = myNumbers.filter { num->num>5 }.map { num -> num * num }
    for (number in mySquaredNumber){
        println(number)
    }
}

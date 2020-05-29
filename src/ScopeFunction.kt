import java.util.*
import kotlin.random.Random

/*
* The Kotlin standard library contains several functions whose sole purpose is to execute a block of code within
* the context of an object. When you call such a function on an object with a lambda expression provided,
*  it forms a temporary scope. In this scope, you can access the object without its name.
* Such functions are called scope functions. There are five of them: let, run, with, apply, and also.*/
fun main(args: Array<String>) {
    val str = "Hello"
    /*
    * Inside the lambda of a scope function, the context object is available by a short reference instead
    * of its actual name. Each scope function uses one of two ways to access the
    * context object: as a lambda receiver (this) or as a lambda argument (it).*/
    // this
    str.run {
        println("The receiver string length: $length")
        //println("The receiver string length: ${this.length}") // does the same
    }

    // it
    str.let {
        println("The receiver string's length is ${it.length}")
    }

    ///apply and also >>> Both return the context of object
    var obj = Person2("Ajijul", 29, "Kolkata").also {
        println("Start changing data for ${it.name}")
    }.apply {
        increaseAge()
        changeLocation("Dubai")
    }.also {
        println("End of changing data for ${it.name} : $it")

    }

/*
* let, run, and with return the lambda result. So, you can use them when assigning the result to a variable,
* chaining operations on the result, and so on.*/
    val numbers = mutableListOf<String>("One", "Two", "Five")
    val countEndsWithE = numbers.run {
        count {
            it.endsWith("e")
        }
    }
    println("There are $countEndsWithE elements that end with e.")
    with(numbers) {
        val firstItem = first()
        val lastItem = last()
        println("First item: $firstItem, last item: $lastItem")
    }
}

fun getRandomInt(): Int {
    return Random.nextInt(100).also {
        print("getRandomInt() generated value $it")
    }
}

data class Person2(val name: String, var age: Int, var location: String) {
    fun increaseAge() {
        age += 1
    }

    fun changeLocation(newLocation: String) {
        location = newLocation
    }
}

fun main(args: Array<String>) {

    val program = Program()
    program.addTwoNumber(2, 7)

    program.addTwoNumber(2, 7, object : MyInterface {
        override fun onExecute(sum: Int) {
            println("By interface $sum")
        }

    })

    val string: String = "Lambda"//Example

    val myLambda: (Int) -> Unit = { sum: Int -> println("Inside Lambda $sum") }

//    Lambda Expression [A function without name]
//    program.addTwoNumber(2, 7, myLambda)
//    program.addTwoNumber(2, 7, { sum: Int -> println("Inside Lambda $sum") })
//    program.addTwoNumber(2, 7) { sum: Int -> println("Inside Lambda $sum") } // Lambda as a argument, same as above
//    program.addTwoNumber(2, 7, { x, y -> x + y })// Lambda as a argument, same as above

    var result: Int = 0
    program.addTwoNumber2(2, 7) { x, y -> result = x + y } // Lambda as a argument, same as above
    println("Closer result $result")

    program.addTwoNumber(2, 7) { x, y -> x + y } // Lambda as a argument, same as above
}

class Program {


    fun addTwoNumber(a: Int, b: Int, action: (Int, Int) -> Int) { // Using Higher Level Function with lambda expression

        val result = action(a, b) // action(a,b) replace by body of lambda
        println(result)
    }

    fun addTwoNumber2(
        a: Int,
        b: Int,
        action: (Int, Int) -> Unit
    ) { // Using Higher Level Function with lambda expression

        action(a, b)
    }


    fun addTwoNumber(a: Int, b: Int, action: (Int) -> Unit) { // Using Higher Level Function with lambda expression
        val sum = a + b
        action(sum)
    }


    fun addTwoNumber(a: Int, b: Int, action: MyInterface) { // Using Interface/Object oriented concept
        val sum = a + b
        action.onExecute(sum)
    }

    fun addTwoNumber(a: Int, b: Int) { // Simple way to add two number
        val sum = a + b
        println(sum)
    }
}
//Closure : In java we can access the variable inside the lambda expression but in case of kotlin we can do that.
// Its called closure.
interface MyInterface {
    fun onExecute(sum: Int)
}
package HOF

import java.util.function.Consumer

fun main() {
    var listOfNumber = listOf(4,7,2,1,5,9)

    var con = object : Consumer<Int>{
        override fun accept(t: Int) {
            println(t)
        }

    }

//Lambda expression: wrap with curly bracket "{}", function with no name
    listOfNumber.forEachIndexed{index,value->
        println("Index $index, Value $value")
    }
}
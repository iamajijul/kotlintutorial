package HOF

open interface HigherOrderFunction : (Int, Int) -> String {
    override fun invoke(p1: Int, p2: Int): String {
        return (p1 + p2).toString()
    }
}
//Lambda expression: wrap with curly bracket "{}", function with no name
fun main(args: Array<String>) {
    var obj = object : HigherOrderFunction {
        override fun invoke(p1: Int, p2: Int): String {
            return (p1 - p2).toString()
        }
    }
    var sum: (Int, Int) -> String = { x, y -> (x + y).toString() }
    doSum { x, y -> (x + y).toString() }
//    doSomething {  }
// the shortest syntax
//    doSomething {
//       println(this.substring(1))
//        // this is referring to String instance, in this case Ajijul
//    }
//    doSomething {a,b->
//        println((a + b))
//        this
//    }
    doSomething<Int> {  it }
    doSomething<String> {
        // do something here
        "Ajijul Mondal"
    }
    doSomething<String,Int>( "Ajijul"){
        // do something here
        "Ajijul Mondal"
        1
    }
    "Ajijul".callMyAnonymousLambda {name ->
        println("My name is $name")
    }

    1.let{ name->
        println("My name is $name")
    }
}
//fun doSomething(block: () -> Unit) {
//}
fun doSum(func: (Int, Int) -> String) {
    println(func(5, 8))
}
//fun doSomething(block: Int.(a:Int,b:Int) -> Int) {
////    block()
////    // ❌ not allowed as the function type is extension of String
//    var a = 1.block(2,3)
//    println(a)
//    // ✅allowed, we are using String instance to call
//}
fun <R> doSomething(block: String.(i: Int) -> R) {
    println("Ajijul".block(100))
}

fun<T,R> doSomething(t:T, block: T.() -> R) {
    println(t.block())
}

fun <T> T.callMyAnonymousLambda(block: (T) -> Unit) {
    block(this)
}

fun <T, R> T.let(block: (T) -> R): R {
    return block(this)
}
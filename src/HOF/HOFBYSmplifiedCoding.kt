package HOF


fun getHeroes(realName: String, famousName: String, action: (String, String) -> String) {

    var result = action(realName, famousName) //2. This one executing the definition or body of the lambda expression
    println(result)
}

fun main() {
    var lambda: (String, String) -> String = { a, b ->
        "Real name is $a and famous name is $b" //3.

    }
    getHeroes("Ajijul", "Aziz", lambda) //1.

    //1 ===> 2 ====> 3

//   getTested<String>("123456"){
//
//        print("Called $it")
//    }
}
//fun <T> getTested(someData: String, action: (T?) -> Unit) {
//
//    var result = action(someData) //2. This one executing the definition or body of the lambda expression
//    println(result)
//}

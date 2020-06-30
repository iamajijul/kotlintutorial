
fun main() {

    //// let take the calling object as a argument and return the lamda expression result
    val str = "Hello World"
    val s1 = str.let { "$it!!"  } //return lamda expression result as a result value but not changing the actual value of calling object
    val s2 = str.let { 2  } //return lamda expression result as a result value but not changing the actual value of calling object
    println(s1)
    println(s2)
    println(str)
    //let with null checking
    val str1 : String? = null
    str1?.let {
        println("Not null") // only execute if calling object is not null
    }

    //// Run function can change the value of outer property
    var str3 = "This kotlin run function testing"
    println("STR3 before modification using run function : $str3")
    str3 = run {
        "This is modified value of STR3" // like  let its return last statement of lamda expression but unlike let,
        // run does not support it keyword
    }
    println("STR3 after modification using run function : $str3")


    //// also function :  as name says, expressions does some additional processing on the object it was invoked but doesn't
    // change the value of actual object. Return value same as calling object. support it keyword.

    var str4  = "Also testing"
    var a = str4.also {
        val s = "$it extra"

    }
    println("After applying also function str4 is $str4")
    println("After applying also function on str4  $a")


    //// apply function : as name says, expression apply some changes on main object and return that particular object
    // with change

    data class Person(var a111 : String,var b111 : String)
    val str5 = Person("Zero","One")


    str5.apply {
        this.a111 = "Two"
    }
    println("After applying some changes on str5 using apply function $str5")


    //// with function : like apply but changes apply without dot operator
    val str6 = Person("Zero","One")

    with(str6){

        a111 = "One"
        b111 = "two"

    }

    println("After applying some changes on str5 using with function $str6")

}










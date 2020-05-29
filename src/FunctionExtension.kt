fun main(args: Array<String>) {
    val str1 = "Hello "
    val str2 = "World"
    val str3 = "Hey "

    print(
        str3.addTwoString(
            str1,
            str2
        )
    ) //We don't have any method inside String class, so we can create kotlin extension
    // function for that not modifiable class to make
    //custom method according to your need

    val int1 = 20
    val int2 = 30

    println(int1.greaterValue(int2))


}

fun String.addTwoString(a: String, b: String): String {

    return this + a + b

}

//fun Int.greaterValue(a: Int): Int {
//    return if (this > a)
//        this
//    else a
//}



///Infix Function
infix fun Int.greaterValue(a: Int): Int { ////Same as above extension function
    return if (this > a)
        this
    else a
}
/*
* 1.All infix function are extension but all extension function are not infix function
* 2. Infix function only have one parameter
* */
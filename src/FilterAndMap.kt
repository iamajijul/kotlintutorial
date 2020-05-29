fun main() {
    val myFriends = listOf<String>(
        "Nadim", "Sana", "Younus", "Tapomoy", "Narayan",
        "Zahir", "Tanmoy", "Raja", "Subhojeet", "Adnan", "Rahim"
    )
    val myFriends1 = listOf<String>(
        "Raju","Azhaar","Sagar","Dalim","Chandan"
    )

    //Filter///
    val filterStarttWithSFriend = myFriends.filter { s -> s.startsWith("S", true) }
    filterStarttWithSFriend.forEach { pf -> println(pf) }

    //Map///
    val mapMyFriendWord = myFriends.map { a -> "$a is my friend" }
    mapMyFriendWord.forEachIndexed { a, b -> println("Index $a Value $b") }

    //FlatMap/// FlatMap mainly use to combine two list, Here, flatMap here took each and every item from the list and then combined it into one list
    var ll= listOf(myFriends,myFriends1)
    val flatMapMyFriendWord = ll.flatMap { it }
    flatMapMyFriendWord.forEachIndexed { a, b -> println("Index $a Value $b") }
}
fun main() {
    //"Set" Contains Unique number no duplicate value
    // "HashSet" Also contains uinque number but sequence not guaranteed
    val set = setOf<Int>(11,4,5,6,6,7,0)// also have mutableSetOf() to do manipulation with elements
    val hashSet = hashSetOf<Int>(5,8,12,7,9,1)

    set.forEach { println(it) }
    hashSet.forEach { println(it) }
}
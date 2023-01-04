fun main() {
    val a = arrayListOf("A", "B", "C","D")
    val b = arrayListOf("1", "2", "3", "4", "5")
    println(interLeaves(a,b)) //[A, 1, B, 2, C, 3, 4, 5]
}

fun interLeaves(list1: ArrayList<String>, list2: ArrayList<String>) : ArrayList<String>  {
    val result = ArrayList<String>()
    if (list1.size > list2.size) {
        for (i in list1) {
            result.add(i)
            if (list2.isNotEmpty()) {
                result.add(list2[0])
                list2.removeAt(0)
            }
        }

    } else {
        for (i in list2) {
            if (list1.isNotEmpty()) {
                result.add(list1[0])
                list1.removeAt(0)
            }
            result.add(i)
        }
    }
    return result
}


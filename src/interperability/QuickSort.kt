package interperability

fun main() {
    val array: ArrayList<Int> = ArrayList()
    array.add(23)
    array.add(3)
    array.add(6)
    array.add(7)
    array.add(2)
    array.add(10)
    array.add(1)

    doQuickSort(array, 0, array.size - 1)

    array.forEach {
        print("$it ")
    }
}

fun doQuickSort(array: ArrayList<Int>, left: Int, right: Int) {
    val index = getPivot(array, left, right)
    if (left < index - 1) {
        doQuickSort(array, left, index - 1)
    }
    if (index < right) {
        doQuickSort(array, index, right)
    }
}

fun getPivot(array: ArrayList<Int>, l: Int, r: Int): Int {
    var lHandIndex = l
    var rHandIndex = r
    val pivot = array[(lHandIndex + rHandIndex) / 2]
    while (lHandIndex <= rHandIndex) {
        while (array[lHandIndex] < pivot) lHandIndex++
        while (array[rHandIndex] > pivot) rHandIndex--
        if (lHandIndex <= rHandIndex) {
            switchArray(array, lHandIndex, rHandIndex)
            lHandIndex++
            rHandIndex--
        }
    }
    return lHandIndex
}

fun switchArray(actualArray: ArrayList<Int>, indexA: Int, indexB: Int) {
    val tempArray = actualArray[indexA]
    actualArray[indexA] = actualArray[indexB]
    actualArray[indexB] = tempArray
}

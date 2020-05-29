fun main() {

    val map = mapOf<Int, String>(1 to "Ajijul", 2 to "Flex", 23 to "Care", 24 to "Rohi") // Immutable
    val mutableMap = mutableMapOf<Int, String>(1 to "Ajijul", 2 to "Flex", 23 to "Care", 24 to "Rohi") // Mutable
    mutableMap[0] = "yes"
    mutableMap.forEach{ println("${it.key} == ${it.value}")}
}
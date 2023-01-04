package interperability

/**
 *
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * ``` Input: strs = ["flower","flow","flight"] Output: "fl" ```
 *
 * ``` Input: strs = ["flower","flow","flo"] Output: "flo" ```
 *
 * Example 2:
 *
 * ``` Input: strs = ["dog","racecar","car"] Output: "" ```
 *
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200 0 <= strs[i].length <= 200 strs[i] consists of only
 * lower-case English letters.
 */
fun main(args: Array<String>): Unit {
    val strs = listOf("flower", "flow", "flo")
    if (strs.size > 1) {
        val firstValue: String = strs.minBy(String::length) ?: strs[0]
        print(compare(firstValue, strs))
    } else print("")

}

fun compare(value: String, list: List<String>): String {
    val arrayOfEachAlpha = value.toCharArray()
    var count = 0
    val sb = StringBuilder()
    arrayOfEachAlpha.forEachIndexed { index, alpha ->
        list.forEach { listValue ->
            if (listValue.startsWith(sb.toString() + alpha, true)) {
                count += 1
            }
        }
        if (count == list.size) {
            sb.append(alpha)
        }
        count = 0
    }
    return sb.toString()
}

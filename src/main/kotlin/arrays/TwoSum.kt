package arrays

fun main() {
    println("Two sum: ${twoSum(array = intArrayOf(2, 7, 6, 4, 5), target = 9).toList()}")
}

fun twoSum(array: IntArray, target: Int): IntArray {
    val map = hashMapOf<Int, Int>()
    for (i in array.indices) {
        val required = target - array[i]
        val requiredIdx = map[required]
        if (requiredIdx != null) {
            return intArrayOf(requiredIdx, i)
        }
        map[array[i]] = i
    }
    return intArrayOf()
}
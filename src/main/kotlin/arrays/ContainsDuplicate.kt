package arrays

fun main() {
    val array1 = intArrayOf(1, 2, 3, 4, 5, 1)
    val array2 = intArrayOf(1, 2, 3, 4, 5)
    println("is Duplicate 1: ${isDuplicate(array1)}")
    println("is Duplicate 2: ${isDuplicate(array2)}")
}

fun isDuplicate(array: IntArray): Boolean {
    val set = hashSetOf<Int>()
    for (i in array.indices) {
        if (set.contains(array[i])) return true
        set.add(array[i])
    }
    return false
}
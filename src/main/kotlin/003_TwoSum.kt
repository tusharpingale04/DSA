fun main() {
    val array = intArrayOf(2,3,5,7,8,9)
    val result = twoSum(array, 9)
    println("Result: ${result.toList()}")
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = hashMapOf<Int, Int>()
    for (i in nums.indices) {
        val requiredNum = target - nums[i]
        val requiredIndex = map[requiredNum]
        if (requiredIndex != null) {
            return intArrayOf(requiredIndex, i)
        }
        map[nums[i]] = i
    }
    return intArrayOf()
}
package misc

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val num = 30
    val result = groupAnagrams(arrayOf("eat","tea","tan","ate","nat","bat"))
    println("Factorial of $num = $result")
}

fun factorial(num: Int): Long {
    return if (num >= 1) {
        num * factorial(num - 1)
    } else {
        1
    }
}

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map = hashMapOf<String, ArrayList<String>>()
    strs.forEach { str ->
        val charsCount = IntArray(26)
        for (i in str.indices) {
            charsCount[str[i] - 'a']++
        }
        val key = charsCount.contentToString()
        if (!map.containsKey(key)) {
            map[key] = arrayListOf()
        }
        map[key]?.add(str)
    }
    return map.values.toList()
}
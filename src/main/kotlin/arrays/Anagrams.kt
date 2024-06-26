package arrays

fun main() {
    println("is Anagram: ${isAnagram(s = "car", t = "arc")}")
    println("group anagrams: ${groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))}")
}

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val charsCount = IntArray(26)
    for (i in s.indices) {
        charsCount[s[i] - 'a']++
        charsCount[t[i] - 'a']--
    }
    for (count in charsCount) {
        if (count != 0) {
            return false
        }
    }
    return true
}

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map = hashMapOf<String, ArrayList<String>>()
    for (str in strs) {
        val charsCount = IntArray(26)
        for (element in str) {
            charsCount[element - 'a']++
        }
        val key = charsCount.contentToString()
        if (!map.containsKey(key)) {
            map[key] = ArrayList()
        }
        map[key]?.add(str)
    }
    return map.values.toList()
}
package misc
fun main() {
    val result = isPalindrome("A man, a plan, a canal: Panama")
    println("Result: $result")
}

fun isPalindrome(s: String): Boolean {
    val input = cleanString(s)
    if(input.isEmpty()) return true
    var left = 0
    var right = input.length - 1
    while (left <= right) {
        if (input[left] != input[right]) {
            return false
        }
        left++
        right--
    }
    return true
}

fun cleanString(s: String): String {
    val newString: StringBuilder = StringBuilder("")
    for (i in s.indices) {
        if (s[i].isLetterOrDigit()) newString.append(s[i])
    }
    return newString.toString().toLowerCase()
}
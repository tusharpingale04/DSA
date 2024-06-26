package misc

fun main() {
    println("IsPalindrome: ${isPalindrome(1234)}")
    println("IsPalindrome: ${isPalindrome(121)}")
}

fun isPalindrome(x: Int): Boolean {
    var input  = x
    var rev = 0
    while (input > 0) {
        val lastNum = input % 10
        rev = rev * 10 + lastNum
        input /= 10
    }
    return x == rev
}


fun main() {
    val num = 30
    val result = factorial(num = num)
    println("Factorial of $num = $result")
}

fun factorial(num: Int): Long {
    return if (num >= 1) {
        num * factorial(num - 1)
    } else {
        1
    }
}
package misc

fun main() {
    val result = findTheWinner(5, 3)
    println("Result: $result")
}

fun helper(n: Int, k: Int): Int {
    println("why gg:: n: $n, k: $k")
    if (n == 1)
        return 0
    return (helper(n - 1, k) + k) % n
}

fun findTheWinner(n: Int, k: Int): Int {
    return helper(n, k) + 1
}
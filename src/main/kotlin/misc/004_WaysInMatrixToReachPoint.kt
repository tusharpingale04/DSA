package misc

fun main() {
    val result = count(3,3)
    println("Result: $result")
}

fun count(n: Int, m: Int): Int {
    if (n == 1 || m == 1) {
        return 1
    }
    return count(n - 1, m) + count(n, m - 1)
}
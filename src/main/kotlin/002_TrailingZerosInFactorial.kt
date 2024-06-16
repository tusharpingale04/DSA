
fun main() {
    val result = countTrailingZeros(30)
    println("trailing zeros: $result")
}

/**
 * Here Factorial of 10 = 3628800
 * The trailing Zeros are 2
 * To calculate this we need to find how many numbers are present in factorial which are divisible by 5.
 * For eg 1 2 3 4 5 6 7 8 9 10 -> here 2 numbers are present which are 5, and 10 hence the count will be 2
 * edge case -> in case of 30...5 divisible numbers will be 5,10,15,20,25,30 -> here 25 is further divisible.
 * for larger numbers, 125 & 625 are also further divisible
 *
 * hence formula will be n/5 + n/25 + n/125 and so on
 */
fun countTrailingZeros(n: Int): Int {
    var result = 0
    for (i in generateSequence(5) { it * 5 }.takeWhile { it <= n }) {
        result += n / i
    }
    return result
}
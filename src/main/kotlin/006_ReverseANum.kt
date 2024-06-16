import kotlin.math.abs

fun main() {
    val result = reverse(3435987)
    println("Result: $result")
}

fun reverse(x: Int): Int {
    var input  = abs(x)
    var rev = 0
    while (input > 0) {
        val lastNum = input % 10
        rev = rev * 10 + lastNum
        input /= 10
    }
    return if(x < 0) -rev else rev
}
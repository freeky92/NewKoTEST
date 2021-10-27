package kata_solutions

class SumOddNumbers

fun rowSumOddNumbers(n: Int): Int {
    var sum = 0
    for (i in (n*(n-1)+1)..(n*n+(n-1)) step 2) {
        sum += i
    }
    return sum
}

fun main() {
    println(rowSumOddNumbers(5))
}
import java.util.*

class Solution2

fun calculateEvenDigits(input: String): Int {

    var evenSum = 0

    for (i in input) {
        val even: Int = i.digitToInt()
        if ((even % 2) == 0) {
            evenSum += even
        }
    }
    return evenSum
}


fun calculateBugMentions(input: List<String>): Int {
    var bugsCount = 0
    val bug = "BUG"
    for (i in input) {
        if (i.uppercase() == bug) {
            bugsCount++
        }
    }
    return bugsCount
}

fun calculateWordStat(input: String): String {

    val words: List<String> = input.split(" ")

    // println(words.groupingBy { it }.eachCount().filter { it.value > 1 })

    var maxC = 0
    var maxCWord = ""

    /*words.distinct() - отбрасываем повторения, для сокращения работы алгоритма.
    * Collections.frequency(list, елемент типа T) - подсчитывает количество указанных элементов
    * */

    for (item in words.distinct()) {
        if (maxC < Collections.frequency(words, item)) {
            maxC = Collections.frequency(words, item)
            maxCWord = item
        }
    }
    println(maxC)
    return maxCWord
}





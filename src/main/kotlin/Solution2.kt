class Solution2

fun calculateEvenDigits(input: String): Int {

    var evenSum = 0

    for (i in input) {
        val even: Int = i.digitToInt()
        if ((even % 2) == 0){
            evenSum += even
        }
    }
    return evenSum
}


fun calculateBugMentions(input:List<String>): Int{
    var bugsCount = 0
    val bug = "BUG"
    for (i in input){
        if (i.uppercase() == bug){
            bugsCount++
        }
    }
    return bugsCount
}





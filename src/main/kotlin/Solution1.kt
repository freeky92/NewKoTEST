class Solution1

fun simpleSample(age: Int): String {
    val state: String = when {
        (age >= 0) && (age < 11) -> "child"
        (age >= 11) && (age < 18) -> "teen"
        (age >= 18) && (age < 25) -> "adult"
        (age >= 25) && (age < 60) -> "full-fledged"
        (age >= 60) && (age < 135) -> "old-man"
        else -> "Wrong age!"
    }
    return state
}

fun listStringToListInt(str: String): List<Int> {
    return str.split(" ").map { it.toInt() }
}



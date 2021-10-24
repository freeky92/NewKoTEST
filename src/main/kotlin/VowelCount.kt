class VowelCount

/**
 * Принимает в качестве аргумента string убирает все символы кроме гласных исключая Y
 * и возвращает их количество
 * */

fun getCount(str: String): Int = str.replace("[^aeiou]".toRegex(), "").count()
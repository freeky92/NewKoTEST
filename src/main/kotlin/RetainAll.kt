class RetainAll

/**
 * Метод получает string аргументы, складывает строки и исключает повторяющиеся элементы
 * */

fun longest(s1: String, s2: String): String = (s1 + s2).toSortedSet().joinToString("")


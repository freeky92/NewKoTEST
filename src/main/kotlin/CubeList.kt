class CubeList

fun getCubeList(n: Int): List<Int> {

    return List(n) { i -> i * i * i }
}

fun getLength1(str: String?): Int? {
    return str?.length
}

fun getLength2(str: String?): Int {
    return str?.length ?: 0
}

fun getLength3(str: String?): Int {
    return str!!.length
}
class CubeList

fun getCubeList(n: Int): List<Int> {

    return List(n) { i -> i * i * i }
}

fun getLength(str: String?): Int? {
    return str?.length
}
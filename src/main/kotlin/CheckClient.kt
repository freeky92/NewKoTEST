class CheckClient

class DogException : Exception()
class CatException : Exception()
class EngineNotFoundException : Exception()
class SensorsMeltException : Exception()

fun checkClient(client: String) {

    if (client.contains("dog", true)) {
        throw DogException()
    }

    if (client.contains("cat", true)) {
        throw CatException()
    }

}

class SphinxesException(message: String) : Exception() {
    override fun toString(): String {
        return super.toString() + message
    }
}

fun rawEngineStatus(num: Int): String{
    return "0"
}

fun engineStatus(engineNumber: Int): String {

    val r: String

    try {
        r = rawEngineStatus(engineNumber)
    } catch (e: EngineNotFoundException) {
        return "engine $engineNumber not found"
    } catch (e: SensorsMeltException){
        return "engine $engineNumber offline"
    }
    return r

}
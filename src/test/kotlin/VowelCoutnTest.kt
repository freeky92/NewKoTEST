import custom_classes.MyFunSpec
import io.kotest.matchers.shouldBe

class VowelCountTest : MyFunSpec() {

    init {
        test("Vowel Count Test1") {
            getCount("abracadabra") shouldBe 5
            println(getCount("abracadabra"))
        }
    }

    init {
        test("Vowel Count Test2") {
            getCount("test") shouldBe 1
            println(getCount("test"))
        }
    }

    init {
        test("Vowel Count Test3") {
            getCount("example") shouldBe 3
            println(getCount("example"))
        }
    }
}
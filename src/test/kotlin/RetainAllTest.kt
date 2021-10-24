import custom_classes.MyFunSpec
import io.kotest.matchers.shouldBe

class RetainAllTest : MyFunSpec() {

    init {
        test("RetainTest 1 ") {
            longest("aretheyhere","yestheyarehere") shouldBe "aehrsty"
        }
    }

    init {
        test("RetainTest 2 ") {
            longest("loopingisfunbutdangerous", "lessdangerousthancoding") shouldBe "abcdefghilnoprstu"
        }
    }

    init {
        test("RetainTest 3 ") {
            longest("inmanylanguages", "theresapairoffunctions") shouldBe "acefghilmnoprstuy"
        }
    }
}
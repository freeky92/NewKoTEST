import custom_classes.MyFunSpec
import io.kotest.matchers.shouldBe

class StorageTest : MyFunSpec() {

    init {
        test("Storage test 1 9") {
            val ss1 = SugarStorage(10)
            println(ss1.volume)
            ss1.decreaseSugar(9)
            println(ss1.volume)
            ss1.volume shouldBe 1
        }
    }

    init {
        test("Storage test 2 11") {
            val ss1 = SugarStorage(10)
            println(ss1.volume)
            ss1.decreaseSugar(11)
            println(ss1.volume)
            ss1.volume shouldBe 0
        }
    }

    init {
        test("Storage test 3 -11") {
            val ss1 = SugarStorage(10)
            println(ss1.volume)
            ss1.decreaseSugar(-11)
            println(ss1.volume)
            ss1.volume shouldBe 10
        }
    }
}
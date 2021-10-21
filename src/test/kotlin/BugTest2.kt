import bugs.BugCivilian
import custom_classes.MyFunSpec
import io.kotest.matchers.shouldBe

class BugTest2 : MyFunSpec() {

    init {
        test("BugCivilian test 1 rank = 10") {
            val bc1 = BugCivilian(10, "BugNug")
            bc1.getSugarLimit() shouldBe 5
            println("rank =${bc1.rank} sugraL =${bc1.getSugarLimit()}")
        }
    }

    init {
        test("BugCivilian test 2 rank = 20") {
            val bc1 = BugCivilian(20, "BugKriak")
            bc1.getSugarLimit() shouldBe 10
            println("rank =${bc1.rank} sugraL =${bc1.getSugarLimit()}")
        }
    }
}
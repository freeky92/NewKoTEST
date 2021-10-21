import custom_classes.MyFunSpec
import io.kotest.matchers.shouldBe

class PlayerTest: MyFunSpec() {
    init {
        test("Player test1"){
            val p1 = Player(name = "Sonia")

            p1.receiveXP(10)
            p1.getLvl() shouldBe 2
            p1.getName() shouldBe "Sonia"
        }
    }
    init {
        test("Player test2"){
            val p1 = Player(name = "Sonia")

            p1.receiveXP(1000)
            println(p1)
            p1.getLvl() shouldBe 7
        }
    }
}
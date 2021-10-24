import custom_classes.MyFunSpec
import io.kotest.matchers.shouldBe

class CubeListTest : MyFunSpec() {

    init {
        test("Cube Test 1") {
            getCubeList(7) shouldBe listOf(0, 1, 8, 27, 64, 125, 216)
            println(getCubeList(7))
        }
    }

    init {
        test("Cube Test 2") {
            getCubeList(1) shouldBe listOf(0)
            println(getCubeList(1))
        }
    }

    init {
        test("Cube Test 3") {
            getCubeList(9) shouldBe listOf(0,1,8,27,64,125,216,343,512)
            println(getCubeList(9))
        }
    }

}
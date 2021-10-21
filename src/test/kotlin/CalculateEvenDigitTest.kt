import custom_classes.MyFunSpec
import io.kotest.matchers.shouldBe

class CalculateEvenDigitTest : MyFunSpec(){

    init {
        test("Test 1 59408235"){
            calculateEvenDigits("59408235") shouldBe 14
        }
    }
    init {
        test("Test 2 660308340"){
            calculateEvenDigits("660308340") shouldBe 24
        }
    }

}


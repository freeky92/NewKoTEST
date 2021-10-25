import custom_classes.MyFunSpec
import io.kotest.matchers.shouldBe

class CalculateEvenDigitTest : MyFunSpec() {

    init {
        test("Test 1 59408235") {
            calculateEvenDigits("59408235") shouldBe 14
        }
    }

    init {
        test("Test 2 660308340") {
            calculateEvenDigits("660308340") shouldBe 24
        }
    }

    init {
        test("calcWordTest 1") {
            val c = calculateWordStat("PDDPEM MXWHL XJID XJID XJID DTQEHGC DTQEHGC MXWHL XJID DTQEHGC DTQEHGC MXWHL PDDPEM QUCO DTQEHGC" +
                    " MXWHL DTQEHGC MXWHL PDDPEM XJID MXWHL DTQEHGC DTQEHGC XJID XJID XJID MXWHL MXWHL MXWHL MXWHL DTQEHGC PDDPEM DTQEHGC" +
                    " DTQEHGC PDDPEM")
            println(c)
        }
    }

}


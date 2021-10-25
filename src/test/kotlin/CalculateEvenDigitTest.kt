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
            val c = calculateWordStat(
                "PDDPEM MXWHL XJID XJID XJID DTQEHGC DTQEHGC MXWHL XJID DTQEHGC DTQEHGC MXWHL PDDPEM QUCO DTQEHGC" +
                        " MXWHL DTQEHGC MXWHL PDDPEM XJID MXWHL DTQEHGC DTQEHGC XJID XJID XJID MXWHL MXWHL MXWHL MXWHL DTQEHGC PDDPEM DTQEHGC" +
                        " DTQEHGC PDDPEM"
            )
            println(c)
        }
    }

    init {
        test("CalcNullValues 1") {

            val result = calcNullValues(
                arrayOf(
                    82, null, null, null, null, null, 7, 55, null, 59, 4, 25, null,
                    null, 66, null, 3, 62, 55, null, 42, 5, 35, 8, null
                )
            )
            result shouldBe arrayOf(11, 508)
            println(result.toList())
        }
    }

    init {
        test("ListStringToListInt 1") {
            val result = listStringToListInt("1 0 999 2345 2 2 1 13 45")
            result shouldBe listOf(1, 0, 999, 2345, 2, 2, 1, 13, 45)
            println(result)
        }
    }


}


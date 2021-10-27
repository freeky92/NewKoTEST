package kata_solutions_test

import custom_classes.MyFunSpec
import io.kotest.matchers.shouldBe
import kata_solutions.rowSumOddNumbers

class SumOddNumbersTest : MyFunSpec() {

    init {
        test("SumOddNumbersTest 1") {
            val result = rowSumOddNumbers(1)
            result shouldBe 1
            println(result)
        }

        test("SumOddNumbersTest 2") {
            val result = rowSumOddNumbers(2)
            result shouldBe 8
            println(result)
        }

        test("SumOddNumbersTest 3") {
            val result = rowSumOddNumbers(13)
            result shouldBe 2197
            println(result)
        }

        test("SumOddNumbersTest 4") {
            val result = rowSumOddNumbers(19)
            result shouldBe 6859
            println(result)
        }

        test("SumOddNumbersTest 5") {
            val result = rowSumOddNumbers(41)
            result shouldBe 68921
            println(result)
        }

        test("SumOddNumbersTest 6") {
            val result = rowSumOddNumbers(42)
            result shouldBe 74088
            println(result)
        }

        test("SumOddNumbersTest 7") {
            val result = rowSumOddNumbers(74)
            result shouldBe 405224
            println(result)
        }

        test("SumOddNumbersTest 8") {
            val result = rowSumOddNumbers(86)
            result shouldBe 636056
            println(result)
        }

        test("SumOddNumbersTest 9") {
            val result = rowSumOddNumbers(93)
            result shouldBe 804357
            println(result)
        }

        test("SumOddNumbersTest 10") {
            val result = rowSumOddNumbers(101)
            result shouldBe 1030301
            println(result)
        }

    }

}
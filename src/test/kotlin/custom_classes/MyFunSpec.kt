package custom_classes

import io.kotest.core.spec.style.FunSpec
import io.kotest.core.test.TestCase
import io.kotest.core.test.TestResult
import java.time.LocalDate

abstract class MyFunSpec : FunSpec() {
    private val date = LocalDate.now().atStartOfDay()!!

    override fun beforeTest(testCase: TestCase) {
        println("$date " + testCase.displayName)
        super.beforeTest(testCase)
    }

    override fun afterTest(testCase: TestCase, result: TestResult) {
        println("\n")
        super.afterTest(testCase, result)
    }
}
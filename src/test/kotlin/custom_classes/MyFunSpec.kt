package custom_classes

import io.kotest.core.spec.style.FunSpec
import io.kotest.core.test.TestCase
import java.time.LocalDate

abstract class MyFunSpec : FunSpec() {
    private val date = LocalDate.now().atStartOfDay()!!

    override fun beforeTest(testCase: TestCase) {
        println("$date " + testCase.displayName)
        super.beforeTest(testCase)
    }
}
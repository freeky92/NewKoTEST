import io.kotest.core.spec.style.FunSpec
import io.kotest.core.test.TestCase
import io.kotest.matchers.shouldBe
import java.time.LocalDate

abstract class MyFunSpec : FunSpec() {
    private val date = LocalDate.now().atStartOfDay()!!

    override fun beforeTest(testCase: TestCase) {
        println("$date " + testCase.displayName)
    }
}

class StateTest : MyFunSpec() {

    init {
        test("test 1 age = 5") {
            simpleSample(5) shouldBe "child"
        }
    }

    init {
        test("test 2 age = 18") {
            simpleSample(18) shouldBe "adult"
        }
    }

    init {
        test("test 3 age = 13") {
            simpleSample(13) shouldBe "teen"
        }
    }

    init {
        test("test 4 age = 61") {
            simpleSample(61) shouldBe "old-man"
        }
    }
}

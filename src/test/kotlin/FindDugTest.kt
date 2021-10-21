import custom_classes.MyFunSpec
import io.kotest.matchers.shouldBe

class FindDugTest : MyFunSpec() {

    init {
        test("FindBug Test 1 "){

            val bagText = arrayListOf("KLPQYM", "BUG", "KHQR", "KLPQYM", "JVOJTD", "JVOJTD", "BUG", "BUG", "KHQR", "BUG",
                "KLPQYM", "JVOJTD", "KLPQYM", "JVOJTD", "QLSPA", "KHQR", "JVOJTD", "KLPQYM", "JVOJTD", "KLPQYM", "KLPQYM", "JVOJTD",
                "JVOJTD", "BUG", "KLPQYM", "KHQR", "JVOJTD", "KHQR", "KLPQYM", "KLPQYM", "JVOJTD", "KLPQYM", "BUG", "BUG", "BUG")

            calculateBugMentions(bagText) shouldBe 8
        }
    }


}
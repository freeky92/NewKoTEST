import custom_classes.MyFunSpec
import io.kotest.matchers.shouldBe

class GetLengthNullQTest : MyFunSpec() {

    init {
        test("GetLengthTest 1") {}
        val result = getLength(
            "MT3C0V5IA7EN2VLEAJYU3PWHJ6X4OGGXIHBHHKLYQZH" +
                    "5738HNVZRTGO0MHGRZGZDKDS9SIQ7S3Q5L9L2QISAXDRW1W7F156SYM"
        )
        result shouldBe 98
    }

}
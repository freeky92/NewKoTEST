import custom_classes.MyFunSpec
import io.kotest.matchers.shouldBe

class GetLengthNullQTest : MyFunSpec() {

    init {
        test("GetLength1Test 1") {}
        val result = getLength1(
            "MT3C0V5IA7EN2VLEAJYU3PWHJ6X4OGGXIHBHHKLYQZH" +
                    "5738HNVZRTGO0MHGRZGZDKDS9SIQ7S3Q5L9L2QISAXDRW1W7F156SYM"
        )
        result shouldBe 98
        println(result)
    }

    init {
        test("GetLength2Test 1") {}
        val result = getLength2(
            "MT3C0V5IA7EN2VLEAJYU3PWHJ6X4OGGXIHBHHKLYQZH" +
                    "5738HNVZRTGO0MHISAXDRW1W7F156SYM"
        )
        result shouldBe 98
        println(result)
    }

    init {
        test("GetLength2Test 2") {}
        val result = getLength2(null)
        result shouldBe 0
        println(result)
    }

}
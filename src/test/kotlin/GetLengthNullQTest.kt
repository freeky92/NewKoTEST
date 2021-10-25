import custom_classes.MyFunSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

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
        result shouldBe 75
        println(result)
    }

    init {
        test("GetLength2Test 2") {}
        val result = getLength2(null)
        result shouldBe 0
        println(result)
    }

    init {
        test("GetLength3Test 1") {}
        shouldThrow<NullPointerException> { getLength3(null) }
    }

    init {
        test("GetLength3Test 2") {}
        val result = getLength3(
            "Q9FQ0H58DECMM1OMFZ7NJZQ6QEH6HQ7282Q4YI28F9Z64DE" +
                    "PJRCU5YQKVW6GINLUFTHRO6ZM5F5MY6BLCPOWUF8OA"
        )
        result shouldBe 89
        println(result)
    }

}
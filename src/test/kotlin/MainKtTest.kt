import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun taxes_visa() {
        val payType: String = "Visa"
        val summMonth: Int = 800000
        val summ: Int = 25000
        val result = taxes(payType, summMonth, summ)

        assertEquals(187, result)


    }

    @Test
    fun taxes_visa_var2() {
        val payType: String = "Visa"
        val summMonth: Int = 0
        val summ: Int = 2500
        val result = taxes(payType, summMonth, summ)

        assertEquals(100, result)


    }

    @Test
    fun taxes_Mastercard() {
        val payType: String = "Mastercard"
        val summMonth: Int = 800000
        val summ: Int = 25000
        val result = taxes(payType, summMonth, summ)

        assertEquals(170, result)
    }

    @Test
    fun taxes_Mastercard_var2() {
        val payType: String = "Mastercard"
        val summMonth: Int = 0
        val summ: Int = 25000
        val result = taxes(payType, summMonth, summ)

        assertEquals(0, result)
    }

    @Test
    fun taxes_VK_Pay() {
        val payType: String = "VK Pay"
        val summMonth: Int = 800000
        val summ: Int = 25000
        val result = taxes(payType, summMonth, summ)

        assertEquals(0, result)
    }
}
fun main() {
    val payType: String = "Visa"
    val summMonth: Int = 800000
    val summ: Int = 25000
    val taxValue = taxes(payType, summMonth, summ)
    println("сумма комиссии = $taxValue")
}

fun taxes(payType: String = "VK Pay", summMonth: Int = 0, summ: Int): Int {

    return when (payType) {
        "Mastercard", "Maestro" -> if (summMonth + summ <= 75000) 0 else (20 + (summ * 6 / 1000))
        "Visa", "Мир" -> if (summ * 75 / 10000 <= 35) 35 else summ * 75 / 10000
        else -> 0
    }

}
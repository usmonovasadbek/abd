fun main() {
    val usdToEurRate = 1.0
    val eurToUsdRate = 1 / usdToEurRate

    fun convertCurrency(amount: Double, fromCurrency: String, toCurrency: String): Double {
        return when {
            fromCurrency == "USD" && toCurrency == "EUR" -> amount * usdToEurRate
            fromCurrency == "EUR" && toCurrency == "USD" -> amount * eurToUsdRate
            fromCurrency == "UZS" && toCurrency == "USD" -> amount / 2 // Misol uchun
            fromCurrency == "USD" && toCurrency == "UZS" -> amount * 2 // Misol uchun
            else -> amount
        }
    }

    val somAmount = 2.0
    val usdAmount = convertCurrency(somAmount, "UZS", "USD")
    println("$somAmount som = $usdAmount USD")

    val valAmount = 1.0
    val eurAmount = convertCurrency(valAmount, "USD", "EUR")
    println("$valAmount USD = $eurAmount EUR")
}

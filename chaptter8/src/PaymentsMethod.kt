abstract class PaymentsMethod(val name: String)
{
    fun authorize(amount: Double)
    {
        println("Authorizing payment of $$amount")
    }

    abstract fun processPayment(amount: Double)
}

class CredictCards(name: String): PaymentsMethod(name), Refundable
{
    override fun processPayment(amount: Double) {
        println("Processing credit card payment of $$amount")
    }

    override fun refund(amount: Double)
    {
        println("Refunding $$amount to the credit card")
    }
}

fun main()
{
    val visa = CredictCards("Visa")
    visa.authorize(100.0)
    visa.processPayment(100.0)
    visa.refund(78.0)
}
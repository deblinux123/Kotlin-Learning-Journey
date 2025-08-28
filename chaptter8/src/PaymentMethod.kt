import jdk.jfr.DataAmount

interface PaymentMethod
{
    fun initiatePayment(amount: Double): String
}
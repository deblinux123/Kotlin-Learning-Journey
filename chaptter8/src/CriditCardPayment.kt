import javax.security.auth.login.CredentialException

class CriditCardPayment(val cardNumber: String, cardHolderName: String, val expiryDate: String): PaymentMethod, PaymentType
{
    override fun initiatePayment(amount: Double): String {
        return "Payment of $$amount initiated using Credit Card ending in ${cardNumber.takeLast(4)}"
    }

    override val paymentType: String = "Credit Card"
}

fun main()
{
    val paymentMethod = CriditCardPayment("1234 5678 9012 3456", "John Doe", "12/25")
    paymentMethod.initiatePayment(100.0)

    println("Payment is by ${paymentMethod.paymentType}")
    println("Hello")
}
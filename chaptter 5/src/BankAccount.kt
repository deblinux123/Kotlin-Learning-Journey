class BankAccount(private var balance: Double) {
    fun getBalance(): Double
    {
        return balance
    }

    fun deposti(amount: Double)
    {
        if (amount > 0)
        {
            balance += amount
            println("Deposit $amount. New Balance -> $balance")
        }
        else
        {
            println("Somthing wring")
        }
    }

    fun withdraw(amount: Double)

    {
        if (amount <= balance && amount > 0)
        {
            balance-=amount
            println("Withdraw $amount. New Balance -> $balance")
        }
        else
        {
            println("Somthing wrong.")
        }
    }
}


fun main()
{
    val account = BankAccount(100.0)
    account.deposti(120.9)
    account.withdraw(300.9)
    println("Final Balance: ${account.getBalance()}")
}
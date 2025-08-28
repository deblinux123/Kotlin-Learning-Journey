data class ProductInfo(val priceInDollars: Double?)


class Product
{
    fun getProductInfo(): ProductInfo?{
        return ProductInfo(100.0)
    }
}

fun Product.getPriceInEuro() = getProductInfo()?.priceInDollars?.let {
    convertToEuro(it)
}
fun convertToEuro(dollars: Double): Double
{
    return dollars * 0.85
}


fun main()
{
    val product = Product()
    val priceInEuro = product.getPriceInEuro()

    if (priceInEuro != null)
    {
        println("Price in Euro: €$priceInEuro")
    }
    else
    {
        println("Price information is not available")
    }
}
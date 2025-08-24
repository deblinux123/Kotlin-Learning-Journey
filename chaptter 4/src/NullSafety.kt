/*
| ویژگی | توضیح                                         |
| ----- | --------------------------------------------- |
| `?`   |  متغیر می‌تونه null باشه                       |
| `?.`  | دسترسی ایمن به متغیر nullable                 |
| `?:`  |  مقدار پیش‌فرض وقتی null باشه (Elvis operator) |
| `!!`  | اطمینان اجباری (خطرناک!)                      |
| `let` | اجرای کد فقط وقتی مقدار null نیست         let |

 */





fun main()
{
    var name: String? = "Farid"
    name = null

    println(name)

    var username: String? = "Sara"
    println(username?.uppercase())

    username = null
    println(username?.uppercase()) // get null instead of error

    var email: String? = null
    println(email ?: "unknown email")

    var password: String? = "myPass"
    println(password!!) // it's not null

//    password = null
//    println(password!!.uppercase())

    var price: Int? = 230 // run if value not null
    price?.let {
        println("Price: $price")
    }

    price = null // it's not run
    price?.let {
        println("Price: $price")
    }
}



fun main() {
    val fortune = getFortuneCookie()
    println(fortune)
}

fun getFortuneCookie() : String{
    val fortunes : List<String> = listOf(
            "You will have a great day", "Things will go wel for you today", "Enjoy a wonderful day of success",
            "Be humble and all will turn out well", "Today is a good day for exercising restraint","Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune."
    )
    print("Enter your birthday >>>")
    var birthday = readLine()!!.toIntOrNull()
    if (birthday == null) birthday = 1

    return fortunes[birthday%fortunes.size]
}
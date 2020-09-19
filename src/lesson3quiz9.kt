fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}

fun getFortune(birthday: Int) : String{
    val fortunes : List<String> = listOf(
            "You will have a great day", "Things will go wel for you today", "Enjoy a wonderful day of success",
            "Be humble and all will turn out well", "Today is a good day for exercising restraint","Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune."
    )
    var index  = when(birthday){
        in 1..10 -> 1
        28,30,31 -> 8
        else -> (Math.random()*7).toInt()
    }
    return fortunes[index]
}

fun getBirthday():Int{
    print("Input your birthday >>>")
    var birthday : Int? = readLine()!!.toIntOrNull()
    if (birthday == null) birthday = 1
    return  birthday
}
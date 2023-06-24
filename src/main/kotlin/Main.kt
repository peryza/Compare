fun main(args: Array<String>) {

    val s1 = RandomMy(15,true,false).uppercase()
    val s2 = RandomMy(15,true,false).uppercase()

    println("s1 = $s1")
    println("s2 = $s2")
    println("Мое сравнение ${CompareMy(s1,s2)}")
    println("Сравнение котлина ${s1.compareTo(s2)}")
    println("Program arguments: ${args.joinToString()}")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}
//Метод для лексикографического сравнения
fun CompareMy(stringOne:String,stringTwo:String):Int{
    val minLength:Int = Math.min(stringOne.length,stringTwo.length)
    for (i in 0..(minLength-1)){
        if (stringOne[i].code > stringTwo[i].code){
            return stringOne[i].code - stringTwo[i].code
        }
        if (stringOne[i].code < stringTwo[i].code){
            return stringOne[i].code - stringTwo[i].code
        }
    }
    return stringOne.length-stringTwo.length
}
//маетод для рандомоной строки
fun RandomMy(StringLen:Int, f:Boolean=false,k:Boolean=false):String{
    val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    val onlyFigureChars = ('0'..'9')
    val onlyLetterChars = ('A'..'Z') + ('a'..'z')
    if (f and k)
        return (1..StringLen)
            .map { allowedChars.random() }
            .joinToString("")
    if (f)
        return (1..StringLen)
            .map { onlyLetterChars.random() }
            .joinToString("")
    if (k)
        return (1..StringLen)
            .map { onlyFigureChars.random() }
            .joinToString("")

    return (1..StringLen)
        .map { allowedChars.random() }
        .joinToString("")
}

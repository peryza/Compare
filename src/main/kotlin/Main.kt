fun main(args: Array<String>) {

}
//Метод для лексикографического сравнения
fun CompareMy(stringOne:String,stringTwo:String):Int{
    val minLength:Int = stringOne.length.coerceAtMost(stringTwo.length)
    for (i in 0 until minLength){
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
fun RandomMy(n:Int, f:Boolean=false, k:Boolean=false):String{
    val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    val onlyFigureChars = ('0'..'9')
    val onlyLetterChars = ('A'..'Z') + ('a'..'z')
    if (f and k)
        return (1..n)
            .map { allowedChars.random() }
            .joinToString("")
    if (f)
        return (1..n)
            .map { onlyLetterChars.random() }
            .joinToString("")
    if (k)
        return (1..n)
            .map { onlyFigureChars.random() }
            .joinToString("")

    return (1..n)
        .map { allowedChars.random() }
        .joinToString("")
}

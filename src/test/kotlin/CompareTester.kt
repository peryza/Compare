import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.RepetitionInfo
import kotlin.test.assertEquals

class CompareTester {

    @RepeatedTest(value = 1000)
    fun unitTest(repetitionInfo: RepetitionInfo){
        val s1 = RandomMy(10,false,true).uppercase()
        val s2 = RandomMy(10,false,true).uppercase()
        val actual = CompareMy(s1,s2)
        val excepted = s1.compareTo(s2)

        assertEquals(actual, excepted, "Тест ${repetitionInfo.currentRepetition} упал. Ожидаемый результат: $excepted, Фактический результат: $actual")

        if(actual==excepted){
            println("----test ${repetitionInfo.currentRepetition} is successful")
        }
        else{
            println("----test ${repetitionInfo.currentRepetition} invalid")
        }
    }

}
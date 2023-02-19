package Reyting
open class Reyting constructor(var kol1:Int,var kol2:Int)
{
    open fun reytN()
    {
        println("Рейтинг NETFLIX: $kol1 ")

    }

    open fun reyt()
    {
        print("Введите рейтинг от Нетфликс")
        kol1= readLine()!!.toInt()
        kol2=(kol1/100)*80
        print("Введите рейтинг от людей $kol2")
    }
}
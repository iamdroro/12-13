import product.*
class Pribul constructor(var epname: String, var epprice : Double,var pedizm:String, var epkol:Int,var pribul:Double): product(epname,epprice,pedizm, epkol, pribul) {
    fun ppribul() {
       pribul=epkol*epprice
    }
    fun Getinfo(){
        println("Информация товара $epname:")
    }
       override fun input() {
           println("Введите название товара: ")
           epname = readLine()!!.toString()
           println("Введите цену:")
           epprice = readLine()!!.toDouble()
           println("Введите ед.измерения: ")
           pedizm = readLine()!!.toString()
           println("Введите количество товара: ")
           epkol = readLine()!!.toInt()
           ppribul()
           println("Товар: $epname\nЦена:$epprice $\nЕдиницы измерения: $pedizm\nКол-во товара: $epkol\nПрибыль: $pribul")

    }
}
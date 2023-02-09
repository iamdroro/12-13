class kino (var filmname:String,var  seans:Double,  var price:Double,   var zal:Int,var kol:Int ) {
/*val filmname:String="Счастливы вместе"
    val  seans:Double=1.38
  val price:Double=275.5
    val zal:Int=6
    val kol:Int=150*/
    fun inform()
{
        println("Название фильма\n"+filmname+"\nДлина сеанса"+seans+"\nЦена сеанса"+price+"\nНомер зала"+zal+"\nКол-во зрителей"+kol )
    }

fun s(){
    println("фильм")
    println(filmname)
    println("длительность фильма")
    println(seans)
    println("цена фильма")
    println (price)
    println("номер зала")
    println (zal)
    println("кол-во зрителей")
    println (kol)
}
    fun m() {

            println("Напишите название фильма")
            var filmname = readLine()!!.toString()
            println("Напишите длительность фильма")
            var seans = readLine()!!.toDouble()
            if(seans>0) {
                println("Напишите цену фильма")
                var price = readLine()!!.toDouble()
                if(price>0) {
                    println("Напишите номер зала")
                    var zal = readLine()!!.toInt()
                    if (zal>0) {
                        println("Напишите кол-во зрителей")
                        var kol = readLine()!!.toInt()
                        if (kol>0){
                            println("Название фильма ${(filmname)}")
                            println("Длительность фильма ${(seans)}")
                            println("Цена фильма ${(price)}")
                            println("Номер зала ${(zal)}")
                            println("Кол-во зрителей ${(kol)}")

                        }else {
                            println("Кол-во зрителей не может быть отрицательныйм")
                        }
                    }else{
                        println("Зал не может быть отрицательныйм")}
                }else{
                    println("Цена не может быть отрицательной")}
            }else{println("Длительность не может быть отрицательной")}
    }
}
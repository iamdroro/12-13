class product(var name:String, var price:Double, var edizm:String,  var vid:String, var kol:Int) {
    /*val name:String="Павидло"
   val price:Double=45.7
   val edizm:String="Rubli"
     val vid:String="Cjecs"
    val kol:Int=200*/
    fun info(){
println("Наименование товара\n"+name+"\nЦена товара"+price+"\nЕдиницы измерения"+edizm+"\nВид товара"+vid+"\nКоличество товара"+kol)
    }
fun b(){
    println("название товара")
    println(name)
    println("Цена товара")
 println(price)
    println("Введите единицы измерения")
   println(edizm)
    println("Введите вид изделия")
   println(vid)
    println("Введите кол-во")
   println(kol)
}
    fun a() {

        println("Введите название товара")
        var name = readLine()!!.toString()
        if (name>="a"&&name<="z"||name>="а"&&name<="я"||name>="A"&&name<="Z"||name>="А"&&name<="Я") {
            println("Цена товара")
            var price = readLine()!!.toDouble()
            if(price>0) {
                println("Введите единицы измерения")
                var edizm = readLine()!!.toString()
                if (edizm>="a"&&edizm<="z"||edizm>="а"&&edizm<="я"||edizm>="A"&&edizm<="Z"||edizm>="А"&&edizm<="Я") {
                    println("Введите вид изделия")
                    var vid = readLine()!!.toString()
                    if (vid>="a"&&vid<="z"||vid>="а"&&vid<="я"||vid>="A"&&vid<="Z"||vid>="А"&&vid<="Я") {
                        println("Введите кол-во")
                        var kol = readLine()!!.toInt()
                        if(kol>0) {
                            println("Название товара ${(name)}")
                            println("Цена ${(price)}")
                            println("Единицы измерния ${(edizm)}")
                            println("Вид товара ${(vid)}")
                            println("Кол-во товара ${(kol)}")
                        }
                        else{
                            println("Кол-во не может быть отрицательныйм")}
                    }else{
                        println("Вид состоит из букв")}
                }else{
                    println("Единицы измерения сосотоят из букв")}
            }else{
                println("Цена не может быть отрицательной")}
        }else{
            println("Название состоит из букв")}
    }
}
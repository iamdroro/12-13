
package product
open class product(var name: String, var price: Double, var edizm: String, var vid:String, var kol:Int, var pribul: Double) {

    open fun otv() {
        println("Название: $name\n Цена: $price\n Единицы измерения: $edizm\n Вид товара: $vid\n" + " Количество: $kol\n"+"Прибыль: $pribul")

    }
open fun b(){
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
    pribul=kol*price
    println("Товар: $name\n Цена: $price\n Ед.изм: $edizm\n Вид товара: $vid\n Кол-во: $kol\n Прибыль: $pribul")
}
   open fun a() {

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
                    if (edizm>="a"&&edizm<="z"||edizm>="а"&&edizm<="я"||edizm>="A"&&edizm<="Z"||edizm>="А"&&edizm<="Я") {
                        println("Введите кол-во")
                        var kol = readLine()!!.toInt()
                        if(price>0) {

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
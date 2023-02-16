package kino
open class kino(var name: String, var seans : Double, var price : Double, var zal: Int, var humans: Int, var pribil: Double) {


    open fun otv() {
        println("Название: $name\n Длительность: $seans\n Стоимость билета: $price\n Номер зала: $zal\n" + " Кол-во человек: $humans\n" + " Прибыль: $pribil")

    }

    open fun input() {
        println("Введите название")
        name = readLine()!!.toString()
        println("Введите длительность")
        seans = readLine()!!.toDouble()
        println("Введите стоимость билета")
        price = readLine()!!.toDouble()
        println("Введите номер зала")
        zal = readLine()!!.toInt()
        println("Введите количество человек")
       humans = readLine()!!.toInt()
        pribil = 0.5 * humans
        println("Фильм: $name\n Длительность: $seans\n Стоимость билета: $price\n Номер зала: $zal\n Кол-во человек: $humans\n Прибыль: $pribil")
    }
    open fun m() {

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
                        println("Кол-во зрителей ${(humans)}")

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


    import kino.*
    class Kinoteatr constructor(var empname : String,var empseans: Double, var empcena: Double
    , var empzal: Int, var empchel: Int,var emppribil: Double) : kino(empname,empseans,empcena, empzal, empchel, emppribil) {
        fun empvsegocena() {
            empcena = 0.5*empchel
        }
        fun Getinfo(){
            println("Информация фильма $empname:")
        }

        override fun input() {
            println("Введите название фильма: ")
            empname = readLine()!!.toString()
            println("Введите длительность:")
            empseans = readLine()!!.toDouble()
            println("Введите №зала: ")
            empzal = readLine()!!.toInt()
            println("Введите количество человек: ")
            empchel = readLine()!!.toInt()
            empvsegocena()
            println("Фильм: $empname\nДлительность: $empseans\nСтоимость билета: $empcena\nНомер зала: $empzal\nКол-во человек: $empchel\nПрибыль: $emppribil")
        }
    }

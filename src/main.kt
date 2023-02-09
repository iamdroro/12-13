fun main() {
    try {
        val film:kino=kino( "Счастливы вместе", 1.38,275.5, 6, 150)
        film.s()
        film.m()
film.inform()
        val film1:kino=kino( "Счастливы вместе", 1.38,275.5, 6, 150)
        film.s()
        film.m()
        film.inform()
    }catch (e:Exception){
        println("Неправильный ввод данных")}
}
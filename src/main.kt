import kino.kino
fun main(){
    try {
        val ott: kino = kino(
            "Титаник",115.0,5.5,2,50,0.5*50
        )
        ott.otv()
        ott.input()
        ott.m()
        val ott1: Kinoteatr = Kinoteatr("Акула",90.5,30.6,5,120,0.5*120)
        ott1.Getinfo()
        ott1.input()
    }
    catch (e:Exception){
        println("Неверный ввод")
    }
}


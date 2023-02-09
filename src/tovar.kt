fun main(){
    try{

   val tov:product=product("Павидло", 45.7, "Rubli","Соус", 200)
        tov.a()
        tov.b()
        tov.info()
        val tov1:product=product("Павидло", 45.7, "Rubli","Соус", 200)
        tov.a()
        tov.b()
        tov.info()

    }catch (e:Exception){
        println("Неправильный ввод данных")}

}
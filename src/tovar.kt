import product.product
fun main(){
    try{
   val tov:product=product("Павидло",45.5,"руб","Соус",120,120*45.5)
        tov.a()
        tov.b()
        tov.otv()
val tov1:Pribul=Pribul("Чипсы",105.0,"руб",80,105.0*80)
        tov1.Getinfo()
        tov1.input()


    }catch (e:Exception){
        println("Неправильный ввод данных")}

}
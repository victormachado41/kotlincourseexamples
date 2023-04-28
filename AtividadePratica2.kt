fun main (){
    val familySalary = 56.47f
    print("Me diga quantos filhos você tem: ")
    val input = readlnOrNull()?.toInt()
    val totalSalary: Float = familySalary * input!!
    if (input == 0)
        println("Você não tem direito ao salário-família.")
    else
        println("Você tem direito a R$ $totalSalary.")
}
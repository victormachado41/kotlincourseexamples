fun main () {
    val jan = 173.00f
    val feb = 113.58f
    val mar = 145.67f
    val apr = 98.50f
    val may = 123.60f
    val sumOfBills = (jan+feb+mar+apr+may)
    val monthsAvailable = 5
    val averageOfBills = sumOfBills/monthsAvailable

    println("A soma das tarifas, de janeiro a maio, é de: R$ $sumOfBills.")
    println("O valor médio da tarifa de energia elétrica de janeiro a maio é de: R$ $averageOfBills.")

    val widthOfTriangle = 50.0f
    val heightOfTriangle = 10.0f
    val area = (widthOfTriangle*heightOfTriangle)/2

    print("A área do triângulo é de: $area m.")
}
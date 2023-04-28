fun main () {
    val arrPolygon = arrayListOf(2, 5, 9, 4, 10, 18, 1, 2, 3, 7)
    var perimeter = 0
    for (i in 0..arrPolygon.lastIndex) {
        println("""O lado de índice $i tem ${arrPolygon[i]} metros.
            | 
        """.trimMargin())
        perimeter += arrPolygon[i]
    }
    println("O perímetro do polígono é de $perimeter metros.")
}
fun cargarArray(columnas : Int): ArrayList<Int>{
    val vector = arrayListOf<Int>()
    var i = 0
    do {
        vector.add(2*i + columnas)
        i++
    }while (i != columnas)
    return vector
}
fun crearMatriz(vector1: ArrayList<Int>,vector2: ArrayList<Int>): ArrayList<ArrayList<Int>> {
    return arrayListOf(vector1,vector2)
}
fun imprimirMatriz(matriz : ArrayList<ArrayList<Int>>) {
    print("\n")
    print("La matriz es:\n")
    matriz.forEach {
        it.forEach { print("$it - ") }
        print("\n")
    }
}
fun main() {
    println("NUMERO DE COLUMNAS DEL VECTOR 1")
    val V1col = readLine()!!.toInt()
    println("NUMERO DE COLUMNAS DEL VECTOR 2")
    val V2col = readLine()!!.toInt()
    val vector1 = cargarArray(V1col)
    val vector2 = cargarArray(V2col)
    val matriz = crearMatriz(vector1,vector2)
    imprimirMatriz(matriz)
}



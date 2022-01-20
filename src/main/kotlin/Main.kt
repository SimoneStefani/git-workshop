
fun main() {
    val matrix = matrix(4, 3) { 0 }

    println(matrix)
}

inline fun <reified T> matrix(height: Int, width: Int, initialise: () -> T) = Array(height) { Array(width) { initialise() }}

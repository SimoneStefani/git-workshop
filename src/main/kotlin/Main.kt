
fun main() {
    val matrix = matrix(4, 3) { 0 }

    matrix.forEach { row ->
        row.forEach { col ->
            print("$col ")
        }
        print(" |\n")
    }
}

inline fun <reified T> matrix(height: Int, width: Int, initialise: () -> T) = Array(height) { Array(width) { initialise() }}

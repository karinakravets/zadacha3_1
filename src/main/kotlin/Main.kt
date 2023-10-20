import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Введите количество строк:")
    val rows = scanner.nextInt()

    println("Введите количество столбцов:")
    val columns = scanner.nextInt()

    val array = Array(rows) { IntArray(columns) }

    println("Введите $rows x $columns трехзначных чисел:")

    val set = HashSet<Int>()

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            val num = scanner.nextInt()
            array[i][j] = num
            set.addAll(getDigits(num))
        }
    }

    println("Двумерный массив из введенных чисел:")
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            print("${array[i][j]}\t")
        }
        println()
    }

    println("В массиве использовано ${set.size} различных цифр")
}

return num.toString().map{it.toString().toInt()}
//return num.toString().map{it.toString().toInt()}.toList()

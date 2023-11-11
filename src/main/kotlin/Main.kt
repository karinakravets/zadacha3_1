import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите количество строк:")
    val rows = scanner.nextInt()
    println("Введите количество столбцов:")
    val columns = scanner.nextInt()
    val array = Array(rows) { IntArray(columns) }
    println("Введите $rows x $columns трехзначных чисел:")
    var set = ""
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            val num = scanner.nextInt()
            array[i][j] = num
            set += num.toString().toSet().map { it.toString().toInt() }.joinToString("")
        }
    }
    println("Двумерный массив из введенных чисел:")
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            print("${array[i][j]}\t")
        }
        println()
    }
    println("В массиве использовано ${set.toSet().size} различных цифр")
}
/*100 951 101 950
519 999 155 501
510 911 144 554*/


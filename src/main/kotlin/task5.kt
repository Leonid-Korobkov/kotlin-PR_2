fun main() {
    print("Введите целое число n: ")
    val n = readlnOrNull()?.toIntOrNull()

    if (n == null) {
        println("Некорректный ввод. Пожалуйста, введите целое число.")
        return
    }

    print("Введите основание степени x: ")
    val x = readlnOrNull()?.toIntOrNull()

    if (x == null) {
        println("Некорректный ввод. Пожалуйста, введите целое число для основания степени.")
        return
    }

    val y = findExponent(n, x)

    if (y != null) {
        println("Целочисленный показатель степени y: $y")
    } else {
        println("Целочисленный показатель не существует.")
    }
}

fun findExponent(n: Int, x: Int): Int? {
    if (n == 1) {
        return 0
    }

    var y = 1
    var result = x

    while (result < n) {
        result *= x
        y++
    }

    return if (result == n) y else null
}

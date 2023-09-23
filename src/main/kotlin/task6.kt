fun main() {
    print("Введите первую цифру: ")
    val digit1 = readlnOrNull()?.toIntOrNull()

    if (digit1 == null || digit1 < 0 || digit1 > 9) {
        println("Некорректный ввод. Пожалуйста, введите цифру от 0 до 9.")
        return
    }

    print("Введите вторую цифру (различную от первой): ")
    val digit2 = readlnOrNull()?.toIntOrNull()

    if (digit2 == null || digit2 < 0 || digit2 > 9 || digit2 == digit1) {
        println("Некорректный ввод. Пожалуйста, введите цифру от 0 до 9, отличную от первой цифры.")
        return
    }

    val result = createOddNumber(digit1, digit2)

    if (result != null) {
        println("Созданное нечетное число: $result")
    } else {
        println("Создать нечетное число невозможно.")
    }
}

fun createOddNumber(digit1: Int, digit2: Int): Int? {
    if ((digit1 + digit2) % 2 != 0) {
        return digit1 * 10 + digit2
    }
    return null
}

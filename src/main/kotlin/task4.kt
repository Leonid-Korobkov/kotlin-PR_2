fun main() {
    print("Программа, с помощью которого пользователь, введя два числа и символ операции, узнает результат\nВвод производится в формате - ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ\nВведите выражение: ")

    val input = readln().split(" ")

    if (input.size != 3) {
        println("Некорректный ввод. Введите выражение в правильном формате.")
        return
    }

    val num1 = input[0].toDoubleOrNull()
    val num2 = input[1].toDoubleOrNull()
    val operator = input[2]

    if (num1 == null || num2 == null) {
        println("Некорректные числа. Пожалуйста, введите два числа в правильном формате.")
        return
    }

    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 == 0.0) {
                println("Деление на ноль недопустимо.")
                return
            }
            num1 / num2
        }

        else -> {
            println("Некорректный оператор. Пожалуйста, используйте +, -, * или /.")
            return
        }
    }

    println("Результат операции: ${result}")
}


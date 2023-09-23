fun main() {
    println("Программа преобразует введенное натуральное число из 10-ичной системы в двоичную.")
    print("Введите число в 10-ой с/с: ")
    val input = readln()
    val inputIsIntOrNull = input.toIntOrNull()

    if (input.isEmpty() || inputIsIntOrNull == null || inputIsIntOrNull < 0 || inputIsIntOrNull == 0) {
        println("Некорректный ввод. Пожалуйста, введите положительное натуральное число.")
        return
    }
    println("Число $input в двоичной системе: ${input.toBigInteger().toString(2)}")
}

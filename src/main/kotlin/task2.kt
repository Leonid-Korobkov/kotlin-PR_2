fun main() {
    println("Программа подсчитывает количество различных символов во введенной строке")
    print("Введите строку: ")
    val input = readln()

    if (input.isEmpty()) {
        println("Вы ввели пустую строку.")
        return
    }

    val charCounts = mutableMapOf<Char, Int>()

    for (char in input) {
        if (charCounts.containsKey(char)) {
            charCounts[char] = charCounts[char]!! + 1
        } else {
            charCounts[char] = 1
        }
    }

    val sortedChars = charCounts.keys.sorted()

    for (char in sortedChars) {
        val count = charCounts[char]
        println("$char - $count")
    }
}

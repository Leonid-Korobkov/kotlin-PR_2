fun main() {
    fun countRepeatCharacters(text : String): String {
        var newText = ""
        var currentChar = text[0]
        var countChar = 1
        for (i in 1..<text.length) {
            if (text[i] == currentChar) {
                countChar++
            } else {
                newText += if (countChar > 1) "$currentChar$countChar" else currentChar.toString()
                currentChar = text[i]
                countChar = 1
            }
        }
        newText += if (countChar > 1) "$currentChar$countChar" else currentChar.toString()
        return newText
    }

    println("Программа подсчитывает количество подряд идущих одинаковых символов во введенной строке")
    print("Введите строку: ")
    val inputText = readln()

    if (inputText.isEmpty()) {
        println("Вы ввели пустую строку.")
        return
    }

    val resultString = countRepeatCharacters(inputText)
    println("Результат: $resultString")
}

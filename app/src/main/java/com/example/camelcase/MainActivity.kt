package com.example.camelcase

fun main() {
    println(camelCase("cats AND*Dogs-are Awesome"))
    println(camelCase("a b c d-e-f%g"))
    println(camelCase("BOB loves-coding"))
}

private fun camelCase(str: String): String {
    var camelText = str

    str.replace(("[^A-zÀ-ú]").toRegex(), " ").split(" ").forEach { word ->
        camelText = camelText.replace(word, word.lowercase().replaceFirstChar { it.uppercase() })
            .replace(("[^\\w]").toRegex(), "")
            .replaceFirstChar { it.lowercase() }
    }

    return camelText
}
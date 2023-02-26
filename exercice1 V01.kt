// Extension pour vérifier si la chaine est vide ou blanche
fun String. isEmptyOrBlank(): Boolean {
    return this.trim().isEmpty()
}

// Extension pour retourner l'acronym de la chaine
fun String.acronym(): String {
    val words = this.trim().split("\\s+".toRegex())
    val acronym = StringBuilder()
    for (word in words) {
        acronym.append(word.first().toUpperCase())
    }
    return acronym.toString()
}
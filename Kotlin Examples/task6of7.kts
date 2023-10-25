// Bitte den Code in einen eigenen Playground oder in Android Studio Scratch File kopieren. Danke!
//
// Optimieren.... Neuer Code mit wenigen Zeilen sollten genügen :)


class SecureTheIntData(t:Int) {
    var internalDataStore:Int = t
}
class SecureTheStringData(s:String) {
    var internalDataStore:String = s
}

fun main() {
    println("Kotlin Week 6/7 – Generics: Please Improve")
    val secureIntegerDataStore:SecureTheIntData = SecureTheIntData(1)
    val secureStringDataStore:SecureTheStringData = SecureTheStringData("mypassword")

    println(" => $secureIntegerDataStore and $secureStringDataStore")
}
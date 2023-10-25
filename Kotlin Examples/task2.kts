// Bitte den Code in einen eigenen Playground oder in Android Studio Scratch File kopieren. Danke!
// 
// Optimieren.... Neuer Code mit 10-15 Zeilen sollten genügen :)

data class Location(val area:String, val country:String)
data class Photo(val title: String, val location:Location)
fun main() {
    print("Kotlin Week 2/7 – Functional: Please Improve")

    // collection of environment sins:
    val slideshow = listOf<Photo>(
        Photo("Oil Sands",Location("orinoco","Venezuela") ),
        Photo("Polluted Water",Location("ganges","India")),
        Photo("Palm Oil Plantations", Location("??", "Malaysia")),
        Photo("Burning Rainforest",Location("Amazon","??")),
        Photo("Radioactive Waste Dumping",Location("??","Somalia"))
    )
    // TODO: output filtered (by first letter P) sorted (descending) list of (unique) countries
    
    // bad solution: WHY?
    var c = 'Z'
    while (c >= 'A') {
        // print("$c ");
        --c
        for (photo in slideshow) {
            if (photo.location.country.slice(0..0) == c.toString() // crashes, if...?!
                &&
                photo.title[0] == 'P') { // dangerous, if title is ...?!
                println( photo.location.country )
            }
        }
    }
    print("Kotlin Week 2/7 – Functional: Solution 2a Filter title for letter P (keywords: its)")
	print("Kotlin Week 2/7 – Functional: Solution 2b Sort by contry (descending, ignore case)")
    print("Kotlin Week 2/7 – Functional: Solution 2c modify values (keywords: map)")
    print("Kotlin Week 2/7 – Functional: Solution 2d Unique countries (keywords: set, sortedSet)")


}
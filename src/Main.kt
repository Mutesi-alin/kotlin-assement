//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    sentence("Barnie bakes brown bagelsand buns")
    area(56,10)

    val str1 = "aline"
    val str2 = "mutesi"

    println("$str1 is palindrome: ${isPalindrome(str1)}")
    println("$str2 is palindrome: ${isPalindrome(str2)}")




}

fun sentence (word:String){
    var word ="Barnie bakes brown bagelsand buns"
            word.removePrefix("b")
    println(word)


}

fun num  (numbers:Int){
    val statistics= arrayOf(12,34,76,78,90,34,14,23)
    println(statistics(average))
    println(sum().toInt/statistics.size)
    println(statistics.count()
}


fun area(radius:Int,pi:Int){

    var volume= 4/3π r3
    println(volume)

}
fun isPalindrome(word: String): Boolean{



    fun isPalindrome(str: String): Boolean {
        val cleanStr = str.toLowerCase().replace(Regex("[^a-zA-Z0-9]"), "")
        return cleanStr == cleanStr.reversed()


}

















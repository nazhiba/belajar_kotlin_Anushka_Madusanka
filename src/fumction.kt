val buah:List<String> = listOf("Apel", "Semongko", "Sersat")
fun main() {
    penjumlahan(90,44)
    println(pengurangan(12,16))
    nama("Nadzib hibatulloh", 50)

    var umur:Int
    umur = 19
    println(umur)

    val nama = "Nadzib"
    println(nama)

    println("banyaknya buah yang diinputkan hari ini adalah ${buah.size}")
}

fun penjumlahan(x:Int, y:Int){
    println("${x + y}")
}

fun pengurangan(x:Int, y:Int):Int{
    return x-y
}

fun nama(nama:String, umur:Int){
    println("Welcome! $nama dengan umur $umur")
}

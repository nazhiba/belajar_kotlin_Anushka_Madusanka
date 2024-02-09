val buah:MutableList<String> = mutableListOf("Apel", "Semongko", "Sersat")
fun main() {
    penjumlahan(90,44)
    println(pengurangan(12,16))
    nama("Nadzib hibatulloh", 50)
//  Umur
    var umur:Int
    umur = 19
    println(umur)
//  Nama
    val nama = "Nadzib"
    println(nama)
//  banyaknya buah
    println("banyaknya buah yang diinputkan hari ini adalah ${buah.size}")
//  print setiap buah
    buah.forEach{
        i -> println("Ini adalah $i")
    }
//  menambahkan buah
    buah.add("anggur")
    println("banyak buah yang baru ${buah.size}")
    buah.forEach{
        i -> println("Ini adalah $i")
    }
//
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

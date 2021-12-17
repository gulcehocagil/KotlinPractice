package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        processArrayList()
        processIf()
        processMultiTypeList()
        processWhen()
        filter()

        var metin: String = "kelime"
        var sayi: Int = 0
        var doubleSayi: Double = 0.0
        var floatSayi: Float = 0F

        var sayi1 = 5
        var sayi3 = 10

        var toplama = sayi1 + sayi3
        var cikarma = sayi1 - sayi3
        var carpma = sayi1 * sayi3
        var bolme = sayi1 / sayi3

        var name = "Gülçe Hocagil"

        Log.i("String İşelmleri",name.uppercase())
        Log.i("String İşelmleri",name.lowercase())
        Log.i("String İşelmleri",name.plus("derste"))
        Log.i("String İşelmleri",name.get(3).toString())
        Log.i("String İşelmleri",name.substring(6,8))

        var splitName = name.split(" ").toTypedArray()
        Log.i("Split işlemi", splitName.get(0) + "---" + splitName.get(1))
        var nameSplit = splitName.get(0).substring(0,1)
        var surnameSplit = splitName.get(0).substring(0,1)
        Log.i("Liste Adım:",nameSplit + "****")
        Log.i("Liste Soyadım", surnameSplit + "*****")





    }


    fun processIf()
    {
        val dersVarmi: Boolean = false
        if (dersVarmi)
        {
            Log.i("test","deneme")
            Toast.makeText(this, "Ders var", Toast.LENGTH_SHORT).show()
        }
        else
        {
            Log.i("test","deneme")
        }
    }

    fun processWhen()
    {
        var WhenSayi = 0
        when(WhenSayi)
        {
            5->{
                Toast.makeText(this, "Evet Zaim", Toast.LENGTH_SHORT).show()
            }
            6->{
                Toast.makeText(this, "Burası Edu", Toast.LENGTH_SHORT).show()
            }
            else -> {
                Toast.makeText(this, "burası neresi", Toast.LENGTH_SHORT).show()
            }
        }
    }
    fun processArrayList()
    {
        var liste: ArrayList<String> = arrayListOf()
        liste.add("ahmet")
        liste.add("yusuf")
        liste.add("gülçe")

        Log.i("liste ilk eleman",liste.first())
        Log.i("liste son eleman",liste.last())
        Log.i("liste boyut",liste.size.toString())
        Log.i("liste eleman",liste.get(1))

        for (x in 0..2)
        {
            Log.i("liste x",liste.get(x))
        }
        Log.i("liste","foreach ile çözüm")
        liste.forEach {
            Toast.makeText(this, it , Toast.LENGTH_SHORT).show()
        }

    }

    fun processMultiTypeList(){
        var listeSayilar: ArrayList<Int> = arrayListOf()
        for (i in 0..5){
            listeSayilar.add(i)
        }
        var allTypeList: ArrayList<Any> = arrayListOf()
        allTypeList.add("ahmet")
        allTypeList.add(45)
        allTypeList.add(0.0)
    }

    fun filter()
    {
        val cityList: ArrayList<String> = arrayListOf()

        cityList.add("İstanbul")
        cityList.add("Malatya")
        cityList.add("Maraş")
        cityList.add("Antep")
        cityList.add("Malatya")

        val cityTempList : ArrayList<String> = arrayListOf()

        cityList.filter { cityName -> cityName == "Malatya" }.forEach { filterLast ->
            cityTempList.add(filterLast)
        }
        Log.i("Liste size",cityList.filter { cityName-> cityName == "Malatya" }.size.toString())
        cityTempList.forEach {
            Log.i("Liste şehir", it)
        }
    }



}
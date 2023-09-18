package com.example.taskactivityintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.taskactivityintent.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    //DEKLARASI VARIABEL BINDING YG DIGUNAKAN UNTUK MENGIKAT ELEMEN2 TAMPILAN YANG ADA DI LAYOUT ACTIVITY_MAIN
    private lateinit var binding : ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //mengambil data ekstra (extra) dari intent yang memulai aktivitas MainActivity2
        val usn2 = intent.getStringExtra(MainActivity.EXT_USN)
        val email2 = intent.getStringExtra(MainActivity.EXT_EMAIL)
        val phone2 = intent.getStringExtra(MainActivity.EXT_PHONE)

        //blok kode yang digunakan untuk mengakses elemen-elemen tampilan dalam layout activity_main2.xml
        with(binding){
            username.text = usn2
            gmail.text = email2
            phone.text = phone2
        }
    }


}
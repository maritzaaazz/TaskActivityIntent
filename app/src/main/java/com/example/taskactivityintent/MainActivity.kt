package com.example.taskactivityintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.taskactivityintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //DEKLARASI VARIABEL BINDING YG DIGUNAKAN UNTUK MENGIKAT ELEMEN2 TAMPILAN YANG ADA DI LAYOUT ACTIVITY_MAIN
    private lateinit var binding: ActivityMainBinding


    //MENDEFINISIKAN KONSTANTA2 YANG DUGUNAKAN SBG KUNCI SAAT AKAN MENGIRIM DATA ANTAR AKTIVITAS MENGGUNAKAN INTENT
    companion object{
        const val EXT_USN = "ext_usn"
        const val EXT_EMAIL = "ext_email"
        const val EXT_PHONE = "ext_phone"
        const val EXT_PASS = "ext_pass"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //menginisialisasi variabel binding. Metode inflate digunakan untuk menghubungkan layout XML activity_main.xml dengan kode Kotlin, sehingga dapat mengakses elemen-elemen tampilan yang ada di dalamnya.
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            //inisialisasi handler klik untuk tombol dengan ID registerBtn
            registerBtn.setOnClickListener{
                val intentSec = Intent(this@MainActivity, MainActivity2::class.java)
                intentSec.putExtra(EXT_USN, username.text.toString().trim())
                intentSec.putExtra(EXT_EMAIL, email.text.toString().trim())
                intentSec.putExtra(EXT_PHONE, phone.text.toString().trim())
                intentSec.putExtra(EXT_PASS, password.text.toString().trim())
                startActivity(intentSec)
            }

            //inisialisasi handler klik untuk elemen dengan ID login
            login.setOnClickListener {
                val  intentThird = Intent(this@MainActivity, MainActivity3::class.java)
                startActivity(intentThird)
            }
        }
    }
}
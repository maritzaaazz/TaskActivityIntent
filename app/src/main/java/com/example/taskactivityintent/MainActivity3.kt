package com.example.taskactivityintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.taskactivityintent.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    ////DEKLARASI VARIABEL BINDING YG DIGUNAKAN UNTUK MENGIKAT ELEMEN2 TAMPILAN YANG ADA DI LAYOUT ACTIVITY_MAIN
    private lateinit var binding: ActivityMain3Binding
    companion object{
        const val EXT_USN = "ext_usn"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            loginBtn.setOnClickListener{
                val intentfirst = Intent(this@MainActivity3, MainActivity4::class.java)
                intentfirst.putExtra(MainActivity.EXT_USN, username.text.toString().trim())
                //mengarahkan aplikasi untuk memulai aktivitas MainActivity4, sehingga pengguna akan berpindah ke halaman tersebut ketika elemen loginBtn   diklik.
                startActivity(intentfirst)
            }

            register2.setOnClickListener {
                val intentsec = Intent(this@MainActivity3, MainActivity::class.java)
                //mengarahkan aplikasi untuk memulai aktivitas MainActivity, sehingga pengguna akan berpindah ke halaman tersebut ketika elemen register2 diklik.
                startActivity(intentsec)
            }
        }
    }
}
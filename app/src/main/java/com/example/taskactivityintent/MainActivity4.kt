package com.example.taskactivityintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.taskactivityintent.databinding.ActivityMain2Binding
import com.example.taskactivityintent.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    private lateinit var binding : ActivityMain4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val usn2 = intent.getStringExtra(MainActivity3.EXT_USN)

        with(binding){
            username.text = usn2
        }
    }
}
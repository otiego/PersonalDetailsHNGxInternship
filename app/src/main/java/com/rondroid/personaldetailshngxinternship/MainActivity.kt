package com.rondroid.personaldetailshngxinternship

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rondroid.personaldetailshngxinternship.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGitHubURL.setOnClickListener {
            val intent =  Intent(applicationContext, WebViewActivity::class.java)
            startActivity(intent)
        }
    }
}
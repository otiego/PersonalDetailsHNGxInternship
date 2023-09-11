package com.rondroid.personaldetailshngxinternship

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import com.rondroid.personaldetailshngxinternship.databinding.ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWebViewBinding
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        webViewSetUp()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(){
        binding.webView.webViewClient = WebViewClient()
        binding.webView.apply {
            loadUrl("https://developer.android.com/studio/login.html?success=true")
            settings.javaScriptEnabled  = true
            settings.safeBrowsingEnabled = true
        }
        }
    }

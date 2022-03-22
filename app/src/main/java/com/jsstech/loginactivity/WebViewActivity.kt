package com.jsstech.loginactivity

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class WebViewActivity :AppCompatActivity() {
    lateinit var webView:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)
        initView()
    }

    private fun initView() {
        webView=findViewById(R.id.webView)
        webView.loadUrl("https://www.javatpoint.com/kotlin-variable")

    }
}
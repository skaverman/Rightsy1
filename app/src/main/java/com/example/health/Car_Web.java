package com.example.health;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;

import android.webkit.WebSettings;
import android.webkit.WebView;


public class Car_Web extends AppCompatActivity {

           private WebView webView;
        @SuppressLint("MissingInflatedId")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_order_details);
            webView = findViewById(R.id.CarWeb);


        // Enable JavaScript (optional)
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webSettings.setDomStorageEnabled(true); // Enable DOM Storage

            // Load Unity game HTML file (assuming the Unity game is exported to HTML5)
            webView.loadUrl("https://exodus007.itch.io/cargame2d/");
    }

    // Handle back button press to navigate back in WebView
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}


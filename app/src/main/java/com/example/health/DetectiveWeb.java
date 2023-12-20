package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.webkit.WebSettings;
import android.webkit.WebView;

;



public class DetectiveWeb extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);
        webView = findViewById(R.id.brainOut);

        // Enable JavaScript (optional)
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://anish1279.github.io/memory-game-v2/");
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
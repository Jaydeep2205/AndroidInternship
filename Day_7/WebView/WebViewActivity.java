package com.example.view;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class WebViewActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etSearch;
    Button btnGo;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        etSearch=(EditText) findViewById(R.id.etSearch);
        btnGo=(Button) findViewById(R.id.btnGo);
        webView=(WebView) findViewById(R.id.webView);
        btnGo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if (v.getId() == R.id.btnGo) {
            String url = etSearch.getText().toString();

            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new MyWebViewClient());
            webView.loadUrl(url);
        }

    }
    private static class MyWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}

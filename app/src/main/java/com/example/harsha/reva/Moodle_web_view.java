package com.example.harsha.reva;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Moodle_web_view extends AppCompatActivity {
    private WebView webview;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moodle_web_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String url = "https://moodle.reva.edu.in";

        webview = (WebView) findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient() {

                                     @Override public void onPageStarted(WebView view, String url, Bitmap favicon) {
                                         super.onPageStarted(view, url, favicon);
                                     }

            public void onLoadResource (WebView view, String url) {

                if (progressDialog == null) {
                    progressDialog = new ProgressDialog(Moodle_web_view.this);
                    progressDialog.setMessage("Getting Into Moodle");
                    progressDialog.show();
                }
            }

            public void onPageFinished(WebView view, String url) {
                try{
                    if (progressDialog.isShowing()) {
                        progressDialog.dismiss();

                    }

                }catch(Exception exception){
                    exception.printStackTrace();
                }
            }

        });

        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl(url);
    }




    public void moodle_button(View view){
        Intent q = new Intent(this,Home_activity.class);
        startActivity(q);
        finish();

    }

    @Override
    public void onBackPressed() {
        if (webview.canGoBack()) {
            webview.goBack();

        } else {
            super.onBackPressed();
            finish();

        }

    }

}


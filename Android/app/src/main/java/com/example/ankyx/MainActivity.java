package com.example.ankyx;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.AlarmClock;
import android.view.Menu;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.ankyx.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
    private WebView view;
    private ValueCallback<Uri[]> vc;
    private Intent data;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);


        // start WebView
        view = findViewById(R.id.webview);
        view.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {

                Intent fileChooserIntent = fileChooserParams.createIntent();
                startActivityForResult(fileChooserIntent, 1122);
                vc = filePathCallback;

                return true;

            }
        });
        view.getSettings().setAllowFileAccess(true);
        view.getSettings().setAllowFileAccessFromFileURLs(true);
        view.getSettings().setJavaScriptEnabled(true);

        view.addJavascriptInterface(this, "Android");

        Map<String, String> header = new HashMap<>();
        header.put("Access-Control-Allow-Origin", "*");      //todo: check in necessearx

        view.loadUrl("file:///android_asset/index.html", header);
    }





    @JavascriptInterface
    public void postToNative(String message) {
        // To smth

    }

    public void postToUniversal(String jsCode) {
        new Handler(Looper.getMainLooper()).post(() -> {
            view.evaluateJavascript(jsCode, null);
        });
    }

}
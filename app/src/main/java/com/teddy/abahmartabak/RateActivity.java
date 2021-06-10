package com.teddy.abahmartabak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class  RateActivity extends AppCompatActivity {

    //Memanggil Variabel Widget Drawer supaya bisa dicoding
    //Inisialiasi Variabel
    DrawerLayout drawerLayout;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);

        //buka webnya
        webView = (WebView) findViewById(R.id.rate_webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://kuliner.yuk-kunjungi.com/abahmartabak/rate/");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //assign variabelnya
        drawerLayout = findViewById(R.id.drawer_layout);

    }

    public void ClickMenu(View view){
        //Open drawer
        MainActivity.openDrawer (drawerLayout);
    }

    public void ClickLogo(View view){
        //Close Drawernya
        MainActivity.closeDrawer(drawerLayout);
    }

    public void ClickHome(View view){
        //Redirect activity ke Beranda
        MainActivity.redirectActivity(this,MainActivity.class);
    }

    public void ClickMenuAbah (View view){
        //Redirect activity ke Menu Abah Martabak
        MainActivity.redirectActivity(this,MenuActivity.class);
    }

    public void ClickPromo (View view){
        //Redirect activity ke Promo
        MainActivity.redirectActivity(this,PromoActivity.class);
    }

    public void ClickLokasi (View view){
        //Redirect activity ke Lokasi
        MainActivity.redirectActivity(this,AlamatActivity.class);
    }

    public void ClickTestimoni (View view){
        //Redirect activity ke Testimoni
        MainActivity.redirectActivity(this,KataMerekaActivity.class);
    }

    public void ClickOwner (View view){
        //Redirect activity ke Owner
        MainActivity.redirectActivity(this,OwnerActivity.class);
    }

    public void ClickKontak (View view){
        //Redirect activity ke Kontak Kami
        MainActivity.redirectActivity(this,KontakActivity.class);
    }

    public void ClickTentang (View view){
        //Redirect activity ke Tentang Aplikasi
        MainActivity.redirectActivity(this,TentangActivity.class);
    }

    public void ClickRate (View view){
        //Recreate activity
        recreate();
    }

    public void ClickLogout (View view){
        //Menutup Aplikasi
        MainActivity.logout(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Close Drawer
        MainActivity.closeDrawer(drawerLayout);
    }

}
package com.example.helloworld;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.helloworld.recycleview.CategoryActivity;
import com.example.helloworld.recycleview.HistoryActivity;
import com.example.helloworld.recycleview.PlacesActivity;
import com.example.helloworld.recycleview.UserfullNameActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        router();
    }

    void router(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sharedPreferences = getSharedPreferences("dekko",MODE_PRIVATE);

                // lay du lieu trog file
                boolean isLogin = sharedPreferences.getBoolean("isLogin",false);
                if(isLogin){
                    Intent intent = new Intent(SplashActivity.this, CategoryActivity.class);
                    startActivity(intent);
                    finish();
                }else {
                    /*Intent intent = new Intent(SplashActivity.this,LoginActivity.class);
                    startActivity(intent);
                    finish();*/
                }
            }
        },1000);
    }
}

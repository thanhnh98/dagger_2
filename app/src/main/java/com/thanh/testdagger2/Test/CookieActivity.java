package com.thanh.testdagger2.Test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.thanh.testdagger2.R;

import javax.inject.Inject;

public class CookieActivity extends AppCompatActivity {
    @Inject Cookie cookie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cookie);
        CookieComponent cookieComponent=DaggerCookieComponent.create();
        cookieComponent.inject(this);
        cookie.finish();//đã sử dụng được cookie
    }
}

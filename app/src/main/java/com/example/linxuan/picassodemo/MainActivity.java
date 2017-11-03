package com.example.linxuan.picassodemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView targetImageView = (ImageView) findViewById(R.id.imageView);
        int resourceId = R.mipmap.ic_launcher;
        String internetUrl = "http://img.my.csdn.net/uploads/201407/26/1406383243_5120.jpg";
        Picasso.with(MainActivity.this)
                .load(internetUrl)
                .into(targetImageView);
    }
}

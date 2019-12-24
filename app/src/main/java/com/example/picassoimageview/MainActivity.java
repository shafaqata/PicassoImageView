package com.example.picassoimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView=findViewById(R.id.ImageView);
        String url="https://pixabay.com/get/55e0d340485aa814f6da8c7dda79367a103cdfe251516c4870287ddd934bc15bbf_1280.jpg ";

        Picasso.get().load(url).placeholder(R.drawable.ic_launcher_background).into(imageView);
    }
}

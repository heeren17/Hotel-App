package com.fahmidwipamane202102364.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 =(ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://images.oyoroomscdn.com/uploads/hotel_image/58462/7d47140dbbf7a674.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}
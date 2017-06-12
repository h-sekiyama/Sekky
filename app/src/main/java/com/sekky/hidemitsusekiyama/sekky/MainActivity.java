package com.sekky.hidemitsusekiyama.sekky;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import com.sekky.hidemitsusekiyama.sekky.CircleImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = (ImageView)findViewById(R.id.circle_image);
        imageView1.setImageResource(R.drawable.arisa003);
    }

}

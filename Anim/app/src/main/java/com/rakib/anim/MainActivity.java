package com.rakib.anim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    Button button;
    ImageView imageView;
    Animation updown,zoomin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        imageView=findViewById(R.id.imageView);
        updown=AnimationUtils.loadAnimation(MainActivity.this,R.anim.up_down_cont);
        zoomin=AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoom_in);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              imageView.startAnimation(updown);
                imageView.startAnimation(zoomin);

            }
        });





    }
}
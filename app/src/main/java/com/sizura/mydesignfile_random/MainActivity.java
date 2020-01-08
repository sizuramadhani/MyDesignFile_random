package com.sizura.mydesignfile_random;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView imgcloud1,imgcloud2,imgcloud3,imgcar;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        imgcloud1 = findViewById(R.id.);
//        imgcloud2 = findViewById(R.id.imgcloud2);
//        imgcloud3 = findViewById(R.id.imgcloud3);
//        imgcar = findViewById(R.id.car);

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.push_right);
        imgcloud2.setAnimation(animation);

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.push_down);
        imgcloud3.setAnimation(animation);

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.push_right);
        imgcar.setAnimation(animation);

        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(4000);
                    Intent intent = new Intent(getApplicationContext(),BoardingScreen.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                super.run();
            }
        };
        thread.start();
    }
    }


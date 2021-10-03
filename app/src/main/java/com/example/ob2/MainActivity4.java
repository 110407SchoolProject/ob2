package com.example.ob2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
    Animation smalltobig, nothingtocome, btnanimation;
    ImageView imageView;
    TextView textView2,textView3;
    Button btncontinue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        smalltobig = AnimationUtils.loadAnimation(this,R.anim.smalltobig);
        nothingtocome = AnimationUtils.loadAnimation(this,R.anim.nothingtocome);
        btnanimation = AnimationUtils.loadAnimation(this,R.anim.btnanimation);


        imageView = (ImageView) findViewById(R.id.imageView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        btncontinue = (Button) findViewById(R.id.btncontinue);

        imageView.startAnimation(smalltobig);
        textView2.startAnimation(nothingtocome);
        textView3.startAnimation(nothingtocome);
        btncontinue.startAnimation(btnanimation);


        btncontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent (MainActivity4.this,MainActivity5.class);
                b.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(b);
            }
        });
    }
}
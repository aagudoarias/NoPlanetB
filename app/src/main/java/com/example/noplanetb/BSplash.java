package com.example.noplanetb;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class BSplash extends AppCompatActivity implements Animation.AnimationListener {


    TextView tv_splash,tv_splash2;

    ImageView iv_splash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsplash);
        getSupportActionBar().hide();

        tv_splash = (TextView) findViewById(R.id.tv_splash);
        tv_splash2 = (TextView) findViewById(R.id.tv_splash2);
        iv_splash = (ImageView) findViewById(R.id.iv_splash);


        Typeface myFont = Typeface.createFromAsset(getAssets(), "bromello.otf");
        tv_splash.setTypeface(myFont);

        Animation escalar = AnimationUtils.loadAnimation(this, R.anim.escalar);
        Animation caida = AnimationUtils.loadAnimation(this, R.anim.caida);
        tv_splash.startAnimation(escalar);
        tv_splash2.startAnimation(escalar);
        iv_splash.startAnimation(caida);


        escalar.setAnimationListener(this);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent intent = new Intent(getApplicationContext(), BLogin.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
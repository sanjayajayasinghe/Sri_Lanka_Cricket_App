package com.example.srilankacricketappv1;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class LoadingActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_loading);
        intent = getIntent();
        final TextView loading = findViewById(R.id.loadingtext);
        final ImageView imageView = findViewById(R.id.imageViewLoading);
        final Animation animation_1 = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate);
        final Animation animation_2 = AnimationUtils.loadAnimation(getBaseContext(), R.anim.antirotate);
        final Animation animation_3 = AnimationUtils.loadAnimation(getBaseContext(), R.anim.fade_in);
        final Animation animation_4 = AnimationUtils.loadAnimation(getBaseContext(), R.anim.fade_out);
        imageView.startAnimation(animation_1);
        loading.startAnimation(animation_3);
        animation_3.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.startAnimation(animation_1);
                loading.startAnimation(animation_4);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        animation_1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.startAnimation(animation_1);
                finish();
                Intent i = new Intent(getBaseContext(), MainActivity.class);
                if (intent.hasExtra("Twitter")) {
                    i.putExtra("Twitter", "Twitter");
                } else if (intent.hasExtra("Facebook")) {
                    i.putExtra("Facebook", "Facebook");
                }
                startActivity(i);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }


}
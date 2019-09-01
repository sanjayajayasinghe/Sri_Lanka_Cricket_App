package com.example.srilankacricketappv1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import fragment.FaceBookFragment;

/**
 * Created by navneet on 12/11/16.
 */

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_loading);
        //getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FaceBookFragment()).commit();

        final ImageView imageView = (ImageView) findViewById(R.id.imageViewLoading);
        final Animation animation_1 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotate);
        final Animation animation_2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotate);
        final Animation animation_3 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.abc_fade_out);

        imageView.startAnimation(animation_2);
        animation_2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.startAnimation(animation_1);
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
                imageView.startAnimation(animation_3);
                finish();
                Intent i = new Intent(getBaseContext(),MainActivity.class);
                i.putExtra("message", "Facebook");
                startActivity(i);
                //startActivityForResult(i, 1);
                //this.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FaceBookFragment()).commit();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }


}
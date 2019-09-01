package com.example.srilankacricketappv1;


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;



public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIMEOUT=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final ImageView imageView = (ImageView) findViewById(R.id.splashlogo);
        final Animation animation_2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.fade_in);
        imageView.startAnimation(animation_2);


        if(isNetworkConnected()){
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent splash =new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(splash);
                    finish();
                }
            },SPLASH_TIMEOUT);
        }else{
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setMessage("Please connect to the internet and try again...");
            builder1.setTitle("No Connection");
            builder1.setCancelable(true);

//            builder1.setPositiveButton(
//                    "Try Again",
//                    new DialogInterface.OnClickListener() {
//                        public void onClick(DialogInterface dialog, int id) {
//                            Toast.makeText(getBaseContext(),"Restart Application",Toast.LENGTH_SHORT).show();
//                        }
//                    });

            builder1.setNegativeButton(
                    "Exit",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            android.os.Process.killProcess(android.os.Process.myPid());
                            System.exit(1);
                        }
                    });

            AlertDialog alert11 = builder1.create();
            alert11.show();
        }


    }
    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }
}

package com.example.cricify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class HomeMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        setContentView(R.layout.activity_homepage);



    }
    public void btnStartMatch(View view)
    {
        Intent StartMatchintent=new Intent(this,Startmatch.class);
        startActivity(StartMatchintent);
    }

    public void btnMatchCode(View view)
    {
        Intent matchcodeintent=new Intent(this, MatchCode.class);
        startActivity(matchcodeintent);
    }
    public void btnHistory(View view)
    {
        Intent historyintent=new Intent(this, History.class);
        startActivity(historyintent);
    }
    public void btnLiveMatches(View view)
    {
        Toast.makeText(getApplicationContext(), "Feature Coming Soon...", Toast.LENGTH_LONG).show();
        //Intent liveintent=new Intent(this,LiveMatches.class);
        //startActivity(liveintent);
    }
}


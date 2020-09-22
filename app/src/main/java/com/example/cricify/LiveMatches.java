package com.example.cricify;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.util.zip.Inflater;

public class LiveMatches extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_matches);


    }

    public void btnNewMatches(View view)
    {
        Intent NewMatchesIntent=new Intent(this,NewMatches.class);
        startActivity(NewMatchesIntent);
    }
    public void btnOldMatches(View view)
    {
        Intent OldMatchesIntent=new Intent(this,OldMatches.class);
        startActivity(OldMatchesIntent);
    }
}

package com.example.cricify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

public class MatchCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_matchcode);

    }

    public void btnSubmit(View view) {
        EditText mcode=(EditText) findViewById(R.id.evMatchCodeM);
        Intent Submitintent = new Intent(this, UserPageScore.class);
        Submitintent.putExtra("MC",mcode.getText().toString());
        startActivity(Submitintent);
    }
}
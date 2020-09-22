package com.example.cricify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RadioButton;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Startmatch extends AppCompatActivity {
    static int toss=1;
    static int opted=1;
    static String bat="BAT";
    static String bowl="BOWL";

    DatabaseReference myref= FirebaseDatabase.getInstance().getReference().child("Scorify");
    RealDatabase rd =new RealDatabase();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_startmatch);


    }
    public void btnContinue(View view)
    {

        EditText eT_HostTeam=(EditText) findViewById(R.id.eTHostTeamS);
        EditText eT_vistorTeam=(EditText) findViewById(R.id.eTVistorTeamS);
        EditText eT_Overs=(EditText) findViewById(R.id.eTOversS);
        EditText evmc=(EditText) findViewById(R.id.eTMatchCodeS);
        Intent adminintent=new Intent(this,Playername.class);

        String t=Integer.toString(toss);
        String to=Integer.toString(opted);
        if(toss==1&&opted==1 || toss==0&&opted==0)
        {
            adminintent.putExtra("HT", eT_HostTeam.getText().toString());
            adminintent.putExtra("VT", eT_vistorTeam.getText().toString());

        }
        else if(toss==1&&opted==0 || toss==0&&opted==1)
        {
            adminintent.putExtra("HT", eT_vistorTeam.getText().toString());
            adminintent.putExtra("VT", eT_HostTeam.getText().toString());
        }


        if(toss==1&&opted==1)
        {
            adminintent.putExtra("TOSS", eT_HostTeam.getText().toString());
            adminintent.putExtra("OPT",bat);
        }
        else if(toss==1&&opted==0)
        {
            adminintent.putExtra("TOSS", eT_HostTeam.getText().toString());
            adminintent.putExtra("OPT",bat);
        }
        else if( toss==0&&opted==1)
        {
            adminintent.putExtra("TOSS", eT_vistorTeam.getText().toString());
            adminintent.putExtra("OPT",bowl);
        }
        else if(toss==0&&opted==0)
        {
            adminintent.putExtra("TOSS", eT_vistorTeam.getText().toString());
            adminintent.putExtra("OPT",bowl);
        }

        adminintent.putExtra("O", eT_Overs.getText().toString());
        adminintent.putExtra("T", t);
        adminintent.putExtra("TO", to);
        adminintent.putExtra("MC",evmc.getText().toString());
        startActivity(adminintent);

    }
    public void onRadioButtonClicked(View view)
    {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.rBtnHostTeam:
                if (checked)
                    // Pirates are the best
                    toss = 1;
                break;
            case R.id.rBtnVistorTeam:
                if (checked)
                    // Ninjas rule
                    toss = 0;
                break;
        }

    }
    public void onRadioButtonClicked1(View view)
    {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.rBtnBat:
                if (checked)
                    // Pirates are the best
                    opted = 1;
                break;
            case R.id.rBtnBowl:
                if (checked)
                    // Ninjas rule
                    opted= 0;
                break;
        }

    }


}

package com.example.cricify;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UserPageScore extends AppCompatActivity {

    DatabaseReference myref;
    private String Teamname;
    private String Batsmenname1;
    private String Batsmenname2;
    private String Bowlername;
    private String ThisOver1;
    private String ThisOver2;
    private String ThisOver3;
    private String ThisOver4;
    private String ThisOver5;
    private String ThisOver6;
    private String ThisOver7;
    private String ThisOver8;
    private String ThisOver9;
    private String run;
    private String over;
    private String wicket;
    private String crr;
    private String batFRun;
    private String batSRun;
    private String batFBall;
    private String batSBall;
    private String batFSix;
    private String batSSix;
    private String batFFour;
    private String batSFour;
    private String batFSR;
    private String batSSR;
    private String bowlrun;
    private String bowlwicket;
    private String bowlmaiden;
    private String bowlover;
    private String bowlER;
    private String strike;
    private String nstrike;
    private String pshipr;
    private String pshipb;
    private String inning;
    private String toss;
    private String opted;
    private String matchcode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_userpage);

        Intent i=getIntent();
        matchcode=i.getStringExtra("MC");
        myref= FirebaseDatabase.getInstance().getReference().child("Scorify").child(matchcode);

        final TextView teamname=(TextView) findViewById(R.id.Team1U);
        final TextView teamRun=(TextView) findViewById(R.id.TeamrunU);
        final TextView teamWickets=(TextView) findViewById(R.id.TeamwicketU);
        final TextView teamOvers=(TextView) findViewById(R.id.TeamoversU);
        final TextView teamCRR=(TextView) findViewById(R.id.TeamCRRU);
        final TextView tVInning=(TextView) findViewById(R.id.tVinningU);
        final TextView UFBatnm1=(TextView) findViewById(R.id.tVBatsmenName1U);
        final TextView UFBatrun=(TextView) findViewById(R.id.UFBatrun);
        final TextView UFBatball=(TextView) findViewById(R.id.UFBatball);
        final TextView UFBatfour=(TextView) findViewById(R.id.UFBatfour);
        final TextView UFBatsix=(TextView) findViewById(R.id.UFBatsix);
        final TextView UFBatSR=(TextView) findViewById(R.id.UFBatSR);
        final TextView USBatnm2=(TextView) findViewById(R.id.tVBatsmenName2U);
        final TextView USBatrun=(TextView) findViewById(R.id.USBatrun);
        final TextView USBatball=(TextView) findViewById(R.id.USBatball);
        final TextView USBatfour=(TextView) findViewById(R.id.USBatfour);
        final TextView USBatsix=(TextView) findViewById(R.id.USBatsix);
        final TextView USBatSR=(TextView) findViewById(R.id.USBatSR);
        final TextView tVBowlnm=(TextView) findViewById(R.id.tVBowlerNameU);
        final TextView tVBowlOvers=(TextView) findViewById(R.id.UFbowlover);
        final TextView tVBowlRun=(TextView) findViewById(R.id.UFbowlrun);
        final TextView tVBowlER=(TextView) findViewById(R.id.UFbowlER);
        final TextView tVBowlWicket=(TextView) findViewById(R.id.UFbowlwicket);
        final TextView tVBowlMaiden=(TextView) findViewById(R.id.UFbowlmaiden);
        final TextView tVpshipr=(TextView) findViewById(R.id.tvPartnershipRU);
        final TextView tVpshipb=(TextView) findViewById(R.id.tvpartnershipBU);
        final TextView UStrike=(TextView) findViewById(R.id.UStrike);
        final TextView UNStrike=(TextView) findViewById(R.id.UNStrike);
        final TextView tVThisOver1=(TextView) findViewById(R.id.UTO1);
        final TextView tVThisOver2=(TextView) findViewById(R.id.UTO2);
        final TextView tVThisOver3=(TextView) findViewById(R.id.UTO3);
        final TextView tVThisOver4=(TextView) findViewById(R.id.UTO4);
        final TextView tVThisOver5=(TextView) findViewById(R.id.UTO5);
        final TextView tVThisOver6=(TextView) findViewById(R.id.UTO6);
        final TextView tVThisOver7=(TextView) findViewById(R.id.UTO7);
        final TextView tVThisOver8=(TextView) findViewById(R.id.UTO8);
        final TextView tVThisOver9=(TextView) findViewById(R.id.UTO9);
        final TextView tToss=(TextView) findViewById(R.id.teamTossU);
        final TextView topted=(TextView) findViewById(R.id.ToptedU);


        myref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                run=dataSnapshot.child("run").getValue().toString();
                wicket=dataSnapshot.child("wicket").getValue().toString();
                over=dataSnapshot.child("over").getValue().toString();
                crr=dataSnapshot.child("crr").getValue().toString();
                batFRun=dataSnapshot.child("batFRun").getValue().toString();
                batFBall=dataSnapshot.child("batFBall").getValue().toString();
                batFFour=dataSnapshot.child("batFFour").getValue().toString();
                batFSix=dataSnapshot.child("batFSix").getValue().toString();
                batFSR=dataSnapshot.child("batFSR").getValue().toString();
                batSRun=dataSnapshot.child("batSRun").getValue().toString();
                batSBall=dataSnapshot.child("batSBall").getValue().toString();
                batSFour=dataSnapshot.child("batSFour").getValue().toString();
                batSSix=dataSnapshot.child("batSSix").getValue().toString();
                batSSR=dataSnapshot.child("batSSR").getValue().toString();
                inning=dataSnapshot.child("inning").getValue().toString();
                strike=dataSnapshot.child("strike").getValue().toString();
                nstrike=dataSnapshot.child("nstrike").getValue().toString();
                pshipr=dataSnapshot.child("pshipr").getValue().toString();
                pshipb=dataSnapshot.child("pshipb").getValue().toString();
                bowlover=dataSnapshot.child("bowlover").getValue().toString();
                bowlrun=dataSnapshot.child("bowlrun").getValue().toString();
                bowlwicket=dataSnapshot.child("bowlwicket").getValue().toString();
                bowlmaiden=dataSnapshot.child("bowlmaiden").getValue().toString();
                bowlER=dataSnapshot.child("bowlER").getValue().toString();
                ThisOver1=dataSnapshot.child("thisOver1").getValue().toString();
                ThisOver2=dataSnapshot.child("thisOver2").getValue().toString();
                ThisOver3=dataSnapshot.child("thisOver3").getValue().toString();
                ThisOver4=dataSnapshot.child("thisOver4").getValue().toString();
                ThisOver5=dataSnapshot.child("thisOver5").getValue().toString();
                ThisOver6=dataSnapshot.child("thisOver6").getValue().toString();
                ThisOver7=dataSnapshot.child("thisOver7").getValue().toString();
                ThisOver8=dataSnapshot.child("thisOver8").getValue().toString();
                ThisOver9=dataSnapshot.child("thisOver9").getValue().toString();
                Teamname=dataSnapshot.child("teamname").getValue().toString();
                Batsmenname1=dataSnapshot.child("batsmenname1").getValue().toString();
                Batsmenname2=dataSnapshot.child("batsmenname2").getValue().toString();
                Bowlername=dataSnapshot.child("bowlername").getValue().toString();
                toss=dataSnapshot.child("toss").getValue().toString();
                opted=dataSnapshot.child("opted").getValue().toString();

                teamRun.setText(run);
                teamOvers.setText(over);
                teamWickets.setText(wicket);
                teamCRR.setText(crr);
                UFBatrun.setText(batFRun);
                UFBatball.setText(batFBall);
                UFBatsix.setText(batFSix);
                UFBatfour.setText(batFFour);
                UFBatSR.setText(batFSR);
                USBatrun.setText(batSRun);
                USBatball.setText(batSBall);
                USBatsix.setText(batSSix);
                USBatfour.setText(batSFour);
                USBatSR.setText(batSSR);
                tVInning.setText(inning);
                UStrike.setText(strike);
                UNStrike.setText(nstrike);
                tVpshipr.setText(pshipr);
                tVpshipb.setText(pshipb);
                tVBowlOvers.setText(bowlover);
                tVBowlRun.setText(bowlrun);
                tVBowlWicket.setText(bowlwicket);
                tVBowlMaiden.setText(bowlmaiden);
                tVBowlER.setText(bowlER);
                tVThisOver1.setText(ThisOver1);
                tVThisOver2.setText(ThisOver2);
                tVThisOver3.setText(ThisOver3);
                tVThisOver4.setText(ThisOver4);
                tVThisOver5.setText(ThisOver5);
                tVThisOver6.setText(ThisOver6);
                tVThisOver7.setText(ThisOver7);
                tVThisOver8.setText(ThisOver8);
                tVThisOver9.setText(ThisOver9);
                teamname.setText(Teamname);
                UFBatnm1.setText(Batsmenname1);
                USBatnm2.setText(Batsmenname2);
                tVBowlnm.setText(Bowlername);
                tToss.setText(toss);
                topted.setText(opted);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}

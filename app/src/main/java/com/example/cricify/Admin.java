package com.example.cricify;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Admin extends AppCompatActivity
{
    static int run = 0;
    static double over1 = 0;
    static double ball = 0;
    static int ballT = 0;
    static double over = 0;
    static int   wicket=0;
    static double crr=0;
    static int batFRun = 0;
    static int batSRun = 0;
    static int batFBall = 0;
    static int batSBall = 0;
    static int batFSix = 0;
    static int batSSix = 0;
    static int batFFour = 0;
    static int batSFour = 0;
    static double batFSR = 0;
    static double batSSR = 0;
    static int bowlrun =0;
    static int bowlwicket =0;
    static int bowlmaiden =0;
    static double bowlover1 = 0;
    static double bowlball = 0;
    static int bowlballT = 0;
    static double bowlover = 0;
    static double bowlER=0;
    static String strike ="*";
    static String nstrike =" ";
    static boolean flag;
    static int pshipr=0;
    static int pshipb=0;
    static  int count;
    static int countDotb=0;
    static int one;
    static String ones;
    static String onebyes;
    static int inning=1;
    static String hostname1;
    static String vistorname1;
    static String inputOver2;
    static double inputOver;
    static String h1;
    static String h2;
    static String h3;
    static String h4;
    static String h5;
    static String h6;
    static String h7;
    static String h8;
    static String h9;
    static String h10;
    static String h11;
    static String v1;
    static String v2;
    static String v3;
    static String v4;
    static String v5;
    static String v6;
    static String v7;
    static String v8;
    static String v9;
    static String v10;
    static String v11;
    static String toss;
    static String opted;
    static String matchcode;
    static int nextbat;
    static int temp;

    static int[] HBatrun=new int[11];
    static int[] HBatbowl=new int[11];
    static int[] HBatsix=new int[11];
    static int[] HBatfour=new int[11];
    static double[] HBatSR=new double[11];
    static int[] HBowlrun=new int[11];
    static int[] HBowlWickets=new int[11];
    static int[] HBowlmaidens=new int[11];
    static double[] HBowlovers=new double[11];
    static double[] HBowlER=new double[11];
    static int[] VBatrun=new int[11];
    static int[] VBatbowl=new int[11];
    static int[] VBatsix=new int[11];
    static int[] VBatfour=new int[11];
    static double[] VBatSR=new double[11];
    static int[] VBowlrun=new int[11];
    static int[] VBowlWickets=new int[11];
    static int[] VBowlmaidens=new int[11];
    static double[] VBowlovers=new double[11];
    static double[] VBowlER=new double[11];
    static int strikex=0;
    static int strikey=1;
    static int strikez=10;
    static int strikez2=10;
    static int u;
    
     TextView tV_Run ;
     TextView tV_Over ;
     TextView tV_Crr ;
     TextView tV_wicket ;
     TextView tV_FBatRun;
     TextView tV_SBatRun ;
     TextView tV_FBatBall ;
     TextView tV_SBatBall;
     TextView tV_FBatSR;
     TextView tV_SBatSR ;
     TextView tV_BowlOvers ;
     TextView tV_BowlMaiden ;
     TextView tV_bowlrun ;
     TextView tV_BowlWicket ;
     TextView tV_BowlER ;
     TextView tV_FBatFour ;
     TextView tV_SBatFour;
     TextView tV_FBatSix ;
     TextView tV_SBatSix ;
     TextView tV_Pshipr;
     TextView tV_Pshipb;
     TextView tV_ThisOver1;
     TextView tV_ThisOver2;
     TextView tV_ThisOver3;
     TextView tV_ThisOver4;
     TextView tV_ThisOver5;
     TextView tV_ThisOver6;
     TextView tV_ThisOver7;
     TextView tV_ThisOver8;
     TextView tV_ThisOver9;
     TextView tV_Inning;
     TextView tV_Teamname;
     EditText eT_Byes;
     TextView tV_FBatStrike;
     TextView tV_SBatStrike;
     TextView tV_FBatNm;
     TextView tV_SBatNm;
     TextView tV_bowlnm;
     Intent i;
     DatabaseReference myref;
     RealDatabase rd=new RealDatabase();

    ArrayList<Integer> AHBatrun = new ArrayList<Integer>(11);
    ArrayList<Integer> AHBatbowl = new ArrayList<Integer>(11);
    ArrayList<Integer> AHBatsix = new ArrayList<Integer>(11);
    ArrayList<Integer> AHBatfour = new ArrayList<Integer>(11);
    ArrayList<Double> AHBatSR = new ArrayList<Double>(11);
    ArrayList<Integer> AHBowlrun= new ArrayList<Integer>(11);
    ArrayList<Integer> AHBowlWickets = new ArrayList<Integer>(11);
    ArrayList<Integer> AHBowlmaidens = new ArrayList<Integer>(11);
    ArrayList<Double> AHBowlovers = new ArrayList<Double>(11);
    ArrayList<Double> AHBowlER = new ArrayList<Double>(11);
    ArrayList<Integer> AVBatrun = new ArrayList<Integer>(11);
    ArrayList<Integer> AVBatbowl = new ArrayList<Integer>(11);
    ArrayList<Integer> AVBatsix = new ArrayList<Integer>(11);
    ArrayList<Integer> AVBatfour = new ArrayList<Integer>(11);
    ArrayList<Double> AVBatSR = new ArrayList<Double>(11);
    ArrayList<Integer> AVBowlrun= new ArrayList<Integer>(11);
    ArrayList<Integer> AVBowlWickets = new ArrayList<Integer>(11);
    ArrayList<Integer> AVBowlmaidens = new ArrayList<Integer>(11);
    ArrayList<Double> AVBowlovers = new ArrayList<Double>(11);
    ArrayList<Double> AVBowlER = new ArrayList<Double>(11);
    
     

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_admin);

        inputFromUI();
        myref= FirebaseDatabase.getInstance().getReference().child("Scorify").child(matchcode);

        Button startBtn =findViewById(R.id.ButtonStartA);
        startBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                initializeUI();

                tV_FBatStrike.setText(strike);
                flag = true;

                count = 0;
                inning = 1;
                for (u=0;u<11;u++)
                {
                    HBatrun[u]=0;
                    HBatbowl[u]=0;
                    HBatsix[u]=0;
                    HBatfour[u]=0;
                    HBatSR[u]=0;
                    HBowlrun[u]=0;
                    HBowlWickets[u]=0;
                    HBowlmaidens[u]=0;
                    HBowlovers[u]=0;
                    HBowlER[u]=0;
                    VBatrun[u]=0;
                    VBatbowl[u]=0;
                    VBatsix[u]=0;
                    VBatfour[u]=0;
                    VBatSR[u]=0;
                    VBowlrun[u]=0;
                    VBowlWickets[u]=0;
                    VBowlmaidens[u]=0;
                    VBowlovers[u]=0;
                    VBowlER[u]=0;
                }
                tV_Teamname.setText(hostname1);
                tV_FBatNm.setText(h1);
                tV_SBatNm.setText(h2);
                tV_bowlnm.setText(v11);
                IntialRDPlayerStats();

               UpdateBatsmenStats();UpdateBowlerStats();finalizeUI();
               setDatabaseFRTD();
               myref.setValue(rd);

            }
        });

        Button oneBtn =findViewById(R.id.ButtonRun1A);
        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                initializeUI();

                if (over != inputOver)
                {
                    clearThisOverCountUI();

                    Increaserun(1,true);

                    overPanalUI();

                    if(ball==0)
                    {
                        count=0;
                        countDotb=0;
                        if(inning==1){NextbowlerI1UI();}
                        else if(inning==2){NextbowlerI2UI();}
                    }
                    UpdateBatsmenStats();
                    UpdateBowlerStats();
                    finalizeUI();

                }
                else
                {
                    inningOverUI();
                }
                setDatabaseFRTD();
                myref.setValue(rd);
            }

        });

        Button twoBtn =findViewById(R.id.ButtonRun2A);
        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                initializeUI();

                if (over != inputOver)
                {

                    clearThisOverCountUI();

                    Increaserun(2,true);

                    overPanalUI();

                    if(ball==0)
                    {
                        count=0;
                        countDotb=0;
                        if(inning==1){NextbowlerI1UI();}
                        else if(inning==2){NextbowlerI2UI();}
                    }

                    UpdateBatsmenStats();UpdateBowlerStats();finalizeUI();

                }
                else
                {
                    inningOverUI();
                }
                setDatabaseFRTD();
                myref.setValue(rd);
            }

        });

        Button threeBtn =findViewById(R.id.ButtonRun3A);
        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                initializeUI();

                if (over != inputOver) {

                    clearThisOverCountUI();

                    Increaserun(3,true);

                    overPanalUI();

                    if(ball==0)
                    {
                        count=0;
                        countDotb=0;
                        if(inning==1){NextbowlerI1UI();}
                        else if(inning==2){NextbowlerI2UI();}
                    }

                    UpdateBatsmenStats();UpdateBowlerStats();finalizeUI();

                } else {
                    inningOverUI();
                }
                setDatabaseFRTD();
                myref.setValue(rd);
            }
        });

        Button fourBtn =findViewById(R.id.ButtonRun4A);
        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                initializeUI();

                if (over != inputOver) {
                    clearThisOverCountUI();
                    Increaserun(4,true);

                    overPanalUI();

                    if(ball==0)
                    {
                        count=0;
                        countDotb=0;
                        if(inning==1){NextbowlerI1UI();}
                        else if(inning==2){NextbowlerI2UI();}
                    }

                    UpdateBatsmenStats();UpdateBowlerStats();finalizeUI();

                } else {
                    inningOverUI();
                }
                setDatabaseFRTD();
                myref.setValue(rd);
            }
        });

        Button sixBtn =findViewById(R.id.ButtonRun6A);
        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                initializeUI();

                if (over != inputOver) {

                    clearThisOverCountUI();

                    Increaserun(6,true);

                    overPanalUI();

                    if(ball==0)
                    {
                        count=0;
                        countDotb=0;
                        if(inning==1){NextbowlerI1UI();}
                        else if(inning==2){NextbowlerI2UI();}
                    }

                    UpdateBatsmenStats();UpdateBowlerStats();finalizeUI();

                } else {
                    inningOverUI();
                }
                setDatabaseFRTD();
                myref.setValue(rd);
            }
        });

        Button fiveBtn =findViewById(R.id.ButtonRun5A);
        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                initializeUI();

                if (over != inputOver)
                {
                    clearThisOverCountUI();

                    Increaserun(5,true);

                    overPanalUI();

                    if(ball==0)
                    {
                        count=0;
                        countDotb=0;
                        if(inning==1){NextbowlerI1UI();}
                        else if(inning==2){NextbowlerI2UI();}
                    }

                    UpdateBatsmenStats();UpdateBowlerStats();finalizeUI();

                }
                else {
                    inningOverUI();
                }
                setDatabaseFRTD();
                myref.setValue(rd);
            }
        });


        Button wideBtn =findViewById(R.id.ButtonWideA);
        wideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                initializeUI();

                if (over != inputOver)
                {
                    clearThisOverCountUI();

                    ones = "W'";
                    count += 1;
                    run += 1;
                    over = over1 + ball;
                    crr = 6.0 * run / ballT;
                    bowlrun += 1;
                    pshipr += 1;

                    overPanalUI();

                    UpdateBatsmenStats();UpdateBowlerStats();finalizeUI();

                } else {
                    inningOverUI();
                }
                setDatabaseFRTD();
                myref.setValue(rd);
            }
        });


        Button dotBtn =findViewById(R.id.ButtonDotA);
        dotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                initializeUI();

                if (over != inputOver) {
                    clearThisOverCountUI();
                    if(ball==0.5&&countDotb==5){countDotb=0;bowlmaiden=+1;}
                    else {countDotb=+1;}
                    ones="-";
                    Increaserun(0,true,ones);
                    overPanalUI();

                    if(ball==0)
                    {
                        count=0;
                        countDotb=0;
                        if(inning==1){NextbowlerI1UI();}
                        else if(inning==2){NextbowlerI2UI();}
                    }

                    UpdateBatsmenStats();UpdateBowlerStats();finalizeUI();

                } else {
                    inningOverUI();
                }
                setDatabaseFRTD();
                myref.setValue(rd);
            }
        });


        Button wicketBtn =findViewById(R.id.ButtonWicketA);
        wicketBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                initializeUI();

                if (over != inputOver) {

                    clearThisOverCountUI();
                    UpdateBatsmenStats();
                    UpdateBowlerStats();

                    ones = "W";
                    count += 1;
                    wicket += 1;

                    ball += 0.1;
                    ballT += 1;
                    if (ball == 0.6) {
                        over1 += 1;
                        ball = 0;
                    }
                    over = over1 + ball;
                    crr = 6.0 * run / ballT;
                    bowlball += 0.1;
                    bowlballT += 1;


                    if (bowlball == 0.6) {
                        bowlover1 += 1;
                        bowlball = 0;
                    }
                    bowlover = bowlover1 + bowlball;
                    bowlER = 6.0 * run / ballT;
                    bowlwicket += 1;
                    if (flag) {
                        batFRun =0;
                        batFBall = 0;
                        batFSix=0;
                        batFFour=0;
                        batFSR = 0;
                    } else {
                        batSRun =0;
                        batSBall =0;
                        batFSix=0;
                        batSFour=0;
                        batSSR = 0;
                    }
                    pshipr = 0;
                    pshipb = 0;
                    if(inning==1)
                    {
                        NextbatsmenI1UI();
                    }
                    else if(inning==2) {
                        NextbatsmenI2UI();
                    }

                    overPanalUI();



                    if(ball==0)
                    {
                        count=0;
                        countDotb=0;
                        if(inning==1){NextbowlerI1UI();}
                        else if(inning==2){NextbowlerI2UI();}
                    }
                    if (wicket == 10) {
                        inningOverUI();
                    }

                    finalizeUI();


                } else {
                    inningOverUI();
                }
                setDatabaseFRTD();
                myref.setValue(rd);
            }
        });

        Button clearBtn =findViewById(R.id.ButtonClearA);
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                initializeUI();
                clearUI();
                setDatabaseFRTD();
                myref.setValue(rd);
            }
        });

       Button noballBtn = findViewById(R.id.ButtonNoBallA);
        noballBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                initializeUI();

                if(over!=inputOver)
                {
                    clearThisOverCountUI();

                    tV_Over.setText(Double.toString(over));
                    tV_FBatBall.setText(Integer.toString(batFBall));
                    tV_SBatBall.setText(Integer.toString(batSBall));
                    tV_BowlOvers.setText(Double.toString(bowlover));
                    tV_Pshipb.setText(Integer.toString(pshipb));
                    ones="N";
                     count+=1;
                     run += 1;
                     pshipr+=1;
                     pshipb-=1;
                      if(ball==0 && bowlball==0)
                      {
                         ball=0.5;
                         over1-=1;
                         over-=0.5;
                         bowlball=0.5;
                         bowlover1-=1;
                         bowlover-=0.5;
                         crr = 6.0 * run / ballT ;
                         bowlER = 6.0 * run / ballT;
                      }
                    else
                    {
                    ball -= 0.1;
                    ballT -= 1;
                    if(ball == 0.6)
                    {
                        over1 += 1;
                        ball = 0;
                    }
                    over = over1 + ball;
                    crr = 6.0 * run / ballT ;

                    bowlball -= 0.1;
                    bowlballT -= 1;
                    if(bowlball == 0.6)
                    {
                        bowlover1 += 1;
                        bowlball = 0;
                    }
                    bowlover = bowlover1 + bowlball;
                    bowlER = 6.0 * run / ballT;
                     }

                     overPanalUI();

                    if(ball==0)
                    {
                        count=0;
                    }

                    tV_Run.setText(Integer.toString(run));
                    tV_Crr.setText(Double.toString(crr));
                    tV_wicket.setText(Integer.toString(wicket));
                    tV_FBatRun.setText(Integer.toString(batFRun));
                    tV_FBatSR.setText(Double.toString(batFSR));
                    tV_SBatRun.setText(Integer.toString(batSRun));
                    tV_SBatSR.setText(Double.toString(batSSR));
                    tV_BowlMaiden.setText(Integer.toString(bowlmaiden));
                    tV_bowlrun.setText(Integer.toString(bowlrun));
                    tV_BowlWicket.setText(Integer.toString(bowlwicket));
                    tV_BowlER.setText(Double.toString(bowlER));
                    tV_Pshipr.setText(Integer.toString(pshipr));
                }
                else {
                    inningOverUI();
                }
                setDatabaseFRTD();
                myref.setValue(rd);
            }
        });

        Button byesBtn = findViewById(R.id.ButtonByesA);
        byesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                initializeUI();

                if (over != inputOver)
                {
                    clearThisOverCountUI();

                    int byes = Integer.parseInt(eT_Byes.getText().toString());
                    onebyes = Integer.toString(byes);
                    ones = "B".concat(onebyes);
                    run += byes;
                    ball += 0.1;
                    count += 1;
                    if (ball == 0.6) {
                        over1 += 1;
                        ball = 0;
                    }
                    over = over1 + ball;
                    crr = 6.0 * run / ballT;
                    pshipr += byes;
                    pshipb += 1;

                    overPanalUI();

                    if(ball==0)
                    {
                        count=0;
                        countDotb=0;
                        if(inning==1){NextbowlerI1UI();}
                        else if(inning==2){NextbowlerI2UI();}
                    }

                    UpdateBatsmenStats();UpdateBowlerStats();finalizeUI();

                } else {
                    inningOverUI();
                }
                setDatabaseFRTD();
                myref.setValue(rd);
            }
        });

        Button swapBtn =findViewById(R.id.ButtonSwapA);
        swapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                initializeUI();
                if(flag)
                {
                    tV_FBatStrike.setText(nstrike);tV_SBatStrike.setText(strike);
                    flag=false;

                }
                else
                {
                    tV_FBatStrike.setText(strike);tV_SBatStrike.setText(nstrike);
                    flag=true;
                }

                setDatabaseFRTD();
                myref.setValue(rd);
            }
        });

    }


    public void initializeUI()
    {
        tV_Run =  findViewById(R.id.tVRunA);
        tV_Over =  findViewById(R.id.tVOverA);
        tV_Crr =  findViewById(R.id.tvCrrA);
        tV_wicket =  findViewById(R.id.tVWicketA);
        tV_FBatStrike= findViewById(R.id.tVFBatStrikeA);
        tV_FBatRun = findViewById(R.id.tVFBatRunA);
        tV_SBatRun = findViewById(R.id.tVSBatRunA);
        tV_FBatBall = findViewById(R.id.tVFBatBallA);
        tV_SBatBall = findViewById(R.id.tVSBatBallA);
        tV_FBatSR = findViewById(R.id.tVFBatSRA);
        tV_SBatSR = findViewById(R.id.tVSBatSRA);
        tV_BowlOvers = findViewById(R.id.tVBowlOversA);
        tV_BowlMaiden = findViewById(R.id.tVBowlMaidenA);
        tV_bowlrun = findViewById(R.id.tVBowlRunA);
        tV_BowlWicket = findViewById(R.id.tVBowlWicketA);
        tV_BowlER = findViewById(R.id.tVBowlERA);
        tV_FBatFour = findViewById(R.id.tVFBatFourA);
        tV_SBatFour = findViewById(R.id.tVSBatFourA);
        tV_FBatSix = findViewById(R.id.tVFBatSixA);
        tV_SBatSix = findViewById(R.id.tVSBatSixA);
        tV_Pshipr= findViewById(R.id.tVPshipRA);
        tV_Pshipb= findViewById(R.id.tVPshipBA);
        tV_ThisOver1= findViewById(R.id.tVThisOver1A);
        tV_ThisOver2= findViewById(R.id.tVThisOver2A);
        tV_ThisOver3= findViewById(R.id.tVThisOver3A);
        tV_ThisOver4=findViewById(R.id.tVThisOver4A);
        tV_ThisOver5= findViewById(R.id.tVThisOver5A);
        tV_ThisOver6= findViewById(R.id.tVThisOver6A);
        tV_ThisOver7= findViewById(R.id.tVThisOver7A);
        tV_ThisOver8= findViewById(R.id.tVThisOver8A);
        tV_ThisOver9= findViewById(R.id.tVThisOver9A);
        tV_Inning =  findViewById(R.id.tvInningA);
        tV_Teamname = findViewById(R.id.tvteamnameA);
        eT_Byes= findViewById(R.id.eTByesA);
        tV_FBatNm=findViewById(R.id.tVFBatNmA);
        tV_SBatNm= findViewById(R.id.tVSBatNmA);
        tV_bowlnm= findViewById(R.id.tVBowlNmA);
        tV_SBatStrike = findViewById(R.id.tVSBatStrikeA);

    }
    public void finalizeUI()
    {
        tV_Run.setText(Integer.toString(run));
        tV_Over.setText(Double.toString(over));
        tV_Crr.setText(Double.toString(crr));
        tV_wicket.setText(Integer.toString(wicket));
        tV_FBatRun.setText(Integer.toString(batFRun));
        tV_FBatBall.setText(Integer.toString(batFBall));
        tV_FBatFour.setText(Integer.toString(batFSix));
        tV_FBatSix.setText(Integer.toString(batFFour));
        tV_FBatSR.setText(Double.toString(batFSR));
        tV_SBatRun.setText(Integer.toString(batSRun));
        tV_SBatBall.setText(Integer.toString(batSBall));
        tV_SBatFour.setText(Integer.toString(batSSix));
        tV_SBatSix.setText(Integer.toString(batSFour));
        tV_SBatSR.setText(Double.toString(batSSR));
        tV_BowlOvers.setText(Double.toString(bowlover));
        tV_BowlMaiden.setText(Integer.toString(bowlmaiden));
        tV_bowlrun.setText(Integer.toString(bowlrun));
        tV_BowlWicket.setText(Integer.toString(bowlwicket));
        tV_BowlER.setText(Double.toString(bowlER));
        tV_Pshipr.setText(Integer.toString(pshipr));
        tV_Pshipb.setText(Integer.toString(pshipb));
        tV_Inning.setText(Integer.toString(inning));

    }
    public void overPanalUI() //<T extends Number>
    {
        /*
        if(one instanceof Integer){
            Integer onnn=one.intValue();
            ones=Integer.toString(onnn);
        }*/
        switch (count)
        {

            case 1: tV_ThisOver1.setText(ones);break;
            case 2: tV_ThisOver2.setText(ones);break;
            case 3: tV_ThisOver3.setText(ones);break;
            case 4: tV_ThisOver4.setText(ones);break;
            case 5: tV_ThisOver5.setText(ones);break;
            case 6: tV_ThisOver6.setText(ones);break;
            case 7: tV_ThisOver7.setText(ones);break;
            case 8: tV_ThisOver8.setText(ones);break;
            case 9: tV_ThisOver9.setText(ones);break;

        }
    }
    public void inningOverUI()
    {
        Toast.makeText(Admin.this,"1st INNING OVER",Toast.LENGTH_LONG).show();
        inning=2;
        run =0;
        ball =0;
        over =0;
        over1 =0;
        crr =0;
        wicket =0;
        batFRun = 0;
        batSRun = 0;
        batFBall = 0;
        batSBall = 0;
        batFSix = 0;
        batSSix = 0;
        batFFour = 0;
        batSFour = 0;
        batFSR = 0;
        batSSR = 0;
        bowlrun =0;
        bowlwicket =0;
        bowlmaiden =0;
        bowlover1 = 0;
        bowlball = 0;
        bowlballT = 0;
        bowlover = 0;
        bowlER=0;
        strike ="*";
        nstrike =" ";
        flag=true;
        pshipr=0;
        pshipb=0;
        count=0;
        strikex=0;
        strikey=1;
        strikez=10;

        tV_Run.setText(" ");
        tV_Over.setText(" ");
        tV_Crr.setText(" ");
        tV_wicket.setText(" ");
        tV_FBatRun.setText(" ");
        tV_FBatBall.setText(" ");
        tV_FBatSR.setText(" ");
        tV_SBatRun.setText(" ");
        tV_SBatBall.setText(" ");
        tV_SBatSR.setText(" ");
        tV_BowlOvers.setText(" ");
        tV_BowlMaiden.setText(" ");
        tV_bowlrun.setText(" ");
        tV_BowlWicket.setText(" ");
        tV_BowlER.setText(" ");
        tV_FBatFour.setText(" ");
        tV_SBatFour.setText(" ");
        tV_FBatSix.setText(" ");
        tV_SBatSix.setText(" ");
        tV_Pshipr.setText(" ");
        tV_Pshipb.setText(" ");
        tV_ThisOver1.setText(" ");
        tV_ThisOver2.setText(" ");
        tV_ThisOver3.setText(" ");
        tV_ThisOver4.setText(" ");
        tV_ThisOver5.setText(" ");
        tV_ThisOver6.setText(" ");
        tV_ThisOver7.setText(" ");
        tV_ThisOver8.setText(" ");
        tV_ThisOver9.setText(" ");
        tV_Inning.setText(Integer.toString(inning));
        tV_Teamname.setText(vistorname1);
        tV_FBatNm.setText(v1);
        tV_SBatNm.setText(v2);
        tV_bowlnm.setText(h11);
    }
    public void inputFromUI()
    {
        i=getIntent();
        hostname1=i.getStringExtra("HT");
        vistorname1=i.getStringExtra("VT");
        inputOver2=i.getStringExtra("O");
        inputOver=Double.parseDouble(inputOver2);
        h1=i.getStringExtra("H1");
        h2=i.getStringExtra("H2");
        h3=i.getStringExtra("H3");
        h4=i.getStringExtra("H4");
        h5=i.getStringExtra("H5");
        h6=i.getStringExtra("H6");
        h7=i.getStringExtra("H7");
        h8=i.getStringExtra("H8");
        h9=i.getStringExtra("H9");
        h10=i.getStringExtra("H10");
        h11=i.getStringExtra("H11");
        v1=i.getStringExtra("V1");
        v2=i.getStringExtra("V2");
        v3=i.getStringExtra("V3");
        v4=i.getStringExtra("V4");
        v5=i.getStringExtra("V5");
        v6=i.getStringExtra("V6");
        v7=i.getStringExtra("V7");
        v8=i.getStringExtra("V8");
        v9=i.getStringExtra("V9");
        v10=i.getStringExtra("V10");
        v11=i.getStringExtra("V11");
        toss=i.getStringExtra("TOSS");
        opted=i.getStringExtra("OPT");
        matchcode=i.getStringExtra("MC");
    }
    public void clearThisOverCountUI()
    {
        if (count == 0 || count == 9)
        {
            count=0;
            tV_ThisOver1.setText(" ");
            tV_ThisOver2.setText(" ");
            tV_ThisOver3.setText(" ");
            tV_ThisOver4.setText(" ");
            tV_ThisOver5.setText(" ");
            tV_ThisOver6.setText(" ");
            tV_ThisOver7.setText(" ");
            tV_ThisOver8.setText(" ");
            tV_ThisOver9.setText(" ");
        }
    }
    public void clearUI()
    {
        run =0;
        ball =0;
        over =0;
        over1 =0;
        crr =0;
        wicket =0;
        batFRun = 0;
        batSRun = 0;
        batFBall = 0;
        batSBall = 0;
        batFSix = 0;
        batSSix = 0;
        batFFour = 0;
        batSFour = 0;
        batFSR = 0;
        batSSR = 0;
        bowlrun =0;
        bowlwicket =0;
        bowlmaiden =0;
        bowlover1 = 0;
        bowlball = 0;
        bowlballT = 0;
        bowlover = 0;
        bowlER=0;
        strike ="*";
        nstrike =" ";
        flag=true;
        pshipr=0;
        pshipb=0;
        count=0;
        countDotb=0;
        strikex=0;
        strikey=1;
        strikez=10;

        tV_Run.setText(" ");
        tV_Over.setText(" ");
        tV_Crr.setText(" ");
        tV_wicket.setText(" ");
        tV_FBatRun.setText(" ");
        tV_FBatBall.setText(" ");
        tV_FBatSR.setText(" ");
        tV_SBatRun.setText(" ");
        tV_SBatBall.setText(" ");
        tV_SBatSR.setText(" ");
        tV_BowlOvers.setText(" ");
        tV_BowlMaiden.setText(" ");
        tV_bowlrun.setText(" ");
        tV_BowlWicket.setText(" ");
        tV_BowlER.setText(" ");
        tV_FBatFour.setText(" ");
        tV_SBatFour.setText(" ");
        tV_FBatSix.setText(" ");
        tV_SBatSix.setText(" ");
        tV_Pshipr.setText(" ");
        tV_Pshipb.setText(" ");
        tV_ThisOver1.setText(" ");
        tV_ThisOver2.setText(" ");
        tV_ThisOver3.setText(" ");
        tV_ThisOver4.setText(" ");
        tV_ThisOver5.setText(" ");
        tV_ThisOver6.setText(" ");
        tV_ThisOver7.setText(" ");
        tV_ThisOver8.setText(" ");
        tV_ThisOver9.setText(" ");
    }
    
    
    public void batsmenFHUI()
    {
        switch (nextbat)
        {
            case 1: tV_FBatNm.setText(h3);break;
            case 2: tV_FBatNm.setText(h4);break;
            case 3: tV_FBatNm.setText(h5);break;
            case 4: tV_FBatNm.setText(h6);break;
            case 5: tV_FBatNm.setText(h7);break;
            case 6: tV_FBatNm.setText(h8);break;
            case 7: tV_FBatNm.setText(h9);break;
            case 8: tV_FBatNm.setText(h10);break;
            case 9: tV_FBatNm.setText(h11);break;
        }
    }
    public void batsmenFVUI()
    {
        switch (nextbat)
        {
            case 1: tV_FBatNm.setText(v3);break;
            case 2: tV_FBatNm.setText(v4);break;
            case 3: tV_FBatNm.setText(v5);break;
            case 4: tV_FBatNm.setText(v6);break;
            case 5: tV_FBatNm.setText(v7);break;
            case 6: tV_FBatNm.setText(v8);break;
            case 7: tV_FBatNm.setText(v9);break;
            case 8: tV_FBatNm.setText(v10);break;
            case 9: tV_FBatNm.setText(v11);break;
        }
    }
    public void batsmenSHUI()
    {
        switch (nextbat)
        {
            case 1: tV_SBatNm.setText(h3);break;
            case 2: tV_SBatNm.setText(h4);break;
            case 3: tV_SBatNm.setText(h5);break;
            case 4: tV_SBatNm.setText(h6);break;
            case 5: tV_SBatNm.setText(h7);break;
            case 6: tV_SBatNm.setText(h8);break;
            case 7: tV_SBatNm.setText(h9);break;
            case 8: tV_SBatNm.setText(h10);break;
            case 9: tV_SBatNm.setText(h11);break;
        }
    }
    public void batsmenSVUI()
    {
        switch (nextbat)
        {
            case 1: tV_SBatNm.setText(v3);break;
            case 2: tV_SBatNm.setText(v4);break;
            case 3: tV_SBatNm.setText(v5);break;
            case 4: tV_SBatNm.setText(v6);break;
            case 5: tV_SBatNm.setText(v7);break;
            case 6: tV_SBatNm.setText(v8);break;
            case 7: tV_SBatNm.setText(v9);break;
            case 8: tV_SBatNm.setText(v10);break;
            case 9: tV_SBatNm.setText(v11);break;
        }
    }
    

    public void Increaserun(int x,boolean b)
    {
        int y;
        double z;
        if(b) { y=1;z=0.1; }
        else {  y=0;z=0; }
        one = x;
        ones=Integer.toString(one);
        run += x;
        ball += z;
        count += y;
        ballT += y;
        if (ball == 0.6) {
            over1 += 1;
            ball = 0;
        }
        over = over1 + ball;
        crr = 6.0 * run / ballT;

        bowlball += z;
        bowlballT += y;
        bowlrun += x;

        if (bowlball == 0.6) {
            bowlover1 += 1;
            bowlball = 0;
        }
        bowlover = bowlover1 + bowlball;
        bowlER = 6.0 * bowlrun / bowlballT;

        if (flag) {
            batFRun += x;
            batFBall += y;
            batFSR = 100 * batFRun / batFBall;
            if(x==4) { batFFour +=1;}
            else if(x==6) { batFSix +=1;}
        } else {
            batSRun += x;
            batSBall += y;
            batSSR = 100 * batSRun / batSBall;
            if(x==4) { batSFour +=1;}
            else if(x==6) { batSSix +=1;}

        }
        pshipr = batFRun + batSRun;
        pshipb = batFBall + batSBall;
    }
    public void Increaserun(int x,boolean b,String ones)
    {
        int y;
        double z;
        if(b) { y=1;z=0.1; }
        else {  y=0;z=0; }
        this.ones=ones;
        run += x;
        ball += z;
        count += y;
        ballT += y;
        if (ball == 0.6) {
            over1 += 1;
            ball = 0;
        }
        over = over1 + ball;
        crr = 6.0 * run / ballT;

        bowlball += z;
        bowlballT += y;
        bowlrun += x;

        if (bowlball == 0.6) {
            bowlover1 += 1;
            bowlball = 0;
        }
        bowlover = bowlover1 + bowlball;
        bowlER = 6.0 * run / ballT;

        if (flag == true) {
            batFRun += x;
            batFBall += y;
            batFSR = 100 * batFRun / batFBall;
            if(x==4) { batFFour +=1;}
            else if(x==6) { batFSix +=1;}
        } else {
            batSRun += x;
            batSBall += y;
            batSSR = 100 * batSRun / batSBall;
            if(x==4) { batSFour +=1;}
            else if(x==6) { batSSix +=1;}
        }
        pshipr = batFRun + batSRun;
        pshipb = batFBall + batSBall;
    }
    
    
    public void setDatabaseFRTD()
    {
        rd.setTeamname(tV_Teamname.getText().toString());
        rd.setRun(run);
        rd.setOver(over);
        rd.setWicket(wicket);
        rd.setCrr(crr);
        rd.setInning(inning);
        rd.setBatsmenname1(tV_FBatNm.getText().toString());
        rd.setBatsmenname2(tV_SBatNm.getText().toString());
        rd.setBatFRun(batFRun);
        rd.setBatFBall(batFBall);
        rd.setBatFFour(batFFour);
        rd.setBatFSix(batFSix);
        rd.setBatSSR(batFSR);
        rd.setBatSRun(batSRun);
        rd.setBatSBall(batSBall);
        rd.setBatSFour(batSFour);
        rd.setBatSSix(batSSix);
        rd.setBatSSR(batSSR);
        rd.setBowlername(tV_bowlnm.getText().toString());
        rd.setBowlover(bowlover);
        rd.setBowlmaiden(bowlmaiden);
        rd.setBowlrun(bowlrun);
        rd.setBowlwicket(bowlwicket);
        rd.setBowlER(bowlER);
        rd.setThisOver1(tV_ThisOver1.getText().toString());
        rd.setThisOver2(tV_ThisOver2.getText().toString());
        rd.setThisOver3(tV_ThisOver3.getText().toString());
        rd.setThisOver4(tV_ThisOver4.getText().toString());
        rd.setThisOver5(tV_ThisOver5.getText().toString());
        rd.setThisOver6(tV_ThisOver6.getText().toString());
        rd.setThisOver7(tV_ThisOver7.getText().toString());
        rd.setThisOver8(tV_ThisOver8.getText().toString());
        rd.setThisOver9(tV_ThisOver9.getText().toString());
        rd.setPshipr(pshipr);
        rd.setPshipb(pshipb);
        rd.setStrike(tV_FBatStrike.getText().toString());
        rd.setNstrike(tV_SBatStrike.getText().toString());
        rd.setToss(toss);
        rd.setOpted(opted);
        rd.setHBatrun(AHBatrun);
        rd.setHBatbowl(AHBatbowl);
        rd.setHBatsix(AHBatsix);
        rd.setHBatfour(AHBatfour);
        rd.setHBatSR(AHBatSR);
        rd.setHBowlovers(AHBowlovers);
        rd.setHBowlER(AHBowlER);
        rd.setHBowlrun(AHBowlrun);
        rd.setHBowlWickets(AHBowlWickets);
        rd.setHBowlmaidens(AHBowlmaidens);
        rd.setVBatrun(AHBatrun);
        rd.setVBatbowl(AVBatbowl);
        rd.setVBatsix(AVBatsix);
        rd.setVBatfour(AVBatfour);
        rd.setVBatSR(AVBatSR);
        rd.setVBowlrun(AVBowlrun);
        rd.setVBowlWickets(AVBowlWickets);
        rd.setVBowlmaidens(AVBowlmaidens);
        rd.setVBowlovers(AVBowlovers);
        rd.setVBowlER(AVBowlER);
    }
    public void IntialRDPlayerStats()
    {
        for (u=0;u<11;u++)
        {
            AHBatrun.add(u,HBatrun[u]);
        }
        for (u=0;u<11;u++)
        {
            AHBatbowl.add(u,HBatbowl[u]);
        }
        for (u=0;u<11;u++)
        {
            AHBatsix.add(u,HBatsix[u]);
        }
        for (u=0;u<11;u++)
        {
            AHBatfour.add(u,HBatfour[u]);
        }
        for (u=0;u<11;u++)
        {
            AHBatSR.add(u,HBatSR[u]);
        }
        for (u=0;u<11;u++)
        {
            AHBowlovers.add(u,HBowlovers[u]);
        }
        for (u=0;u<11;u++)
        {
            AHBowlrun.add(u,HBowlrun[u]);
        }
        for (u=0;u<11;u++)
        {
            AHBowlmaidens.add(u,HBowlmaidens[u]);
        }
        for (u=0;u<11;u++)
        {
            AHBowlWickets.add(u,HBowlWickets[u]);
        }
        for (u=0;u<11;u++)
        {
            AHBowlER.add(u,HBowlER[u]);
        }
        for (u=0;u<11;u++)
        {
            AVBatrun.add(u,VBatrun[u]);
        }
        for (u=0;u<11;u++)
        {
            AVBatbowl.add(u,VBatbowl[u]);
        }
        for (u=0;u<11;u++)
        {
            AVBatsix.add(u,VBatsix[u]);
        }
        for (u=0;u<11;u++)
        {
            AVBatfour.add(u,VBatfour[u]);
        }
        for (u=0;u<11;u++)
        {
            AVBatSR.add(u,VBatSR[u]);
        }
        for (u=0;u<11;u++)
        {
            AVBowlovers.add(u,VBowlovers[u]);
        }
        for (u=0;u<11;u++)
        {
            AVBowlrun.add(u,VBowlrun[u]);
        }
        for (u=0;u<11;u++)
        {
            AVBowlmaidens.add(u,VBowlmaidens[u]);
        }
        for (u=0;u<11;u++)
        {
            AVBowlWickets.add(u,VBowlWickets[u]);
        }
        for (u=0;u<11;u++)
        {
            AVBowlER.add(u,VBowlER[u]);
        }
    }
    public void UpdateRDPlayerStats()
    {

        for (u=0;u<11;u++)
        {
            AHBatrun.remove(u);
            AHBatrun.add(u,HBatrun[u]);
        }
        for (u=0;u<11;u++)
        {
            AHBatbowl.remove(u);
            AHBatbowl.add(u,HBatbowl[u]);
        }
        for (u=0;u<11;u++)
        {
            AHBatsix.remove(u);
            AHBatsix.add(u,HBatsix[u]);
        }
        for (u=0;u<11;u++)
        {
            AHBatfour.remove(u);
            AHBatfour.add(u,HBatfour[u]);
        }
        for (u=0;u<11;u++)
        {
            AHBatSR.remove(u);
            AHBatSR.add(u,HBatSR[u]);
        }
        for (u=0;u<11;u++)
        {
            AHBowlovers.remove(u);
            AHBowlovers.add(u,HBowlovers[u]);
        }
        for (u=0;u<11;u++)
        {
            AHBowlrun.remove(u);
            AHBowlrun.add(u,HBowlrun[u]);
        }
        for (u=0;u<11;u++)
        {
            AHBowlmaidens.remove(u);
            AHBowlmaidens.add(u,HBowlmaidens[u]);
        }
        for (u=0;u<11;u++)
        {
            AHBowlWickets.remove(u);
            AHBowlWickets.add(u,HBowlWickets[u]);
        }
        for (u=0;u<11;u++)
        {
            AHBowlER.remove(u);
            AHBowlER.add(u,HBowlER[u]);
        }
        for (u=0;u<11;u++)
        {
            AVBatrun.remove(u);
            AVBatrun.add(u,VBatrun[u]);
        }
        for (u=0;u<11;u++)
        {
            AVBatbowl.remove(u);
            AVBatbowl.add(u,VBatbowl[u]);
        }
        for (u=0;u<11;u++)
        {
            AVBatsix.remove(u);
            AVBatsix.add(u,VBatsix[u]);
        }
        for (u=0;u<11;u++)
        {
            AVBatfour.remove(u);
            AVBatfour.add(u,VBatfour[u]);
        }
        for (u=0;u<11;u++)
        {
            AVBatSR.remove(u);
            AVBatSR.add(u,VBatSR[u]);
        }
        for (u=0;u<11;u++)
        {
            AVBowlovers.remove(u);
            AVBowlovers.add(u,VBowlovers[u]);
        }
        for (u=0;u<11;u++)
        {
            AVBowlrun.remove(u);
            AVBowlrun.add(u,VBowlrun[u]);
        }
        for (u=0;u<11;u++)
        {
            AVBowlmaidens.remove(u);
            AVBowlmaidens.add(u,VBowlmaidens[u]);
        }
        for (u=0;u<11;u++)
        {
            AVBowlmaidens.remove(u);
            AVBowlmaidens.add(u,VBowlWickets[u]);
        }
        for (u=0;u<11;u++)
        {
            AVBowlER.remove(u);
            AVBowlER.add(u,VBowlER[u]);
        }
    }
    

    public void NextbatsmenI1UI()
    {
        final String[] listItems={" ",h3,h4,h5,h6,h7,h8,h9,h10,h11};
        AlertDialog.Builder builder = new AlertDialog.Builder(Admin.this);
        builder.setTitle("Choose Next Batsmen");

        int checkedItem = 0; //this will checked the item when user open the dialog
        builder.setSingleChoiceItems(listItems, checkedItem, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Admin.this, "Position: " + which + " Batsmen: " + listItems[which], Toast.LENGTH_LONG).show();
                switch(which)
                {
                    case 0: nextbat=0; break;
                    case 1: nextbat=1; break;
                    case 2: nextbat=2; break;
                    case 3: nextbat=4; break;
                    case 4: nextbat=4; break;
                    case 5: nextbat=5; break;
                    case 6: nextbat=6; break;
                    case 7: nextbat=7; break;
                    case 8: nextbat=8; break;
                    case 9: nextbat=9; break;
                }
                dialog.dismiss();
                if(flag){strikex=nextbat;}
                else if(!flag){strikey=nextbat;};

                if(inning==1)
                {
                    if(flag==true)
                    {
                        batsmenFHUI();
                    }
                    else
                    {
                        batsmenSHUI();
                    }
                }
                else if(inning==2)
                {
                    if(flag==true)
                    {
                        batsmenFVUI();
                    }
                    else
                    {
                        batsmenSVUI();
                    }
                }
            }
        });


        AlertDialog dialog = builder.create();
        dialog.show();
    }
    public void NextbatsmenI2UI()
    {
        final String[] listItems={" ",v3,v4,v5,v6,v7,v8,v9,v10,v11};
        AlertDialog.Builder builder = new AlertDialog.Builder(Admin.this);
        builder.setTitle("Choose Next Batsmen");

        int checkedItem = 0; //this will checked the item when user open the dialog
        builder.setSingleChoiceItems(listItems, checkedItem, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Admin.this, "Position: " + which + " Batsmen: " + listItems[which], Toast.LENGTH_LONG).show();
                switch(which)
                {
                    case 0: nextbat=0; break;
                    case 1: nextbat=1; break;
                    case 2: nextbat=2; break;
                    case 3: nextbat=4; break;
                    case 4: nextbat=4; break;
                    case 5: nextbat=5; break;
                    case 6: nextbat=6; break;
                    case 7: nextbat=7; break;
                    case 8: nextbat=8; break;
                    case 9: nextbat=9; break;
                }
                dialog.dismiss();
                if(flag){strikex=nextbat;}
                else if(!flag){strikey=nextbat;};

                if(inning==1)
                {
                    if(flag==true)
                    {
                        batsmenFHUI();
                    }
                    else
                    {
                        batsmenSHUI();
                    }
                }
                else if(inning==2)
                {
                    if(flag==true)
                    {
                        batsmenFVUI();
                    }
                    else
                    {
                        batsmenSVUI();
                    }
                }
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
    public void NextbowlerI2UI()
    {
        UpdateBowlerStats();
        
        final String[] listItems={h1,h2,h3,h4,h5,h6,h7,h8,h9,h10,h11};
        AlertDialog.Builder builder = new AlertDialog.Builder(Admin.this);
        builder.setTitle("Choose Next Bowler");

        int checkedItem = 0; //this will checked the item when user open the dialog
        builder.setSingleChoiceItems(listItems, checkedItem, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Admin.this, "Position: " + which + " Bowler: " + listItems[which], Toast.LENGTH_LONG).show();
                switch(which)
                {
                    case 0: tV_bowlnm.setText(h1);strikez=0;break;
                    case 1: tV_bowlnm.setText(h2);strikez=1;break;
                    case 2: tV_bowlnm.setText(h3);strikez=2;break;
                    case 3: tV_bowlnm.setText(h4);strikez=3;break;
                    case 4: tV_bowlnm.setText(h5);strikez=4;break;
                    case 5: tV_bowlnm.setText(h6);strikez=5;break;
                    case 6: tV_bowlnm.setText(h7);strikez=6;break;
                    case 7: tV_bowlnm.setText(h8);strikez=7;break;
                    case 8: tV_bowlnm.setText(h9);strikez=8;break;
                    case 9: tV_bowlnm.setText(h10);strikez=9;break;
                    case 10: tV_bowlnm.setText(h11);strikez=10;break;
                }
                dialog.dismiss();
                
                GetBowlerStats();

            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
    public void NextbowlerI1UI()
    {
        UpdateBowlerStats();
        
        final String[] listItems={v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11};
        AlertDialog.Builder builder = new AlertDialog.Builder(Admin.this);
        builder.setTitle("Choose Next Bowler");

        int checkedItem = 0; //this will checked the item when user open the dialog
        builder.setSingleChoiceItems(listItems, checkedItem, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Admin.this, "Position: " + which + " bowler: " + listItems[which], Toast.LENGTH_LONG).show();
                switch(which)
                {

                    case 0: tV_bowlnm.setText(v1);strikez=0;strikez2=0;break;
                    case 1: tV_bowlnm.setText(v2);strikez=1;strikez2=1;break;
                    case 2: tV_bowlnm.setText(v3);strikez=2;strikez2=2;break;
                    case 3: tV_bowlnm.setText(v4);strikez=3;strikez2=3;break;
                    case 4: tV_bowlnm.setText(v5);strikez=4;strikez2=4;break;
                    case 5: tV_bowlnm.setText(v6);strikez=5;strikez2=5;break;
                    case 6: tV_bowlnm.setText(v7);strikez=6;strikez2=6;break;
                    case 7: tV_bowlnm.setText(v8);strikez=7;strikez2=7;break;
                    case 8: tV_bowlnm.setText(v9);strikez=8;strikez2=8;break;
                    case 9: tV_bowlnm.setText(v10);strikez=9;strikez2=9;break;
                    case 10: tV_bowlnm.setText(v11);strikez=10;strikez2=10;break;
                }
                dialog.dismiss();
                GetBowlerStats();
                finalizeUI();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    
    
    public void UpdateBatsmenStats()
    {
        if(inning==1){UpdateBatsmenStatI1();}
        else if(inning==2){UpdateBatsmenStatI2();}
    }
    public void UpdateBatsmenStatI1()
    {
        switch (strikex) {
            case 0: {
                HBatrun[0] = batFRun;
                HBatbowl[0] = batFBall;
                HBatfour[0] = batFFour;
                HBatsix[0] = batFSix;
                HBatSR[0] = batFSR;
                break;
            }
            case 1: {
                HBatrun[1] = batFRun;
                HBatbowl[1] = batFBall;
                HBatfour[1] = batFFour;
                HBatsix[1] = batFSix;
                HBatSR[1] = batFSR;
                break;
            }
            case 2: {
                HBatrun[2] = batFRun;
                HBatbowl[2] = batFBall;
                HBatfour[2] = batFFour;
                HBatsix[2] = batFSix;
                HBatSR[2] = batFSR;
                break;
            }
            case 3: {
                HBatrun[3] = batFRun;
                HBatbowl[3] = batFBall;
                HBatfour[3] = batFFour;
                HBatsix[3] = batFSix;
                HBatSR[3] = batFSR;
                break;
            }
            case 4: {
                HBatrun[4] = batFRun;
                HBatbowl[4] = batFBall;
                HBatfour[4] = batFFour;
                HBatsix[4] = batFSix;
                HBatSR[4] = batFSR;
                break;
            }
            case 5: {
                HBatrun[5] = batFRun;
                HBatbowl[5] = batFBall;
                HBatfour[5] = batFFour;
                HBatsix[5] = batFSix;
                HBatSR[5] = batFSR;
                break;
            }
            case 6: {
                HBatrun[6] = batFRun;
                HBatbowl[6] = batFBall;
                HBatfour[6] = batFFour;
                HBatsix[6] = batFSix;
                HBatSR[6] = batFSR;
                break;
            }
            case 7: {
                HBatrun[7] = batFRun;
                HBatbowl[7] = batFBall;
                HBatfour[7] = batFFour;
                HBatsix[7] = batFSix;
                HBatSR[7] = batFSR;
                break;
            }
            case 8: {
                HBatrun[8] = batFRun;
                HBatbowl[8] = batFBall;
                HBatfour[8] = batFFour;
                HBatsix[8] = batFSix;
                HBatSR[8] = batFSR;
                break;
            }
            case 9: {
                HBatrun[9] = batFRun;
                HBatbowl[9] = batFBall;
                HBatfour[9] = batFFour;
                HBatsix[9] = batFSix;
                HBatSR[9] = batFSR;
                break;
            }
            case 10: {
                HBatrun[10] = batFRun;
                HBatbowl[10] = batFBall;
                HBatfour[10] = batFFour;
                HBatsix[10] = batFSix;
                HBatSR[10] = batFSR;
                break;
            }
            
        }

        switch (strikey) {
            case 0: {
                HBatrun[0] = batSRun;
                HBatbowl[0] = batSBall;
                HBatfour[0] = batSFour;
                HBatsix[0] = batSSix;
                HBatSR[0] = batSSR;
                break;
            }
            case 1: {
                    HBatrun[1] = batSRun;
                    HBatbowl[1] = batSBall;
                    HBatfour[1] = batSFour;
                    HBatsix[1] = batSSix;
                    HBatSR[1] = batSSR;
                    break;
            }
            case 2: {
                    HBatrun[2] = batSRun;
                    HBatbowl[2] = batSBall;
                    HBatfour[2] = batSFour;
                    HBatsix[2] = batSSix;
                    HBatSR[2] = batSSR;
                    break;
            }
            case 3: {
                    HBatrun[3] = batSRun;
                    HBatbowl[3] = batSBall;
                    HBatfour[3] = batSFour;
                    HBatsix[3] = batSSix;
                    HBatSR[3] = batSSR;
                    break;
            }
            case 4: {
                    HBatrun[4] = batSRun;
                    HBatbowl[4] = batSBall;
                    HBatfour[4] = batSFour;
                    HBatsix[4] = batSSix;
                    HBatSR[4] = batSSR;
                    break;
            }
            case 5: {
                    HBatrun[5] = batSRun;
                    HBatbowl[5] = batSBall;
                    HBatfour[5] = batSFour;
                    HBatsix[5] = batSSix;
                    HBatSR[5] = batSSR;
                    break;
            }
            case 6: {
                    HBatrun[6] = batSRun;
                    HBatbowl[6] = batSBall;
                    HBatfour[6] = batSFour;
                    HBatsix[6] = batSSix;
                    HBatSR[6] = batSSR;
                    break;
            }
            case 7: {
                    HBatrun[7] = batSRun;
                    HBatbowl[7] = batSBall;
                    HBatfour[7] = batSFour;
                    HBatsix[7] = batSSix;
                    HBatSR[7] = batSSR;
                    break;
            }
            case 8: {
                    HBatrun[8] = batSRun;
                    HBatbowl[8] = batSBall;
                    HBatfour[8] = batSFour;
                    HBatsix[8] = batSSix;
                    HBatSR[8] = batSSR;
                    break;
            }
            case 9: {
                    HBatrun[9] = batSRun;
                    HBatbowl[9] = batSBall;
                    HBatfour[9] = batSFour;
                    HBatsix[9] = batSSix;
                    HBatSR[9] = batSSR;
                    break;
            }
            case 10: {
                    HBatrun[10] = batSRun;
                    HBatbowl[10] = batSBall;
                    HBatfour[10] = batSFour;
                    HBatsix[10] = batSSix;
                    HBatSR[10] = batSSR;
                    break;
            }
            }
        UpdateRDPlayerStats();
    }
    public void UpdateBatsmenStatI2()
    {
        switch (strikex) {
            case 0: {
                VBatrun[0] = batFRun;
                VBatbowl[0] = batFBall;
                VBatfour[0] = batFFour;
                VBatsix[0] = batFSix;
                VBatSR[0] = batFSR;
                break;
            }
            case 1: {
                VBatrun[1] = batFRun;
                VBatbowl[1] = batFBall;
                VBatfour[1] = batFFour;
                VBatsix[1] = batFSix;
                VBatSR[1] = batFSR;
                break;
            }
            case 2: {
                VBatrun[2] = batFRun;
                VBatbowl[2] = batFBall;
                VBatfour[2] = batFFour;
                VBatsix[2] = batFSix;
                VBatSR[2] = batFSR;
                break;
            }
            case 3: {
                VBatrun[3] = batFRun;
                VBatbowl[3] = batFBall;
                VBatfour[3] = batFFour;
                VBatsix[3] = batFSix;
                VBatSR[3] = batFSR;
                break;
            }
            case 4: {
                VBatrun[4] = batFRun;
                VBatbowl[4] = batFBall;
                VBatfour[4] = batFFour;
                VBatsix[4] = batFSix;
                VBatSR[4] = batFSR;
                break;
            }
            case 5: {
                VBatrun[5] = batFRun;
                VBatbowl[5] = batFBall;
                VBatfour[5] = batFFour;
                VBatsix[5] = batFSix;
                VBatSR[5] = batFSR;
                break;
            }
            case 6: {
                VBatrun[6] = batFRun;
                VBatbowl[6] = batFBall;
                VBatfour[6] = batFFour;
                VBatsix[6] = batFSix;
                VBatSR[6] = batFSR;
                break;
            }
            case 7: {
                VBatrun[7] = batFRun;
                VBatbowl[7] = batFBall;
                VBatfour[7] = batFFour;
                VBatsix[7] = batFSix;
                VBatSR[7] = batFSR;
                break;
            }
            case 8: {
                VBatrun[8] = batFRun;
                VBatbowl[8] = batFBall;
                VBatfour[8] = batFFour;
                VBatsix[8] = batFSix;
                VBatSR[8] = batFSR;
                break;
            }
            case 9: {
                VBatrun[9] = batFRun;
                VBatbowl[9] = batFBall;
                VBatfour[9] = batFFour;
                VBatsix[9] = batFSix;
                VBatSR[9] = batFSR;
                break;
            }
            case 10: {
                VBatrun[10] = batFRun;
                VBatbowl[10] = batFBall;
                VBatfour[10] = batFFour;
                VBatsix[10] = batFSix;
                VBatSR[10] = batFSR;
                break;
            }

        }
        switch (strikey) {
            case 0: {
                VBatrun[0] = batSRun;
                VBatbowl[0] = batSBall;
                VBatfour[0] = batSFour;
                VBatsix[0] = batSSix;
                VBatSR[0] = batSSR;
                break;
            }
            case 1: {
                VBatrun[1] = batSRun;
                VBatbowl[1] = batSBall;
                VBatfour[1] = batSFour;
                VBatsix[1] = batSSix;
                VBatSR[1] = batSSR;
                break;
            }
            case 2: {
                VBatrun[2] = batSRun;
                VBatbowl[2] = batSBall;
                VBatfour[2] = batSFour;
                VBatsix[2] = batSSix;
                VBatSR[2] = batSSR;
                 break;
            }
            case 3: {
                VBatrun[3] = batSRun;
                VBatbowl[3] = batSBall;
                VBatfour[3] = batSFour;
                VBatsix[3] = batSSix;
                VBatSR[3] = batSSR;
                break;
            }
            case 4: {
                VBatrun[4] = batSRun;
                VBatbowl[4] = batSBall;
                VBatfour[4] = batSFour;
                VBatsix[4] = batSSix;
                VBatSR[4] = batSSR;
                break;
            }
            case 5: {
                VBatrun[5] = batSRun;
                VBatbowl[5] = batSBall;
                VBatfour[5] = batSFour;
                VBatsix[5] = batSSix;
                VBatSR[5] = batSSR;
                break;
            }
            case 6: {
                VBatrun[6] = batSRun;
                VBatbowl[6] = batSBall;
                VBatfour[6] = batSFour;
                VBatsix[6] = batSSix;
                VBatSR[6] = batSSR;
                break;
            }
            case 7: {
                VBatrun[7] = batSRun;
                VBatbowl[7] = batSBall;
                VBatfour[7] = batSFour;
                VBatsix[7] = batSSix;
                VBatSR[7] = batSSR;
                break;
            }
            case 8: {
                VBatrun[8] = batSRun;
                VBatbowl[8] = batSBall;
                VBatfour[8] = batSFour;
                VBatsix[8] = batSSix;
                VBatSR[8] = batSSR;
                break;
            }
            case 9: {
                VBatrun[9] = batSRun;
                VBatbowl[9] = batSBall;
                VBatfour[9] = batSFour;
                VBatsix[9] = batSSix;
                VBatSR[9] = batSSR;
                break;
            }
            case 10: {
                VBatrun[10] = batSRun;
                VBatbowl[10] = batSBall;
                VBatfour[10] = batSFour;
                VBatsix[10] = batSSix;
                VBatSR[10] = batSSR;
                break;
            }
           
        }
        UpdateRDPlayerStats();
    }

    public void UpdateBowlerStats()
    {
        if(inning==1){UpdateBowlerStatI1();}
        else if(inning==2){UpdateBowlerStatI2();}
    }
    public void UpdateBowlerStatI1()
    {

        switch (strikez) {
            case 0: {
                VBowlrun[0] = bowlrun;
                VBowlovers[0] = bowlover;
                VBowlWickets[0] = bowlwicket;
                VBowlmaidens[0] = bowlmaiden;
                VBowlER[0] = bowlER;
                break;
            }
            case 1: {
                VBowlrun[1] = bowlrun;
                VBowlovers[1] = bowlover;
                VBowlWickets[1] = bowlmaiden;
                VBowlmaidens[1] = bowlmaiden;
                VBowlER[1] = bowlER;
                break;
            }
            case 2: {
                VBowlrun[2] = bowlrun;
                VBowlovers[2] = bowlover;
                VBowlWickets[2] = bowlmaiden;
                VBowlmaidens[2] = bowlmaiden;
                VBowlER[2] = bowlER;
                break;
            }
            case 3: {
                VBowlrun[3] = bowlrun;
                VBowlovers[3] = bowlover;
                VBowlWickets[3] = bowlmaiden;
                VBowlmaidens[3] = bowlmaiden;
                VBowlER[3] = bowlER;
                break;
            }
            case 4: {
                VBowlrun[4] = bowlrun;
                VBowlovers[4] = bowlover;
                VBowlWickets[4] = bowlmaiden;
                VBowlmaidens[4] = bowlmaiden;
                VBowlER[4] = bowlER;
                break;
            }
            case 5: {
                VBowlrun[5] = bowlrun;
                VBowlovers[5] = bowlover;
                VBowlWickets[5] = bowlmaiden;
                VBowlmaidens[5] = bowlmaiden;
                VBowlER[5] = bowlER;
                break;
            }
            case 6: {
                VBowlrun[6] = bowlrun;
                VBowlovers[6] = bowlover;
                VBowlWickets[6] = bowlmaiden;
                VBowlmaidens[6] = bowlmaiden;
                VBowlER[6] = bowlER;
                break;
            }
            case 7: {
                VBowlrun[7] = bowlrun;
                VBowlovers[7] = bowlover;
                VBowlWickets[7] = bowlmaiden;
                VBowlmaidens[7] = bowlmaiden;
                VBowlER[7] = bowlER;
                break;
            }
            case 8: {
                VBowlrun[8] = bowlrun;
                VBowlovers[8] = bowlover;
                VBowlWickets[8] = bowlmaiden;
                VBowlmaidens[8] = bowlmaiden;
                VBowlER[8] = bowlER;
                break;
            }
            case 9: {
                VBowlrun[9] = bowlrun;
                VBowlovers[9] = bowlover;
                VBowlWickets[9] = bowlmaiden;
                VBowlmaidens[9] = bowlmaiden;
                VBowlER[9] = bowlER;
                break;
            }
            case 10: {
                VBowlrun[10] = bowlrun;
                VBowlovers[10] = bowlover;
                VBowlWickets[10] = bowlmaiden;
                VBowlmaidens[10] = bowlmaiden;
                VBowlER[10] = bowlER;
                break;
            }
        }
        UpdateRDPlayerStats();

    }
    public void UpdateBowlerStatI2()
    {
        switch (strikez) {
            case 0: {
                HBowlrun[0] = bowlrun;
                HBowlovers[0] = bowlover;
                HBowlWickets[0] = bowlwicket;
                HBowlmaidens[0] = bowlmaiden;
                HBowlER[0] = bowlER;
                break;
            }
            case 1: {
                HBowlrun[1] = bowlrun;
                HBowlovers[1] = bowlover;
                HBowlWickets[1] = bowlmaiden;
                HBowlmaidens[1] = bowlmaiden;
                HBowlER[1] = bowlER;
                break;
            }
            case 2: {
                HBowlrun[2] = bowlrun;
                HBowlovers[2] = bowlover;
                HBowlWickets[2] = bowlmaiden;
                HBowlmaidens[2] = bowlmaiden;
                HBowlER[2] = bowlER;
                break;
            }
            case 3: {
                HBowlrun[3] = bowlrun;
                HBowlovers[3] = bowlover;
                HBowlWickets[3] = bowlmaiden;
                HBowlmaidens[3] = bowlmaiden;
                HBowlER[3] = bowlER;
                break;
            }
            case 4: {
                HBowlrun[4] = bowlrun;
                HBowlovers[4] = bowlover;
                HBowlWickets[4] = bowlmaiden;
                HBowlmaidens[4] = bowlmaiden;
                HBowlER[4] = bowlER;
                break;
            }
            case 5: {
                HBowlrun[5] = bowlrun;
                HBowlovers[5] = bowlover;
                HBowlWickets[5] = bowlmaiden;
                HBowlmaidens[5] = bowlmaiden;
                HBowlER[5] = bowlER;
                break;
            }
            case 6: {
                HBowlrun[6] = bowlrun;
                HBowlovers[6] = bowlover;
                HBowlWickets[6] = bowlmaiden;
                HBowlmaidens[6] = bowlmaiden;
                HBowlER[6] = bowlER;
                break;
            }
            case 7: {
                HBowlrun[7] = bowlrun;
                HBowlovers[7] = bowlover;
                HBowlWickets[7] = bowlmaiden;
                HBowlmaidens[7] = bowlmaiden;
                HBowlER[7] = bowlER;
                break;
            }
            case 8: {
                HBowlrun[8] = bowlrun;
                HBowlovers[8] = bowlover;
                HBowlWickets[8] = bowlmaiden;
                HBowlmaidens[8] = bowlmaiden;
                HBowlER[8] = bowlER;
                break;
            }
            case 9: {
                HBowlrun[9] = bowlrun;
                HBowlovers[9] = bowlover;
                HBowlWickets[9] = bowlmaiden;
                HBowlmaidens[9] = bowlmaiden;
                HBowlER[9] = bowlER;
                break;
            }
            case 10: {
                HBowlrun[10] = bowlrun;
                HBowlovers[10] = bowlover;
                HBowlWickets[10] = bowlmaiden;
                HBowlmaidens[10] = bowlmaiden;
                HBowlER[10] = bowlER;
                break;
            }
        }
        UpdateRDPlayerStats();
    }

    public int GetBowlerStats()
    {
        if(inning==1){GetBowlerStatI1();}
        else if(inning==2){GetBowlerStatI2();}
        return 0;
    }
    public void GetBowlerStatI1()
    {
        switch (strikez2) {
            case 0: {
                bowlrun=VBowlrun[0];
                bowlover=VBowlovers[0];
                bowlwicket=VBowlWickets[0];
                bowlmaiden=VBowlmaidens[0];
                bowlER=VBowlER[0];
                break;
            }
            case 1: {
                bowlrun=VBowlrun[1];
                bowlover=VBowlovers[1];
                bowlmaiden=VBowlWickets[1];
                bowlmaiden=VBowlmaidens[1];
                bowlER=VBowlER[1];
                 break;
            }
            case 2: {
                bowlrun=VBowlrun[2];
                bowlover=VBowlovers[2];
                bowlmaiden=VBowlWickets[2];
                bowlmaiden=VBowlmaidens[2];
                bowlER=VBowlER[2];
                break;
            }
            case 3: {
                bowlrun=VBowlrun[3];
                bowlover=VBowlovers[3];
                bowlmaiden=VBowlWickets[3];
                bowlmaiden=VBowlmaidens[3];
                bowlER=VBowlER[3];
                break;
            }
            case 4: {
                bowlrun=VBowlrun[4];
                bowlover=VBowlovers[4];
                bowlmaiden=VBowlWickets[4];
                bowlmaiden=VBowlmaidens[4];
                bowlER=VBowlER[4];
                break;
            }
            case 5: {
                bowlrun=VBowlrun[5];
                bowlover=VBowlovers[5];
                bowlmaiden=VBowlWickets[5];
                bowlmaiden=VBowlmaidens[5];
                bowlER=VBowlER[5];
                break;
            }
            case 6: {
                bowlrun=VBowlrun[6];
                bowlover=VBowlovers[6];
                bowlmaiden=VBowlWickets[6];
                bowlmaiden=VBowlmaidens[6];
                bowlER=VBowlER[6];
                break;
            }
            case 7: {
                bowlrun=VBowlrun[7];
                bowlover=VBowlovers[7];
                bowlmaiden=VBowlWickets[7];
                bowlmaiden=VBowlmaidens[7];
                bowlER=VBowlER[7];
                break;
            }
            case 8: {
                bowlrun=VBowlrun[8];
                bowlover=VBowlovers[8];
                bowlmaiden=VBowlWickets[8];
                bowlmaiden=VBowlmaidens[8];
                bowlER=VBowlER[8];
                break;
            }
            case 9: {
                bowlrun=VBowlrun[9];
                bowlover=VBowlovers[9];
                bowlmaiden=VBowlWickets[9];
                bowlmaiden=VBowlmaidens[9];
                bowlER=VBowlER[9];
                break;
            }
            case 10: {
                bowlrun=VBowlrun[10];
                bowlover=VBowlovers[10];
                bowlmaiden=VBowlWickets[10];
                bowlmaiden=VBowlmaidens[10];
                bowlER=VBowlER[10];
                break;
            }
        }

    }
    public void GetBowlerStatI2()
    {
        switch (strikez) {
            case 0: {
                bowlrun= HBowlrun[0];
                bowlover=HBowlovers[0];
                bowlwicket=HBowlWickets[0];
                bowlmaiden=HBowlmaidens[0];
                bowlER=HBowlER[0];
                break;
            }
            case 1: {
                bowlrun=HBowlrun[1];
                bowlover=HBowlovers[1];
                bowlmaiden=HBowlWickets[1];
                bowlmaiden=HBowlmaidens[1];
                bowlER=HBowlER[1];
                break;
            }
            case 2: {
                bowlrun=HBowlrun[2];
                bowlover=HBowlovers[2];
                bowlmaiden=HBowlWickets[2];
                bowlmaiden=HBowlmaidens[2];
                bowlER=HBowlER[2];
                break;
            }
            case 3: {
                bowlrun=HBowlrun[3];
                bowlover=HBowlovers[3];
                bowlmaiden=HBowlWickets[3];
                bowlmaiden=HBowlmaidens[3];
                bowlER=HBowlER[3];
                break;
            }
            case 4: {
                bowlrun=HBowlrun[4];
                bowlover=HBowlovers[4];
                bowlmaiden=HBowlWickets[4];
                bowlmaiden=HBowlmaidens[4];
                bowlER=HBowlER[4];
                break;
            }
            case 5: {
                bowlrun=HBowlrun[5];
                bowlover=HBowlovers[5];
                bowlmaiden=HBowlWickets[5];
                bowlmaiden=HBowlmaidens[5];
                bowlER=HBowlER[5];
                break;
            }
            case 6: {
                bowlrun=HBowlrun[6];
                bowlover=HBowlovers[6];
                bowlmaiden=HBowlWickets[6];
                bowlmaiden=HBowlmaidens[6];
                bowlER=HBowlER[6];
                break;
            }
            case 7: {
                bowlrun=HBowlrun[7];
                bowlover=HBowlovers[7];
                bowlmaiden=HBowlWickets[7];
                bowlmaiden=HBowlmaidens[7];
                bowlER=HBowlER[7];
                break;
            }
            case 8: {
                bowlrun=HBowlrun[8];
                bowlover=HBowlovers[8];
                bowlmaiden=HBowlWickets[8];
                bowlmaiden=HBowlmaidens[8];
                bowlER=HBowlER[8];
                break;
            }
            case 9: {
                bowlrun=HBowlrun[9];
                bowlover=HBowlovers[9];
                bowlmaiden=HBowlWickets[9];
                bowlmaiden=HBowlmaidens[9];
                bowlER=HBowlER[9];
                break;
            }
            case 10: {
                bowlrun=HBowlrun[10];
                bowlover=HBowlovers[10];
                bowlmaiden=HBowlWickets[10];
                bowlmaiden=HBowlmaidens[10];
                bowlER=HBowlER[10];
                break;
            }
        }
    }
    
}


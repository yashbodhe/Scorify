package com.example.cricify;

import java.util.ArrayList;

public class RealDatabase {
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
    private int run;
    private double over;
    private int   wicket;
    private double crr;
    private int batFRun;
    private int batSRun;
    private int batFBall;
    private int batSBall;
    private int batFSix;
    private int batSSix;
    private int batFFour;
    private int batSFour;
    private double batFSR;
    private double batSSR;
    private int bowlrun;
    private int bowlwicket;
    private int bowlmaiden;
    private double bowlover;
    private double bowlER;
    private String strike;
    private String nstrike;
    private int pshipr;
    private int pshipb;
    private int inning;
    private String toss;
    private String opted;
    

    ArrayList<Integer> HBatrun = new ArrayList<Integer>(11);
    ArrayList<Integer> HBatbowl = new ArrayList<Integer>(11);
    ArrayList<Integer> HBatsix = new ArrayList<Integer>(11);
    ArrayList<Integer> HBatfour= new ArrayList<Integer>(11);
    ArrayList<Double> HBatSR = new ArrayList<Double>(11);
    ArrayList<Integer> HBowlrun = new ArrayList<Integer>(11);
    ArrayList<Integer> HBowlWickets = new ArrayList<Integer>(11);
    ArrayList<Integer> HBowlmaidens = new ArrayList<Integer>(11);
    ArrayList<Double> HBowlovers = new ArrayList<Double>(11);
    ArrayList<Double> HBowlER = new ArrayList<Double>(11);
    ArrayList<Integer> VBatrun = new ArrayList<Integer>(11);
    ArrayList<Integer> VBatbowl = new ArrayList<Integer>(11);
    ArrayList<Integer> VBatsix = new ArrayList<Integer>(11);
    ArrayList<Integer> VBatfour= new ArrayList<Integer>(11);
    ArrayList<Double> VBatSR = new ArrayList<Double>(11);
    ArrayList<Integer> VBowlrun = new ArrayList<Integer>(11);
    ArrayList<Integer> VBowlWickets = new ArrayList<Integer>(11);
    ArrayList<Integer> VBowlmaidens = new ArrayList<Integer>(11);
    ArrayList<Double> VBowlovers = new ArrayList<Double>(11);
    ArrayList<Double> VBowlER = new ArrayList<Double>(11);
    
    

    

    public String getToss() {
        return toss;
    }

    public void setToss(String toss) {
        this.toss = toss;
    }

    public String getOpted() {
        return opted;
    }

    public void setOpted(String opted) {
        this.opted = opted;
    }

    public String getTeamname() {
        return Teamname;
    }

    public void setTeamname(String teamname) {
        Teamname = teamname;
    }

    public String getBatsmenname1() {
        return Batsmenname1;
    }

    public void setBatsmenname1(String batsmenname1) {
        Batsmenname1 = batsmenname1;
    }

    public String getBatsmenname2() {
        return Batsmenname2;
    }

    public void setBatsmenname2(String batsmenname2) {
        Batsmenname2 = batsmenname2;
    }

    public String getBowlername() {
        return Bowlername;
    }

    public void setBowlername(String bowlername) {
        Bowlername = bowlername;
    }

    public String getThisOver1() {
        return ThisOver1;
    }

    public void setThisOver1(String thisOver1) {
        ThisOver1 = thisOver1;
    }

    public String getThisOver2() {
        return ThisOver2;
    }

    public void setThisOver2(String thisOver2) {
        ThisOver2 = thisOver2;
    }

    public String getThisOver3() {
        return ThisOver3;
    }

    public void setThisOver3(String thisOver3) {
        ThisOver3 = thisOver3;
    }

    public String getThisOver4() {
        return ThisOver4;
    }

    public void setThisOver4(String thisOver4) {
        ThisOver4 = thisOver4;
    }

    public String getThisOver5() {
        return ThisOver5;
    }

    public void setThisOver5(String thisOver5) {
        ThisOver5 = thisOver5;
    }

    public String getThisOver6() {
        return ThisOver6;
    }

    public void setThisOver6(String thisOver6) {
        ThisOver6 = thisOver6;
    }

    public String getThisOver7() {
        return ThisOver7;
    }

    public void setThisOver7(String thisOver7) {
        ThisOver7 = thisOver7;
    }

    public String getThisOver8() {
        return ThisOver8;
    }

    public void setThisOver8(String thisOver8) {
        ThisOver8 = thisOver8;
    }

    public String getThisOver9() {
        return ThisOver9;
    }

    public void setThisOver9(String thisOver9) {
        ThisOver9 = thisOver9;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public double getOver() {
        return over;
    }

    public void setOver(double over) {
        this.over = over;
    }

    public int getWicket() {
        return wicket;
    }

    public void setWicket(int wicket) {
        this.wicket = wicket;
    }

    public double getCrr() {
        return crr;
    }

    public void setCrr(double crr) {
        this.crr = crr;
    }

    public int getBatFRun() {
        return batFRun;
    }

    public void setBatFRun(int batFRun) {
        this.batFRun = batFRun;
    }

    public int getBatSRun() {
        return batSRun;
    }

    public void setBatSRun(int batSRun) {
        this.batSRun = batSRun;
    }

    public int getBatFBall() {
        return batFBall;
    }

    public void setBatFBall(int batFBall) {
        this.batFBall = batFBall;
    }

    public int getBatSBall() {
        return batSBall;
    }

    public void setBatSBall(int batSBall) {
        this.batSBall = batSBall;
    }

    public int getBatFSix() {
        return batFSix;
    }

    public void setBatFSix(int batFSix) {
        this.batFSix = batFSix;
    }

    public int getBatSSix() {
        return batSSix;
    }

    public void setBatSSix(int batSSix) {
        this.batSSix = batSSix;
    }

    public int getBatFFour() {
        return batFFour;
    }

    public void setBatFFour(int batFFour) {
        this.batFFour = batFFour;
    }

    public int getBatSFour() {
        return batSFour;
    }

    public void setBatSFour(int batSFour) {
        this.batSFour = batSFour;
    }

    public double getBatFSR() {
        return batFSR;
    }

    public void setBatFSR(double batFSR) {
        this.batFSR = batFSR;
    }

    public double getBatSSR() {
        return batSSR;
    }

    public void setBatSSR(double batSSR) {
        this.batSSR = batSSR;
    }

    public int getBowlrun() {
        return bowlrun;
    }

    public void setBowlrun(int bowlrun) {
        this.bowlrun = bowlrun;
    }

    public int getBowlwicket() {
        return bowlwicket;
    }

    public void setBowlwicket(int bowlwicket) {
        this.bowlwicket = bowlwicket;
    }

    public int getBowlmaiden() {
        return bowlmaiden;
    }

    public void setBowlmaiden(int bowlmaiden) {
        this.bowlmaiden = bowlmaiden;
    }

    public double getBowlover() {
        return bowlover;
    }

    public void setBowlover(double bowlover) {
        this.bowlover = bowlover;
    }

    public double getBowlER() {
        return bowlER;
    }

    public void setBowlER(double bowlER) {
        this.bowlER = bowlER;
    }

    public String getStrike() {
        return strike;
    }

    public void setStrike(String strike) {
        this.strike = strike;
    }

    public String getNstrike() {
        return nstrike;
    }

    public void setNstrike(String nstrike) {
        this.nstrike = nstrike;
    }

    public int getPshipr() {
        return pshipr;
    }

    public void setPshipr(int pshipr) {
        this.pshipr = pshipr;
    }

    public int getPshipb() {
        return pshipb;
    }

    public void setPshipb(int pshipb) {
        this.pshipb = pshipb;
    }

    public int getInning() {
        return inning;
    }

    public void setInning(int inning) {
        this.inning = inning;
    }

    public ArrayList<Integer> getHBatrun() {
        return HBatrun;
    }

    public void setHBatrun(ArrayList<Integer> HBatrun) {
        this.HBatrun = HBatrun;
    }

    public ArrayList<Integer> getHBatbowl() {
        return HBatbowl;
    }

    public void setHBatbowl(ArrayList<Integer> HBatbowl) {
        this.HBatbowl = HBatbowl;
    }

    public ArrayList<Integer> getHBatsix() {
        return HBatsix;
    }

    public void setHBatsix(ArrayList<Integer> HBatsix) {
        this.HBatsix = HBatsix;
    }

    public ArrayList<Integer> getHBatfour() {
        return HBatfour;
    }

    public void setHBatfour(ArrayList<Integer> HBatfour) {
        this.HBatfour = HBatfour;
    }



    public ArrayList<Integer> getHBowlrun() {
        return HBowlrun;
    }

    public void setHBowlrun(ArrayList<Integer> HBowlrun) {
        this.HBowlrun = HBowlrun;
    }

    public ArrayList<Integer> getHBowlWickets() {
        return HBowlWickets;
    }

    public void setHBowlWickets(ArrayList<Integer> HBowlWickets) {
        this.HBowlWickets = HBowlWickets;
    }

    public ArrayList<Integer> getHBowlmaidens() {
        return HBowlmaidens;
    }

    public void setHBowlmaidens(ArrayList<Integer> HBowlmaidens) {
        this.HBowlmaidens = HBowlmaidens;
    }



    public ArrayList<Integer> getVBatrun() {
        return VBatrun;
    }

    public void setVBatrun(ArrayList<Integer> VBatrun) {
        this.VBatrun = VBatrun;
    }

    public ArrayList<Integer> getVBatbowl() {
        return VBatbowl;
    }

    public void setVBatbowl(ArrayList<Integer> VBatbowl) {
        this.VBatbowl = VBatbowl;
    }

    public ArrayList<Integer> getVBatsix() {
        return VBatsix;
    }

    public void setVBatsix(ArrayList<Integer> VBatsix) {
        this.VBatsix = VBatsix;
    }

    public ArrayList<Integer> getVBatfour() {
        return VBatfour;
    }

    public void setVBatfour(ArrayList<Integer> VBatfour) {
        this.VBatfour = VBatfour;
    }



    public ArrayList<Integer> getVBowlrun() {
        return VBowlrun;
    }

    public void setVBowlrun(ArrayList<Integer> VBowlrun) {
        this.VBowlrun = VBowlrun;
    }

    public ArrayList<Integer> getVBowlWickets() {
        return VBowlWickets;
    }

    public void setVBowlWickets(ArrayList<Integer> VBowlWickets) {
        this.VBowlWickets = VBowlWickets;
    }

    public ArrayList<Integer> getVBowlmaidens() {
        return VBowlmaidens;
    }

    public void setVBowlmaidens(ArrayList<Integer> VBowlmaidens) {
        this.VBowlmaidens = VBowlmaidens;
    }

    public ArrayList<Double> getHBatSR() {
        return HBatSR;
    }

    public void setHBatSR(ArrayList<Double> HBatSR) {
        this.HBatSR = HBatSR;
    }

    public ArrayList<Double> getHBowlovers() {
        return HBowlovers;
    }

    public void setHBowlovers(ArrayList<Double> HBowlovers) {
        this.HBowlovers = HBowlovers;
    }

    public ArrayList<Double> getHBowlER() {
        return HBowlER;
    }

    public void setHBowlER(ArrayList<Double> HBowlER) {
        this.HBowlER = HBowlER;
    }

    public ArrayList<Double> getVBatSR() {
        return VBatSR;
    }

    public void setVBatSR(ArrayList<Double> VBatSR) {
        this.VBatSR = VBatSR;
    }

    public ArrayList<Double> getVBowlovers() {
        return VBowlovers;
    }

    public void setVBowlovers(ArrayList<Double> VBowlovers) {
        this.VBowlovers = VBowlovers;
    }

    public ArrayList<Double> getVBowlER() {
        return VBowlER;
    }

    public void setVBowlER(ArrayList<Double> VBowlER) {
        this.VBowlER = VBowlER;
    }

    public RealDatabase() {
    }
}

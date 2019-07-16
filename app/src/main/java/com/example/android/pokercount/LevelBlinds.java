package com.example.android.pokercount;

public class LevelBlinds {

    private int mSmallBlind;
    private int mBigBlind;
    private int mAnte;

    public LevelBlinds (int sb, int bb, int ante) {
        mSmallBlind = sb;
        mBigBlind = bb;
        mAnte = ante;
    }

    public int getSmallBlind (){
        return mSmallBlind;
    }

    public int getBigBlind (){
        return mBigBlind;
    }

    public int getAnte (){
        return mAnte;
    }

    public void setSmallBlind (int newsb){
        mSmallBlind = newsb;
        return;
    }

    public void setBigBlind (int newbb){
        mBigBlind = newbb;
        return;
    }

    public void setAnte (int newAnte){
        mAnte = newAnte;
        return;
    }

}

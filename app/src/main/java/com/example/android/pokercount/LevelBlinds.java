package com.example.android.pokercount;


import android.os.Parcel;
import android.os.Parcelable;

public class LevelBlinds implements Parcelable {

    private int mSmallBlind;
    private int mBigBlind;
    private int mAnte;

    public LevelBlinds (int sb, int bb, int ante) {
        mSmallBlind = sb;
        mBigBlind = bb;
        mAnte = ante;
    }

    public LevelBlinds (Parcel parcel) {
        mSmallBlind = parcel.readInt();
        mBigBlind = parcel.readInt();
        mAnte = parcel.readInt();
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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mSmallBlind);
        parcel.writeInt(mBigBlind);
        parcel.writeInt(mAnte);
    }

    public static final Parcelable.Creator<LevelBlinds> CREATOR = new Parcelable.Creator<LevelBlinds>(){
        @Override
        public LevelBlinds createFromParcel(Parcel parcel) {
            return new LevelBlinds(parcel);
        }

        @Override
        public LevelBlinds[] newArray(int i) {
            return new LevelBlinds[i];
        }
    };

}

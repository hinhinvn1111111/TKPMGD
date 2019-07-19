package com.ute.dn.speaknow.adapters;

public class ItemDemo {
    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    private int mImage;
    private String mName;
    private String mID;

    public String getmID() {
        return mID;
    }

    public void setmID(String mID) {
        this.mID = mID;
    }

    public ItemDemo(int img, String name,String id){
        this.mImage=img;
        this.mName=name;
        this.mID=id;
    }
}

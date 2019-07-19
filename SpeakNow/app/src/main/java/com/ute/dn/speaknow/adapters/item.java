package com.ute.dn.speaknow.adapters;

public class item {

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

    public item(int img,String name){
        this.mImage=img;
        this.mName=name;
    }

}

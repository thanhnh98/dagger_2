package com.thanh.testdagger2.Model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;


public class RightWing{
    private int count;

    public String getRightX() {
        return rightX;
    }

    public void setRightX(String rightX) {
        this.rightX = rightX;
    }

    private String rightX;
    @Inject
    public RightWing(@Named("count_right") int count){

        this.count = count;
    }
    void flap(){
        Log.e("RightWing","flapping..."+this.rightX+"-"+count+" lần");
    }


}

package com.thanh.testdagger2.Model;

import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;


public class LeftWing{
     int count;

    public String getLeftX() {
        return LeftX;
    }

    public void setLeftX(String leftX) {
        LeftX = leftX;
    }

    private String LeftX;
    @Inject
    public LeftWing(@Named("count_left")int count){

        this.count = count;
    }
    void flap(){
        Log.e("LeftWing","flapping..."+getLeftX() +" - "+count+" lần");
    }

}

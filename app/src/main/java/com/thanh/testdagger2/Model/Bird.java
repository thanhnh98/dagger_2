package com.thanh.testdagger2.Model;

import android.os.Message;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Bird {
    private Wings wings;
    @Inject
    public Bird(Wings wings){
        this.wings = wings;
        Log.e("Constructor","OK");
    }
    public void flapByLeftWing(){
        wings.FlapByLeftWing();
        Log.e("code",this.toString()+" Left: "+wings.getLeftWing()+"---"+"Right: "+wings.getRightWing());
    }
    @Inject
    public void flapByRightWing(){
        wings.FlapByRighttWing();
        Log.e("code",this.toString()+" Left: "+wings.getLeftWing()+"---"+"Right: "+wings.getRightWing());

    }
//    @Inject
//    public void sendLetter(Letter message){
//        Log.e("Send letter",message.getContent());
//    }

}

package com.thanh.testdagger2.dagger;

import android.os.Message;
import android.util.Log;

import com.thanh.testdagger2.Model.LeftWing;
import com.thanh.testdagger2.Model.Letter;
import com.thanh.testdagger2.Model.RightWing;
import com.thanh.testdagger2.Model.Wings;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

@Module
public  class WingModule {


    //    @Binds
//     abstract Wings providesLeftWing(LeftWing leftWing);
//    @Binds
//    abstract Wings providesWing(Wings wing);
    @Provides
    Wings providesWing(LeftWing leftWing,RightWing rightWing){
        return new Wings(leftWing,rightWing);
    }
//    @Provides
//    LeftWing providesLeftWing(){
//        return new LeftWing(count);
//    }
//    @Provides
//    RightWing providesRightWing(){
//        RightWing wing=new RightWing();
//        wing.setRightX("Rai");
//        return wing;
//    }
}

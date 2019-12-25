package com.thanh.testdagger2;

import android.app.Application;

import com.thanh.testdagger2.Model.Bird;
import com.thanh.testdagger2.dagger.BirdComponent;
import com.thanh.testdagger2.dagger.DaggerBirdComponent;

public class MainApplication extends Application {
    private BirdComponent component;
    @Override
    public void onCreate() {
        super.onCreate();
        component= DaggerBirdComponent.builder().setCountLeft(100).setCountRight(200).build();
    }
    public BirdComponent getComponent(){
        return component;
    }
}

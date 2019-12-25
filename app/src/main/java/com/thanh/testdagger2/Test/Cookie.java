package com.thanh.testdagger2.Test;

import android.util.Log;

import javax.inject.Inject;

public class Cookie {


    private Oreo mOreo;
    @Inject
    public Cookie(Oreo mOreo){
        this.mOreo = mOreo;
    }
    @Inject
    public void finish(){
        Log.d("Cookie","finished");
    }
    //
}

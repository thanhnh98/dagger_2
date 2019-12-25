package com.thanh.testdagger2.Model;

import javax.inject.Inject;
import javax.inject.Singleton;

public class Wings {

    private final LeftWing leftWing;
    private final RightWing rightWing;
    @Inject
    public Wings(LeftWing leftWing, RightWing rightWing){

        this.leftWing = leftWing;
        this.rightWing = rightWing;
    }
    public void FlapByLeftWing(){
        leftWing.flap();
    }
    public void FlapByRighttWing(){
        rightWing.flap();
    }
    public LeftWing getLeftWing() {
        return leftWing;
    }

    public RightWing getRightWing() {
        return rightWing;
    }
//     void Flap();

}

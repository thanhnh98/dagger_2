package com.thanh.testdagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.thanh.testdagger2.Model.Bird;
import com.thanh.testdagger2.dagger.BirdComponent;
import com.thanh.testdagger2.dagger.DaggerBirdComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Bird bird;
    @Inject
    Bird bird1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_left=findViewById(R.id.btn_left);
        Button btn_right=findViewById(R.id.btn_right);
        BirdComponent component= ((MainApplication)getApplication()).getComponent();
        component.inject(this);

        btn_left.setOnClickListener(v->{
            bird.flapByLeftWing();
        });
        btn_right.setOnClickListener(v->{
            bird.flapByRightWing();
        });
    }
}

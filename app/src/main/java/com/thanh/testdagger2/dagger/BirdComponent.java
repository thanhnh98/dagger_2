package com.thanh.testdagger2.dagger;

import com.thanh.testdagger2.MainActivity;
import com.thanh.testdagger2.Model.Bird;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {WingModule.class})
public interface BirdComponent {
    Bird getBird();
    void inject(MainActivity activity);
    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder setCountLeft(@Named("count_left") int count);
        @BindsInstance
        Builder setCountRight(@Named("count_right") int count);

        BirdComponent build();
    }
}

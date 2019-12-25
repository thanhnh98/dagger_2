package com.thanh.testdagger2.Test;

import dagger.Component;

@Component(modules = {CookieModule.class})
public interface CookieComponent {
    Cookie getCookie();
    void inject(CookieActivity activity);
}

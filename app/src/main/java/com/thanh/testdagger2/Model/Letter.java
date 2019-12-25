package com.thanh.testdagger2.Model;

import javax.inject.Inject;

public class Letter {

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String content;
    @Inject
    public Letter(){
        this.content="Content of letter";
    }
}

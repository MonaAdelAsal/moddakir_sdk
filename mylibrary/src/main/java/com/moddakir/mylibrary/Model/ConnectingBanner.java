package com.moddakir.mylibrary.Model;

import java.io.Serializable;

public class ConnectingBanner implements Serializable {

    private String url;

    private String title;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
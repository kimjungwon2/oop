package org.example.chapter5;

public class HttpClient {

    String url;

    public void connect(String url){
        this.url = url;
    }

    public String getResponse() {
        return this.url;
    }
}

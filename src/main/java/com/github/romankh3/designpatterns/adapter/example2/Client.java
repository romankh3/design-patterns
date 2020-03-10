package com.github.romankh3.designpatterns.adapter.example2;

public class Client {

    private ITarget target;

    public Client(ITarget target) {
        this.target = target;
    }

    public String doSmth(String request) {
        return target.request(request);
    }
}

package com.github.romankh3.designpatterns.bridge;

public abstract class View {

    private IResource resource;

    public View(IResource resource) {
        this.resource = resource;
    }

    public abstract String show();

    public IResource getResource() {
        return resource;
    }

    public void setResource(IResource resource) {
        this.resource = resource;
    }
}

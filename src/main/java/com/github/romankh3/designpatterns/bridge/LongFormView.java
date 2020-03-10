package com.github.romankh3.designpatterns.bridge;

public class LongFormView extends View {

    public LongFormView(IResource resource) {
        super(resource);
    }

    @Override
    public String show() {
        return getResource().snippet();
    }
}

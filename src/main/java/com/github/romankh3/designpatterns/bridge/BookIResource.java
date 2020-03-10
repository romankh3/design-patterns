package com.github.romankh3.designpatterns.bridge;

public class BookIResource implements IResource {

    private Book book;

    public BookIResource(Book book) {
        this.book = book;
    }

    @Override
    public String snippet() {
        return book.getDescription();
    }

    @Override
    public String image() {
        return book.getImage();
    }

    @Override
    public String title() {
        return book.getTitle();
    }

    @Override
    public String url() {
        return book.getUrl();
    }
}

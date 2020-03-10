package com.github.romankh3.designpatterns.bridge;

public class ArtistResource implements IResource {

    private Artist artist;

    public ArtistResource(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String snippet() {
        return artist.getBio();
    }

    @Override
    public String image() {
        return artist.getImage();
    }

    @Override
    public String title() {
        return artist.getFirstName() + " " + artist.getLastName();
    }

    @Override
    public String url() {
        return artist.getUrlPage();
    }
}

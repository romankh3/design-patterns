package com.github.romankh3.designpatterns.bridge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BridgeTest {

    @Test
    public void shouldProperlyWorkBridgeLongFormArtist() {
        //when
        Artist artist = new Artist();
        artist.setBio("test BIO");
        View longFormViewArtistResource = new LongFormView(new ArtistResource(artist));

        //then
        Assertions.assertEquals(artist.getBio(), longFormViewArtistResource.show());
    }

    @Test
    public void shouldProperlyWorkBridgeLongFormBook() {
        //when
        Book book = new Book();
        View longFormViewArtistResource = new LongFormView(new BookIResource(book));

        //then
        Assertions.assertEquals(book.getDescription(), longFormViewArtistResource.show());
    }

}

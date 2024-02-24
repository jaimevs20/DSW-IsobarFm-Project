package model;

import java.util.List;

public class Band {
    String name;
    String imagePath;
    String genre;
    String biography;
    Long numPlays;
    String id;
    List<Album> albums;

    public String getName() {
        return name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getGenre() {
        return genre;
    }

    public String getBiography() {
        return biography;
    }

    public Long getNumPlays() {
        return numPlays;
    }

    public String getId() {
        return id;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public void setNumPlays(Long numPlays) {
        this.numPlays = numPlays;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}

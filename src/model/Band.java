package model;

import java.util.List;

public class Band {
    String name;
    String imagePath;
    String genre;
    String biography;
    Long numPlays;
    String id;

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

    @Override
    public String toString() {
        return "Band{" +
                "name='" + name + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", genre='" + genre + '\'' +
                ", biography='" + biography + '\'' +
                ", numPlays=" + numPlays +
                ", id='" + id + '\'' +
                '}';
    }
}

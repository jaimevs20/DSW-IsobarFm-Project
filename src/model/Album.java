package model;

import java.util.Date;
import java.util.List;

public class Album {
    String name;
    String imagePath;
    Date releasedDate;
    String band;
    List<Track> tracks;
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public Date getReleasedDate() {
        return releasedDate;
    }

    public String getBand() {
        return band;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setReleasedDate(Date releasedDate) {
        this.releasedDate = releasedDate;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", releasedDate=" + releasedDate +
                ", band=" + band +
                ", tracks=" + tracks +
                '}';
    }
}

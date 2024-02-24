package model;

import java.util.Date;
import java.util.List;

public class Album {
    String name;
    String imagePath;
    Date releasedDate;
    Band band;
    List<Track> tracks;

    public String getName() {
        return name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public Date getReleasedDate() {
        return releasedDate;
    }

    public Band getBand() {
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

    public void setBand(Band band) {
        this.band = band;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }
}

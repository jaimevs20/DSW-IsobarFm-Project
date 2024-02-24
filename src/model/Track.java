package model;

import java.math.BigDecimal;

public class Track {
    String name;
    BigDecimal duration;
    String id;

    public String getName() {
        return name;
    }

    public BigDecimal getDuration() {
        return duration;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", id='" + id + '\'' +
                '}';
    }
}

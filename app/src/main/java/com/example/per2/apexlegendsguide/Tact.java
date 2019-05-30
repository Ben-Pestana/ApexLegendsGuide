package com.example.per2.apexlegendsguide;

public class Tact {

    private String name;
    private String desc;
    private String duration;

    public Tact(String name, String desc, String duration) {
        this.name = name;
        this.desc = desc;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Tact{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}

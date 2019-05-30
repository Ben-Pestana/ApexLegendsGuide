package com.example.per2.apexlegendsguide;

public class Ult {

    private String name;
    private String charge;
    private String desc;

    public Ult(String name, String charge, String desc) {
        this.name = name;
        this.charge = charge;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Ult{" +
                "name='" + name + '\'' +
                ", charge='" + charge + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

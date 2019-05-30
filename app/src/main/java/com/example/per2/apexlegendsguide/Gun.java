package com.example.per2.apexlegendsguide;

public class Gun {

    private String name;
    private String ammotype;
    private String ammo;
    private String gunType;
    private String imgurl;
    private String stock;

    public Gun(String name, String ammotype, String ammo, String gunType, String imgurl, String stock) {
        this.name = name;
        this.ammotype = ammotype;
        this.ammo = ammo;
        this.gunType = gunType;
        this.imgurl = imgurl;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmmotype() {
        return ammotype;
    }

    public void setAmmotype(String ammotype) {
        this.ammotype = ammotype;
    }

    public String getAmmo() {
        return ammo;
    }

    public void setAmmo(String ammo) {
        this.ammo = ammo;
    }

    public String getGunType() {
        return gunType;
    }

    public void setGunType(String gunType) {
        this.gunType = gunType;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "name='" + name + '\'' +
                ", ammotype='" + ammotype + '\'' +
                ", ammo='" + ammo + '\'' +
                ", gunType='" + gunType + '\'' +
                ", imgurl='" + imgurl + '\'' +
                ", stock='" + stock + '\'' +
                '}';
    }
}
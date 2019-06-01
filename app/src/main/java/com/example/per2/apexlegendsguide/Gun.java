package com.example.per2.apexlegendsguide;

public class Gun {

    private String name;
    private String ammotype;
    private String ammo;
    private String guntype;
    private String imgurl;
    private String stock;

    public Gun(String name, String ammotype, String ammo, String guntype, String imgurl, String stock) {
        this.name = name;
        this.ammotype = ammotype;
        this.ammo = ammo;
        this.guntype = guntype;
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
        return guntype;
    }

    public void setGunType(String gunType) {
        this.guntype = gunType;
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
                ", gunType='" + guntype + '\'' +
                ", imgurl='" + imgurl + '\'' +
                ", stock='" + stock + '\'' +
                '}';
    }
}
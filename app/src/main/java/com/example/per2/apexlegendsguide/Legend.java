package com.example.per2.apexlegendsguide;

public class Legend {

    private String name;
    private Tact tact;
    private Pass pass;
    private Ult ult;
    private String imageurl;
    private String gender;
    private String age;
    private String realname;

    public Legend(String name, Tact tact, Pass pass, Ult ult, String imageurl, String gender, String age, String realname) {
        this.name = name;
        this.tact = tact;
        this.pass = pass;
        this.ult = ult;
        this.imageurl = imageurl;
        this.gender = gender;
        this.age = age;
        this.realname = realname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tact getTact() {
        return tact;
    }

    public void setTact(Tact tact) {
        this.tact = tact;
    }

    public Pass getPass() {
        return pass;
    }

    public void setPass(Pass pass) {
        this.pass = pass;
    }

    public Ult getUlt() {
        return ult;
    }

    public void setUlt(Ult ult) {
        this.ult = ult;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRealName() {
        return realname;
    }

    public void setRealName(String realName) {
        this.realname = realname;
    }

    @Override
    public String toString() {
        return "Legend{" +
                "name='" + name + '\'' +
                ", tact=" + tact +
                ", pass=" + pass +
                ", ult=" + ult +
                ", imageurl='" + imageurl + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", realname='" + realname + '\'' +
                '}';
    }
}
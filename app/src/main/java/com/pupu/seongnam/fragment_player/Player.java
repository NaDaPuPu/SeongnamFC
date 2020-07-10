package com.pupu.seongnam.fragment_player;

import android.graphics.drawable.Drawable;
import android.media.Image;

import java.time.LocalDate;

  public class Player {
    private String name, nation, school, position;
    private LocalDate birth;
    private int b_num, age, height, weight;
    private Drawable image;

    public Player(int b_num, String name, String nation, LocalDate birth, int age,
                  int height, int weight, String school, Drawable image) {
        this.b_num = b_num;
        this.name = name;
        this.nation = nation;
        this.birth = birth;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.school = school;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public int getB_num() {
        return b_num;
    }

    public void setB_num(int b_num) {
        this.b_num = b_num;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
  }
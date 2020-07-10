package com.pupu.seongnam.fragment_player;

import android.graphics.drawable.Drawable;

import java.time.LocalDate;

public class Foward extends Player {
    private String position;

    public Foward(int b_num, String name, String nation, LocalDate birth, int age, int height, int weight, String school, Drawable image) {
        super(b_num, name, nation, birth, age, height, weight, school, image);
        this.position = "FW";
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

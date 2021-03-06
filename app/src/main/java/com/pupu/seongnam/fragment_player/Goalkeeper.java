package com.pupu.seongnam.fragment_player;

import android.graphics.drawable.Drawable;

import java.time.LocalDate;

public class Goalkeeper extends Player {
    private String position;

    public Goalkeeper(int b_num, String name, String nation, LocalDate birth, int age, int height, int weight, String school, Drawable image) {
        super(b_num, name, nation, birth, age, height, weight, school, image);
        this.position = "GK";
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

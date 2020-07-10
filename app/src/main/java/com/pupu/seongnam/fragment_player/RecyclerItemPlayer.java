package com.pupu.seongnam.fragment_player;

public class RecyclerItemPlayer {
    private String nameStr;
    private int b_numInt;

    public RecyclerItemPlayer(String name, int b_num) {
        this.nameStr = name;
        this.b_numInt = b_num;
    }

    public String getNameStr() {
        return nameStr;
    }

    public void setNameStr(String nameStr) {
        this.nameStr = nameStr;
    }

    public int getB_numInt() {
        return b_numInt;
    }

    public void setB_numInt(int b_numInt) {
        this.b_numInt = b_numInt;
    }
}

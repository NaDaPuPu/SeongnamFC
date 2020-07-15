package com.pupu.seongnam.fragment_player;

public class RecyclerItemPlayer {
    private String nameStr, posStr;
    private int b_numInt;

    public RecyclerItemPlayer(String name, int b_num, String pos) {
        this.nameStr = name;
        this.b_numInt = b_num;
        this.posStr = pos;
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

    public String getPosStr() {
        return posStr;
    }

    public void setPosStr(String posStr) {
        this.posStr = posStr;
    }
}

package com.company;

public class Dadu {

    int sisi,dadu1,dadu2;
    Dadu(){
    }

    public void lemparDadu(){
        this.dadu1 = (int)(Math.random()*6) + 1;
        this.dadu2 = (int)(Math.random()*6) + 1;
        this.sisi = dadu1 + dadu2;
    }
    public int getSisi(){
        return this.sisi;
    }
}

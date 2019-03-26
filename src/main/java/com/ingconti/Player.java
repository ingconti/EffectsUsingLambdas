package com.ingconti;

import java.util.ArrayList;

public class Player {

    private int lifes = 0;
   private ArrayList<String> weapons = new ArrayList<String>();

    boolean decreaseLifes(){
        if (lifes>0) {
            lifes -= 1;
            return  true;
        }
        return  false;
    }

    void addWeapon(String weapon){
        weapons.add(weapon);
    }

}

package com.ingconti;

import java.util.ArrayList;

public class Player {

    private int lifes = 10;
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

    void showStatus(){
        System.out.println( lifes );
        System.out.println( weapons );

    }
}

package com.ingconti;


import java.util.ArrayList;

interface Effect {
    void applyOn(Player p);
}


public class Card {

    private ArrayList<Effect> effects = new ArrayList<Effect>();

    Card(String jsonName){

        // let' s create a list of effects:
        //(in real game we can load and modle it form JSON....)

        Effect eff1 = (p) -> {
            p.addWeapon("gun");
        };

        Effect eff2 = (p) -> {
            p.decreaseLifes();
        };

        effects.add(eff1);
        effects.add(eff2);
    }



    public ArrayList<Effect> getEffects(){
        return  effects;
    }


}

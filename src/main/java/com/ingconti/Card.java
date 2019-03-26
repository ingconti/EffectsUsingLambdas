package com.ingconti;


import java.util.ArrayList;

interface Effect {
    void applyOn(Player p);
}


public class Card {

    private ArrayList<Effect> effects = new ArrayList<Effect>();

    Card(){
        // let' s create a list of effects:
        Effect eff1 = (p) -> {
            p.addWeapon("gun");
        };

        Effect eff2 = (p) -> {
            p.decreaseLifes();
        };

        effects.add(eff1);
        effects.add(eff2);
    }

    ArrayList<Effect> getEffects(){
        return  effects;
    }


}

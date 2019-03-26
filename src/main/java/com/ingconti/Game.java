package com.ingconti;


import java.util.ArrayList;

public class Game {


    private ArrayList<Card> cards = new ArrayList<Card>();

    private void initCards() {
        Card c1 = new Card("Terminator");
        cards.add(c1);
        /// add other cards...

        /// use current user....
        Player p = getCurrPlayer();

        for (Card c : cards) {
            // get effectsfor every card...
            ArrayList<Effect> effects = c.getEffects();
            for (Effect e : effects) {
                e.applyOn(p);
            }
        }

        // let's see player:
        p.showStatus();;

    }


    void run(){
        initCards();

    }


    Player getCurrPlayer(){
        // fake create it...
        return new Player();

    }
}

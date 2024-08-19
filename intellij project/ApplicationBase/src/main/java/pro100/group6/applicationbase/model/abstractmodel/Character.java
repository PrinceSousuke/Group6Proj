package pro100.group6.applicationbase.model.abstractmodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Character {
    protected String name;
    protected int feyre;
    protected int health;
    protected List<Card> hand;
    protected Card[] deck;

    public Character(String name,int health) {
        setName(name);
        setFeyre(0);
        setHealth(health);
    }

    public void drawCard() {
        Random rng = new Random();
        int index = rng.nextInt(this.getDeck().length +1);
        this.hand.add(this.getDeck()[index]);
    }

    // Geters and Setters
    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        if (hand == null) {
            this.hand = new ArrayList<>();
        } else {
            this.hand = hand;
        }
    }

    public Card[] getDeck() {
        return deck;
    }

    public void setDeck(Card[] deck) {
        if (deck == null) {
            this.deck = new Card[0];
        } else {
            this.deck = deck;
        }
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public int getFeyre() {
        return feyre;
    }

    public void setFeyre(int feyre) {
        if (feyre <= 0) {
            this.feyre = 0;
        } else {
            this.feyre = feyre;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0 ) {
            this.health = 0;
        } else if (health > 25) {
            this.health = 25;
        } else {
            this.health = health;
        }
    }
}

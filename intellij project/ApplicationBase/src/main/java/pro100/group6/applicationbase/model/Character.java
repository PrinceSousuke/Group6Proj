package pro100.group6.applicationbase.model;

public abstract class Character {
    protected String name;
    protected int feyre;
    protected int health;
    protected Card[] hand;
    protected Card[] deck;

    public Character(String name, int feyre, int health) {
        setName(name);
        setFeyre(feyre);
        setHealth(health);
    }

    // Geters and Setters
    public Card[] getHand() {
        return hand;
    }

    public void setHand(Card[] hand) {
        if (hand == null) {
            this.hand = new Card[0];
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

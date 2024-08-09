package pro100.group6.applicationbase.model;

import javafx.scene.image.Image;

public abstract class Card {
    protected Image cardImage;
    protected CardClass cardClass;
    protected int feyreReq;
    protected int health;
    protected int damage;
    protected String cardName;
    protected String cardDescription;

    public Card(Image cardImage, CardClass cardClass, int feyreReq, int health, int damage, String cardName, String cardDescription) {
        setCardImage(cardImage);
        setCardClass(cardClass);
        setFeyreReq(feyreReq);
        setHealth(health);
        setDamage(damage);
        setCardName(cardName);
        setCardDescription(cardDescription);
    }

    // Getters and Setters
    public String getCardName() {
        return cardName;
    }

    protected void setCardName(String cardName) {
        if (cardName != null) {
            this.cardName = cardName;
        }
    }

    public String getCardDescription() {
        return cardDescription;
    }

    protected void setCardDescription(String cardDescription) {
        if (cardDescription != null) {
            this.cardDescription = cardDescription;
        }
    }

    public Image getCardImage() {
        return cardImage;
    }

    protected void setCardImage(Image cardImage) {
        if (cardImage != null) {
            this.cardImage = cardImage;
        }
    }

    public CardClass getCardClass() {
        return cardClass;
    }

    protected void setCardClass(CardClass cardClass) {
        if (cardClass != null) {
            this.cardClass = cardClass;
        }
    }

    public int getFeyreReq() {
        return feyreReq;
    }

    protected void setFeyreReq(int feyreReq) {
        if (feyreReq >= 0) {
            this.feyreReq = feyreReq;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health >= 0) {
            this.health = health;
        } else {
            this.health = 0;
        }
    }

    public int getDamage() {
        return damage;
    }

    protected void setDamage(int damage) {
        if (health >= 0) {
            this.damage = damage;
        } else {
            this.damage = 0;
        }
    }
}

package pro100.group6.applicationbase.model;

import javafx.scene.image.Image;

public abstract class Card {
    protected Image cardImage;
    protected CardClass cardClass;
    protected int feyreReq;
    protected String cardName;
    protected String cardDescription;

    public Card(Image cardImage, CardClass cardClass, int feyreReq, String cardName, String cardDescription) {
        setCardImage(cardImage);
        setCardClass(cardClass);
        setFeyreReq(feyreReq);
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
}

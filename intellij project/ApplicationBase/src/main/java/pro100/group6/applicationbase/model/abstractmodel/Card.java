package pro100.group6.applicationbase.model.abstractmodel;

import pro100.group6.applicationbase.model.enums.CardClass;

import java.io.Serial;
import java.io.Serializable;

public abstract class Card implements Serializable {
    @Serial
    private static final long serialVersionUID = 121212L;
    protected String cardImage;
    protected CardClass cardClass;
    protected int feyreReq;
    protected String cardName;
    protected String cardDescription;

    public Card() {
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

    public String getCardImage() {
        return cardImage;
    }

    protected void setCardImage(String cardImage) {
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

package pro100.group6.applicationbase.model.cards.earth.spells;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Card;

public class Stick extends Card{
    public Stick() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(1);
        setCardName("Stick");
        setCardDescription("Poke one enemy creature and " +
                "cause them to attack a creature of yours");
    }


}

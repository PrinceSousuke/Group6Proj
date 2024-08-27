package pro100.group6.applicationbase.model.cards.earth.troops;


import pro100.group6.applicationbase.model.abstractmodel.Troop;
import pro100.group6.applicationbase.model.enums.CardClass;

public class Fairy extends Troop {

    public Fairy() {
        setCardImage("uiResources/cardResourced/Faerie.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(5);
        setDamage(5);
        setHealth(8);
        setCardName("Fairy");
        setCardDescription("Shoots beams of green energy");
    }
}

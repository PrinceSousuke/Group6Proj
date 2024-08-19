package pro100.group6.applicationbase.model.cards.earth.troops;


import pro100.group6.applicationbase.model.abstractmodel.Troop;
import pro100.group6.applicationbase.model.enums.CardClass;

public class Fairy extends Troop {

    public Fairy() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(1);
        setDamage(5);
        setHealth(8);
        setCardName("Fairy");
        setCardDescription("Placeholder description");
    }
}

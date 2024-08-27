package pro100.group6.applicationbase.model.cards.earth.troops;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Troop;

public class Banshee extends Troop {
    public Banshee() {
        setCardImage("uiResources/cardResourced/Banshee.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(5);
        setDamage(7);
        setHealth(8);
        setCardName("Banshee");
        setCardDescription("Screeches at the enemy");
    }
}

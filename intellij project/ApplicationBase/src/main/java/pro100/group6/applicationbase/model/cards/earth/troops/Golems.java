package pro100.group6.applicationbase.model.cards.earth.troops;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Troop;

public class Golems extends Troop {
    public Golems() {
        setCardImage("uiResources/cardResourced/Golem.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(8);
        setDamage(7);
        setHealth(18);
        setCardName("Golem");
        setCardDescription("Big rock");
    }
}

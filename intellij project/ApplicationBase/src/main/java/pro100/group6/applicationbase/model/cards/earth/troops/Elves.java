package pro100.group6.applicationbase.model.cards.earth.troops;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Troop;

public class Elves extends Troop {
    public Elves() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(1);
        setDamage(3);
        setHealth(12);
        setCardName("Elves");
        setCardDescription("Placeholder description");
    }
}

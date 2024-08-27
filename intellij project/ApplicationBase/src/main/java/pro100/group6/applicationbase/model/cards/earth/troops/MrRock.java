package pro100.group6.applicationbase.model.cards.earth.troops;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Troop;

public class MrRock extends Troop {
    public MrRock() {
        setCardImage("uiResources/cardResourced/Mr.Rock.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(3);
        setDamage(5);
        setHealth(5);
        setCardName("Mr.Rock");
        setCardDescription("He dont play");
    }
}

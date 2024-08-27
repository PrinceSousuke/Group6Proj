package pro100.group6.applicationbase.model.cards.earth.troops;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Troop;

public class Jackalope extends Troop {
    public Jackalope() {
        setCardImage("uiResources/cardResourced/Jackalope.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(5);
        setDamage(4);
        setHealth(12);
        setCardName("Jackalope");
        setCardDescription("Roundhouse kick");
    }
}

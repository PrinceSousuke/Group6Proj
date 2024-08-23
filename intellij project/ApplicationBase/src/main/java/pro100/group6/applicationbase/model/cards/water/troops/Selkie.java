package pro100.group6.applicationbase.model.cards.water.troops;

import pro100.group6.applicationbase.model.abstractmodel.Troop;
import pro100.group6.applicationbase.model.enums.CardClass;

public class Selkie extends Troop {
    public Selkie() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.AIR);
        setFeyreReq(5);
        setDamage(7);
        setHealth(8);
        setCardName("Selkie");
        setCardDescription("Placeholder description");
    }
}

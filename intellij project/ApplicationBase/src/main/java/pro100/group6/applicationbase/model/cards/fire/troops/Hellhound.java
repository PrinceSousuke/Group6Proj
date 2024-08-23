package pro100.group6.applicationbase.model.cards.fire.troops;

import pro100.group6.applicationbase.model.abstractmodel.Troop;
import pro100.group6.applicationbase.model.enums.CardClass;

public class Hellhound extends Troop {
    public Hellhound() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.AIR);
        setFeyreReq(5);
        setDamage(7);
        setHealth(8);
        setCardName("Hellhound");
        setCardDescription("Placeholder description");
    }
}

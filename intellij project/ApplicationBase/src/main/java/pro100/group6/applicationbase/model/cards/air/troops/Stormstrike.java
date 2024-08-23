package pro100.group6.applicationbase.model.cards.air.troops;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Troop;

public class Stormstrike extends Troop {
    public Stormstrike() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.AIR);
        setFeyreReq(5);
        setDamage(7);
        setHealth(8);
        setCardName("Stormstrike");
        setCardDescription("Placeholder description");
    }
}

package pro100.group6.applicationbase.model.cards.water.troops;

import pro100.group6.applicationbase.model.abstractmodel.Troop;
import pro100.group6.applicationbase.model.enums.CardClass;

import java.util.TreeMap;

public class GossamerGlow extends Troop {
    public GossamerGlow() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.AIR);
        setFeyreReq(5);
        setDamage(7);
        setHealth(8);
        setCardName("GossamerGlow");
        setCardDescription("Placeholder description");
    }
}

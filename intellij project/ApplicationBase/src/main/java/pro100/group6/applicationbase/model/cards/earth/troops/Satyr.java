package pro100.group6.applicationbase.model.cards.earth.troops;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Troop;

public class Satyr extends Troop {
    public Satyr() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(4);
        setDamage(5);
        setHealth(15);
        setCardName("Satyr");
        setCardDescription("Placeholder description");
    }
}

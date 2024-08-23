package pro100.group6.applicationbase.model.cards.fire.troops;

import pro100.group6.applicationbase.model.abstractmodel.Troop;
import pro100.group6.applicationbase.model.enums.CardClass;

public class Phoenix extends Troop {
    public Phoenix() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.AIR);
        setFeyreReq(5);
        setDamage(7);
        setHealth(8);
        setCardName("Phoenix");
        setCardDescription("Placeholder description");
    }
}

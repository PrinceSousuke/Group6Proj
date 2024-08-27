package pro100.group6.applicationbase.model.cards.earth.troops;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Troop;

public class Fauns extends Troop {
    public Fauns() {
        setCardImage("uiResources/cardResourced/Faun.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(7);
        setDamage(6);
        setHealth(14);
        setCardName("Fauns");
        setCardDescription("Uses poisonous plants as there weapon");
    }
}

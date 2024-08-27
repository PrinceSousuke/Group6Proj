package pro100.group6.applicationbase.model.cards.earth.troops;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Troop;

public class Satyr extends Troop {
    public Satyr() {
        setCardImage("uiResources/cardResourced/Satyr.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(5);
        setDamage(5);
        setHealth(15);
        setCardName("Satyr");
        setCardDescription("Calls upon forest friends");
    }
}

package pro100.group6.applicationbase.model.cards.earth.troops;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Troop;

public class Nymph extends Troop {
    public Nymph() {
        setCardImage("uiResources/cardResourced/Nymph.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(7);
        setDamage(4);
        setHealth(16);
        setCardName("Nymph");
        setCardDescription("Constricts enemy with vines");
    }
}

package pro100.group6.applicationbase.model.cards.earth.troops;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Troop;

public class Elves extends Troop {
    public Elves() {
        setCardImage("uiResources/cardResourced/Elf.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(3);
        setDamage(3);
        setHealth(12);
        setCardName("Elf");
        setCardDescription("Shoots energy-infused arrows");
    }
}

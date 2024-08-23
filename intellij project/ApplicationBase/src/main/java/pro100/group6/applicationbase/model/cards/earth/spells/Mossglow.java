package pro100.group6.applicationbase.model.cards.earth.spells;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.HealSpell;

public class Mossglow extends HealSpell {
    public Mossglow() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(1);
        setHealAmount(5);
        setCardName("Mossglow");
        setCardDescription("Heals friendly creature by 5 hp");
    }
}

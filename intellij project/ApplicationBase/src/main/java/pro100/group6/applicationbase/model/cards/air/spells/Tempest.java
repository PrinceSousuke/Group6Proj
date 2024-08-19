package pro100.group6.applicationbase.model.cards.air.spells;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.AttackSpell;

public class Tempest extends AttackSpell {
    public Tempest() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.AIR);
        setFeyreReq(3);
        setDamage(8);
        setCardName("Tempest");
        setCardDescription("Deal 8 damage");
    }
}

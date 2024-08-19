package pro100.group6.applicationbase.model.cards.air.spells;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.HealSpell;

public class AirsEmbrace extends HealSpell {
    public AirsEmbrace() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.AIR);
        setFeyreReq(3);
        setHealAmount(2);
        setCardName("Air's Embrace");
        setCardDescription("Heal 1 creature");
    }
}

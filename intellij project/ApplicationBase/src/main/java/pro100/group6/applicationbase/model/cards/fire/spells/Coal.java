package pro100.group6.applicationbase.model.cards.fire.spells;

import pro100.group6.applicationbase.model.abstractmodel.AbilitySpell;
import pro100.group6.applicationbase.model.enums.CardClass;

public class Coal extends AbilitySpell {
    public Coal() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.AIR);
        setFeyreReq(3);
        setCardName("Air's Embrace");
        setCardDescription("Heal 1 creature");
    }
    @Override
    public void ability() {

    }
}

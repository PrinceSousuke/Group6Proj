package pro100.group6.applicationbase.model.cards.air.spells;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.AbilitySpell;

public class Breeze extends AbilitySpell {
    public Breeze() {

    }

    @Override
    public void ability() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.AIR);
        setFeyreReq(3);
        setCardName("Breeze");
        setCardDescription("Relax 1 creature for 1 turn");
    }
}

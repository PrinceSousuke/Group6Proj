package pro100.group6.applicationbase.model.cards.air.spells;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.AbilitySpell;

public class GalesLament extends AbilitySpell {
    public GalesLament() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.AIR);
        setFeyreReq(3);
        setCardName("Gale's Lament");
        setCardDescription("Relax 1 creature for 1 turn");
    }

    @Override
    public void ability() {

    }
}
package pro100.group6.applicationbase.model.cards.air.traps;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.AbilitySpell;

public class WindsDeception extends AbilitySpell {
    public WindsDeception() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.AIR);
        setFeyreReq(3);
        setCardName("Wind's Deception");
        setCardDescription("When triggered it sends the enemy that triggered it down a dangerous path for 2 turns, dealing 2 damage each turn");
    }

    @Override
    public void ability() {

    }
}

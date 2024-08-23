package pro100.group6.applicationbase.model.cards.air.traps;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.AbilitySpell;

public class ZephyrsSnare extends AbilitySpell {
    public ZephyrsSnare() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.AIR);
        setFeyreReq(3);
        setCardName("Zephyrs Snare");
        setCardDescription("Deal 8 damage");
    }

    @Override
    public void ability() {

    }
}

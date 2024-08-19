package pro100.group6.applicationbase.model.cards.earth.spells;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.AbilitySpell;

public class SylvanShield extends AbilitySpell {
    public SylvanShield() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(2);
        setCardName("SylvanShield");
        setCardDescription("Shield a ally");
    }

    @Override
    public void ability() {

    }
}

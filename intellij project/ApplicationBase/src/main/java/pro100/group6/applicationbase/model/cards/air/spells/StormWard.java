package pro100.group6.applicationbase.model.cards.air.spells;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.AbilitySpell;

public class StormWard extends AbilitySpell {
    public StormWard() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.AIR);
        setFeyreReq(3);
        setCardName("Storm Ward");
        setCardDescription("Protect one creature for 1 turn that is below half hp");
    }

    @Override
    public void ability() {

    }
}

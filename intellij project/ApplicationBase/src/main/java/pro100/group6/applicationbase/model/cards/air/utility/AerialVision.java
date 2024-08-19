package pro100.group6.applicationbase.model.cards.air.utility;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.AbilitySpell;

public class AerialVision extends AbilitySpell {
    public AerialVision() {
        setCardClass(CardClass.AIR);
        setFeyreReq(3);
        setCardName("Aerial Vision");
        setCardDescription("Draw 1 creature");
    }

    @Override
    public void ability() {

    }
}

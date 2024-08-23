package pro100.group6.applicationbase.model.cards.fire.spells;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.AbilitySpell;

public class Firewall extends AbilitySpell {
    public Firewall() {
        setCardClass(CardClass.AIR);
        setFeyreReq(3);
        setCardName("Firewall");
        setCardDescription("Draw 1 creature");
    }

    @Override
    public void ability() {

    }
}

package pro100.group6.applicationbase.model.cards.earth.trap;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Ability;
import pro100.group6.applicationbase.model.abstractmodel.AbilitySpell;

public class CarnivorousBlossom extends AbilitySpell {
    public CarnivorousBlossom() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(2);
        setCardName("Carnivorous Blossom");
        setCardDescription("Place trap under ally creature. Trigger: Trap enemy for 2 turns, deal 2 damage every turn");
    }

    @Override
    public void ability() {

    }
}

package pro100.group6.applicationbase.model.cards.air.utility;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Character;
import pro100.group6.applicationbase.model.abstractmodel.CharaterAbilitySpell;

public class SkyblessPendant extends CharaterAbilitySpell {
    public SkyblessPendant() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.AIR);
        setFeyreReq(3);
        setCardName("Skybless Pendant");
        setCardDescription("Gain 1 Feyre");
    }

    @Override
    public void ability(Character character) {
        character.setFeyre(character.getFeyre() + 1);
    }
}

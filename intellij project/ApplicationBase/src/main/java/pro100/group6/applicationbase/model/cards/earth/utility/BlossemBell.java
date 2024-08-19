package pro100.group6.applicationbase.model.cards.earth.utility;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Character;
import pro100.group6.applicationbase.model.abstractmodel.CharaterAbilitySpell;

public class BlossemBell extends CharaterAbilitySpell {
    public BlossemBell() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(0);
        setCardName("Blossem Bell");
        setCardDescription("Draw 1 creature");
    }

    @Override
    public void ability(Character character) {
        character.drawCard();
    }
}
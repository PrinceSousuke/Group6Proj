package pro100.group6.applicationbase.model.cards.earth.utility;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Character;
import pro100.group6.applicationbase.model.abstractmodel.CharaterAbilitySpell;

public class RootedStaff extends CharaterAbilitySpell {
    public RootedStaff() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(0);
        setCardName("Rooted Staff");
        setCardDescription("Grants +1 Feyre");
    }

    @Override
    public void ability(Character character) {
        character.setFeyre(character.getFeyre() + 1);
    }
}

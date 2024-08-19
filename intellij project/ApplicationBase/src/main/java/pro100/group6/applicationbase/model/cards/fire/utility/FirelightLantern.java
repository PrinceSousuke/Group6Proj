package pro100.group6.applicationbase.model.cards.fire.utility;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Character;
import pro100.group6.applicationbase.model.abstractmodel.CharaterAbilitySpell;

public class FirelightLantern extends CharaterAbilitySpell {
    public FirelightLantern() {
        setCardClass(CardClass.AIR);
        setFeyreReq(3);
        setCardName("Firelight lantern");
        setCardDescription("Gain 1 Feyre");
    }

    @Override
    public void ability(Character character) {
        character.setFeyre(character.getFeyre() + 1);
    }
}

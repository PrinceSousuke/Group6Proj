package pro100.group6.applicationbase.model.cards.air.utility;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Character;
import pro100.group6.applicationbase.model.abstractmodel.CharaterAbilitySpell;

public class CelestialWind extends CharaterAbilitySpell {
    public CelestialWind() {setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.AIR);
        setFeyreReq(3);
        setCardName("Celestial Wind");
        setCardDescription("Draw 1 creature");
    }

    @Override
    public void ability(Character character) {
        character.drawCreature();
    }
}

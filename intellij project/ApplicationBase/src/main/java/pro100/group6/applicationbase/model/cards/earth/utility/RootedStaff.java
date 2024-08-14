package pro100.group6.applicationbase.model.cards.earth.utility;

import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Character;
import pro100.group6.applicationbase.model.abstractmodel.CharaterAbilitySpell;

import java.io.File;

public class RootedStaff extends CharaterAbilitySpell {
    public RootedStaff() {
        setCardImage(new Image(new File("uiResources/cardGuy.png").toURI().toString()));
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

package pro100.group6.applicationbase.model.cards.earth.spells;

import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.AbilitySpell;
import pro100.group6.applicationbase.model.abstractmodel.Card;

import java.io.File;

public class SylvanShield extends AbilitySpell {
    public SylvanShield() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(2);
        setCardName("SylvanShield");
        setCardDescription("Shield a ally");
    }

    @Override
    public void ability() {

    }
}

package pro100.group6.applicationbase.model.cards.earth.spells;

import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Card;

import java.io.File;

public class SylvanShield extends Card implements Ability {
    public SylvanShield() {
        setCardImage(new Image(new File("uiResources/cardGuy.png").toURI().toString()));
        setCardClass(CardClass.Earth);
        setFeyreReq(2);
        setCardName("SylvanShield");
        setCardDescription("Shield a ally");
    }

    @Override
    public void ability() {

    }
}

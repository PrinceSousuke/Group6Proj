package pro100.group6.applicationbase.model.cards.earth.trap;

import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.AbilitySpell;
import pro100.group6.applicationbase.model.abstractmodel.Card;

import java.io.File;

public class FaerieRing extends AbilitySpell {
    public FaerieRing() {
        setCardImage(new Image(new File("uiResources/cardGuy.png").toURI().toString()));
        setCardClass(CardClass.Earth);
        setFeyreReq(2);
        setCardName("Fearie Ring");
        setCardDescription("Place enemy plays creature return it to there hand, deal 3 damage to enemy character");
    }

    @Override
    public void ability() {

    }
}

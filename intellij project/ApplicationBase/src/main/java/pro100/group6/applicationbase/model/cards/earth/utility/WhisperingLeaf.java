package pro100.group6.applicationbase.model.cards.earth.utility;

import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.AbilitySpell;

import java.io.File;

public class WhisperingLeaf extends AbilitySpell {
    public WhisperingLeaf() {
        setCardImage(new Image(new File("uiResources/cardGuy.png").toURI().toString()));
        setCardClass(CardClass.Earth);
        setFeyreReq(0);
        setCardName("Whispering Leaf");
        setCardDescription("Reveal 1 Enemy Trap");
    }

    @Override
    public void ability() {
        //TODO
    }
}

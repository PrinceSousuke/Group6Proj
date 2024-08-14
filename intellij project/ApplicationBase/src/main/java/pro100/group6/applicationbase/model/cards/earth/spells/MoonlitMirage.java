package pro100.group6.applicationbase.model.cards.earth.spells;

import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.AbilitySpell;
import pro100.group6.applicationbase.model.abstractmodel.Card;

import java.io.File;

public class MoonlitMirage extends AbilitySpell {
    public MoonlitMirage() {
        setCardImage(new Image(new File("uiResources/cardGuy.png").toURI().toString()));
        setCardClass(CardClass.Earth);
        setFeyreReq(2);
        setCardName("Moonlit Mirage");
        setCardDescription("If played before trap or creature card, stay hidden until triggered");
    }

    @Override
    public void ability() {

    }

}

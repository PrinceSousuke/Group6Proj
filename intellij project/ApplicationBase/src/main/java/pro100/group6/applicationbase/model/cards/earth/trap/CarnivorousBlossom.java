package pro100.group6.applicationbase.model.cards.earth.trap;

import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.AbilitySpell;
import pro100.group6.applicationbase.model.abstractmodel.Card;

import java.io.File;

public class CarnivorousBlossom extends AbilitySpell {
    public CarnivorousBlossom() {
        setCardImage(new Image(new File("uiResources/cardGuy.png").toURI().toString()));
        setCardClass(CardClass.Earth);
        setFeyreReq(2);
        setCardName("Carnivorous Blossom");
        setCardDescription("Place trap under ally creature. Trigger: Trap enemy for 2 turns, deal 2 damage every turn");
    }

    @Override
    public void ability() {

    }
}

package pro100.group6.applicationbase.model.cards.earth.trap;

import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Ability;
import pro100.group6.applicationbase.model.abstractmodel.Card;

import java.io.File;

public class CarnivorousBlossom extends Card {
    public CarnivorousBlossom() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(2);
        setCardName("Carnivorous Blossom");
        setCardDescription("Place trap under ally creature. Trigger: Trap enemy for 2 turns, deal 2 damage every turn");
    }

}

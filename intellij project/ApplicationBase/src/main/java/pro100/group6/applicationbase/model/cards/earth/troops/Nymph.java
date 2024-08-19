package pro100.group6.applicationbase.model.cards.earth.troops;

import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Troop;

import java.io.File;

public class Nymph extends Troop {
    public Nymph() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(3);
        setDamage(4);
        setHealth(16);
        setCardName("Nymph");
        setCardDescription("Placeholder description");
    }
}

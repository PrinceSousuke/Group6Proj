package pro100.group6.applicationbase.model.cards.earth.troops;

import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Troop;

import java.io.File;

public class Golems extends Troop {
    public Golems() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(1);
        setDamage(7);
        setHealth(18);
        setCardName("Golems");
        setCardDescription("Placeholder description");
    }
}

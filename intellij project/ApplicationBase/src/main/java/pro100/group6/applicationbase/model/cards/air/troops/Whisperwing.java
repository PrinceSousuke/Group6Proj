package pro100.group6.applicationbase.model.cards.air.troops;

import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Troop;

import java.io.File;

public class Whisperwing extends Troop {
    public Whisperwing() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.AIR);
        setFeyreReq(5);
        setDamage(7);
        setHealth(8);
        setCardName("Wisperwing");
        setCardDescription("Placeholder description");
    }
}

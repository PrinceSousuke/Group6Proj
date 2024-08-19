package pro100.group6.applicationbase.model.cards.earth.troops;

import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Troop;

import java.io.File;

public class Jackalope extends Troop {
    public Jackalope() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(5);
        setDamage(4);
        setHealth(12);
        setCardName("Jackalope");
        setCardDescription("Placeholder description");
    }
}

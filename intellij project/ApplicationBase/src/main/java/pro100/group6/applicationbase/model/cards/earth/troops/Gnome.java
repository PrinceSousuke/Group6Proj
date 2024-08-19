package pro100.group6.applicationbase.model.cards.earth.troops;

import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Troop;

import java.io.File;

public class Gnome extends Troop {
    public Gnome() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(2);
        setDamage(6);
        setHealth(10);
        setCardName("Gnome");
        setCardDescription("Placeholder description");
    }
}

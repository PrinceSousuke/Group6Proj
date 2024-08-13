package pro100.group6.applicationbase.model.cards.earth.troops;

import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Troop;

import java.io.File;

public class Gnome extends Troop {
    public Gnome() {
        setCardImage(new Image(new File("uiResources/cardGuy.png").toURI().toString()));
        setCardClass(CardClass.Earth);
        setFeyreReq(2);
        setDamage(2);
        setHealth(1);
        setCardName("Gnome");
        setCardDescription("Spawns a 1|2 Golem on death");
    }
}

package pro100.group6.applicationbase.model.cards.earth.troops;

import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Troop;

import java.io.File;

public class Fauns extends Troop {
    public Fauns() {
        setCardImage(new Image(new File("uiResources/cardGuy.png").toURI().toString()));
        setCardClass(CardClass.Earth);
        setFeyreReq(3);
        setDamage(3);
        setHealth(4);
        setCardName("Fauns");
        setCardDescription("Placeholder description");
    }
}

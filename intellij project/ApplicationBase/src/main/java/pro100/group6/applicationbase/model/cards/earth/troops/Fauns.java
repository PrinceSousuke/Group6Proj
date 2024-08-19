package pro100.group6.applicationbase.model.cards.earth.troops;

import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Troop;

import java.io.File;

public class Fauns extends Troop {
    public Fauns() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(3);
        setDamage(6);
        setHealth(14);
        setCardName("Fauns");
        setCardDescription("Placeholder description");
    }
}

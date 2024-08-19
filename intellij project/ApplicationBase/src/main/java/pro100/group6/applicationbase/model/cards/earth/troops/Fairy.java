package pro100.group6.applicationbase.model.cards.earth.troops;


import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.*;
import pro100.group6.applicationbase.model.abstractmodel.Troop;

import java.io.File;

public class Fairy extends Troop {

    public Fairy() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(1);
        setDamage(5);
        setHealth(8);
        setCardName("Fairy");
        setCardDescription("Placeholder description");
    }
}

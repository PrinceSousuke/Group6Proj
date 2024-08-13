package pro100.group6.applicationbase.model.cards.earth.troops;

import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Troop;

import java.io.File;

public class MrRock extends Troop {
    public MrRock() {
        setCardImage(new Image(new File("uiResources/cardGuy.png").toURI().toString()));
        setCardClass(CardClass.Earth);
        setFeyreReq(10);
        setDamage(10);
        setHealth(10);
        setCardName("Mr.Rock");
        setCardDescription("Rock, Rock");
    }
}

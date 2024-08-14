package pro100.group6.applicationbase.model.cards.earth.spells;

import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Card;

import java.io.File;

public class Mossglow extends Card {
    public Mossglow() {
        setCardImage(new Image(new File("uiResources/cardGuy.png").toURI().toString()));
        setCardClass(CardClass.Earth);
        setFeyreReq(1);
        setDamage(0);
        setHealAmount(5);
        setCardName("Mossglow");
        setCardDescription("Heals friendly creature by 5 hp");
    }
}

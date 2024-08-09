package pro100.group6.applicationbase.model.Cards;

import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.Card;
import pro100.group6.applicationbase.model.CardClass;
import java.io.File;


public class DummyTroop extends Card {
    public DummyTroop() {
        super(new Image(new File("uiResources/cardPlaceholder.png").toURI().toString()),
                CardClass.FIRE, 1, 2, 1, "Guy", "He will fight because he wants to!");

    }
}

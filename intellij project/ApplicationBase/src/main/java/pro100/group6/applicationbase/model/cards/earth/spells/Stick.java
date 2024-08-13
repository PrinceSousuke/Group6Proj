package pro100.group6.applicationbase.model.cards.earth.spells;

import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Spell;

import java.io.File;

public class Stick extends Spell {
    public Stick() {
        setCardImage(new Image(new File("uiResources/cardGuy.png").toURI().toString()));
        setCardClass(CardClass.Earth);
        setFeyreReq(1);
        setDamage(0);
        setHealAmount(0);
        setCardName("Stick");
        setCardDescription("Poke one enemy creature and " +
                "cause them to attack a creature of yours");
    }
}

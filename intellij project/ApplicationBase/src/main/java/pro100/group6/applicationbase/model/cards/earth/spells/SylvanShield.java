package pro100.group6.applicationbase.model.cards.earth.spells;

import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.Spell;

import java.io.File;

public class SylvanShield extends Spell {
    public SylvanShield() {
        setCardImage(new Image(new File("uiResources/cardGuy.png").toURI().toString()));
        setCardClass(CardClass.Earth);
        setFeyreReq(2);
        setDamage(0);
        setHealAmount(0);
        setCardName("SylvanShield");
        setCardDescription("Heals friendly creature by 5 hp");
    }
}

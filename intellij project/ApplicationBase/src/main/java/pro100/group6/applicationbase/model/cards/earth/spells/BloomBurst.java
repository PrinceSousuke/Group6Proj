package pro100.group6.applicationbase.model.cards.earth.spells;

import javafx.scene.image.Image;
import pro100.group6.applicationbase.model.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.AttackSpell;
import pro100.group6.applicationbase.model.abstractmodel.Card;

import java.io.File;

public class BloomBurst extends AttackSpell {
    public BloomBurst() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(3);
        setDamage(8);
        setCardName("Bloom Burst");
        setCardDescription("Deal 8 damage to a unit");
    }
}
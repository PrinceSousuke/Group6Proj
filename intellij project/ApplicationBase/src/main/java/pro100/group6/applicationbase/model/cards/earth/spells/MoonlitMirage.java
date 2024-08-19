package pro100.group6.applicationbase.model.cards.earth.spells;

import pro100.group6.applicationbase.model.enums.CardClass;
import pro100.group6.applicationbase.model.abstractmodel.AbilitySpell;

public class MoonlitMirage extends AbilitySpell {
    public MoonlitMirage() {
        setCardImage("uiResources/cardGuy.png");
        setCardClass(CardClass.Earth);
        setFeyreReq(2);
        setCardName("Moonlit Mirage");
        setCardDescription("If played before trap or creature card, stay hidden until triggered");
    }

    @Override
    public void ability() {

    }

}

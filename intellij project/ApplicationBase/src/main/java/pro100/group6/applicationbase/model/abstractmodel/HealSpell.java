package pro100.group6.applicationbase.model.abstractmodel;

public abstract class HealSpell extends Card {
    protected int healAmount;

    public HealSpell() {

    }

    public void healUnit(Character unit) {
        unit.setHealth(unit.getHealth() + healAmount);
    }
    public void healUnit(Troop unit) {
        unit.setHealth(unit.getHealth() + healAmount);
    }

    public int getHealAmount() {
        return healAmount;
    }

    protected void setHealAmount(int healAmount) {
        this.healAmount = healAmount;
    }
}

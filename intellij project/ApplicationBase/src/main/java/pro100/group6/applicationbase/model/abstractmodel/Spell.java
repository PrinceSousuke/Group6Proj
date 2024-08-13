package pro100.group6.applicationbase.model.abstractmodel;
import pro100.group6.applicationbase.model.Card;
import pro100.group6.applicationbase.model.Character;

public abstract class Spell extends Card {
    protected int damage;
    protected int healAmount;

    public Spell() {
        super();
        damage = 0;
        healAmount = 0;
    }

    public void attackUnit(Character unit) {
        unit.setHealth(unit.getHealth() - damage);
    }
    public void attackUnit(Troop unit) {
        unit.setHealth(unit.getHealth() - damage);
    }
    public void healUnit(Character unit) {
        unit.setHealth(unit.getHealth() + healAmount);
    }
    public void healUnit(Troop unit) {
        unit.setHealth(unit.getHealth() + healAmount);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealAmount() {
        return healAmount;
    }

    public void setHealAmount(int healAmount) {
        this.healAmount = healAmount;
    }
}

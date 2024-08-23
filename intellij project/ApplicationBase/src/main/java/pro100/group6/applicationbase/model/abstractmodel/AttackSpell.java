package pro100.group6.applicationbase.model.abstractmodel;

public abstract class AttackSpell extends Card{
    protected int damage;

    public AttackSpell() {

    }

    public void attackUnit(Character unit) {
        unit.setHealth(unit.getHealth() - damage);
    }
    public void attackUnit(Troop unit) {
        unit.setHealth(unit.getHealth() - damage);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

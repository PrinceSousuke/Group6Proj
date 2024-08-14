package pro100.group6.applicationbase.model.abstractmodel;

public abstract class Troop extends Card {
    protected int damage;
    protected int health;
    protected boolean dead;

    public Troop() {
        super();
        dead = false;
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        if (health <= 0) {
            dead = true;
        }
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }
}

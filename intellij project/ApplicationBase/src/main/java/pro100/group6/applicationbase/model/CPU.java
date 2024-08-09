package pro100.group6.applicationbase.model;

public class CPU extends Character {
    protected int skillLevel;

    public CPU(String name, int feyre, int health) {
        super(name, feyre, health);
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        if (skillLevel < 0) {
            this.skillLevel = skillLevel;
        } else {
            setSkillLevel(1);
        }
    }
}

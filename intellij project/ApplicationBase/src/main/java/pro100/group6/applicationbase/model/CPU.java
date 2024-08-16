package pro100.group6.applicationbase.model;


public class CPU extends Player {
    protected int skillLevel;

    public CPU(String name, int health) {
        super(name, health);
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

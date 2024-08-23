package pro100.group6.applicationbase.model.character;


import pro100.group6.applicationbase.model.enums.SkillLevel;

public class CPU extends Player {
    protected SkillLevel skillLevel;

    public CPU(String name, SkillLevel skill) {
        super(name);
        setSkillLevel(skill);
    }

    public SkillLevel getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(SkillLevel skillLevel) {
        this.skillLevel = skillLevel;
    }
}

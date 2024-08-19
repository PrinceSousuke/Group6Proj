package pro100.group6.applicationbase.model.enums;

public enum SkillLevel {
    NOVICE("Novice"),
    MODERATE("Moderate"),
    SEASONED("Seasoned");
    private String skillLevel;
    public String getClassName() {
        return skillLevel;
    }
    private SkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }
}

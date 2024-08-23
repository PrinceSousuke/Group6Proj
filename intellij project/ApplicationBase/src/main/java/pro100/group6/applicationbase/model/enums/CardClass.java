package pro100.group6.applicationbase.model.enums;

public enum CardClass {
    FIRE("Fire"),
    AIR("Air"),
    WATER("Water"),
    Earth("Earth");
    private String className;
    public String getClassName() {
        return className;
    }
    private CardClass(String className) {
        this.className = className;
    }
}

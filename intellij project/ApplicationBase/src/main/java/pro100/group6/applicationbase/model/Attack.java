package pro100.group6.applicationbase.model;

public interface Attack {
     int damage = 0;
     public void attackUnit(Character unit);
     public void attackUnit(Card unit);
}

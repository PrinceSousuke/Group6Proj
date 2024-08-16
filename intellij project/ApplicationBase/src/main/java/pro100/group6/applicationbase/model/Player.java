package pro100.group6.applicationbase.model;

import pro100.group6.applicationbase.model.abstractmodel.Character;

public class Player extends Character {
    protected int playerlevel;

    public Player(String name, int health) {
        super(name,health);
        setPlayerlevel(1);
    }

    public int getPlayerlevel() {
        return playerlevel;
    }

    public void setPlayerlevel(int playerlevel) {
        if (playerlevel > 0) {
            this.playerlevel = playerlevel;
        } else {
            setPlayerlevel(1);
        }
    }
}

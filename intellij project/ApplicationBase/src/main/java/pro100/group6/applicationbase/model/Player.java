package pro100.group6.applicationbase.model;

public class Player extends Character {
    protected int playerlevel;

    public Player(String name, int feyre, int health) {
        super(name, feyre, health);
        setPlayerlevel(1);
    }

    public int getPlayerlevel() {
        return playerlevel;
    }

    public void setPlayerlevel(int playerlevel) {
        if (playerlevel < 0) {
            this.playerlevel = playerlevel;
        } else {
            setPlayerlevel(1);
        }
    }
}

package io.muic.ooc;

public abstract class Unit {
    private int health;

    private String name;
    private String action;
    private int giveExp;

    public abstract int attack();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
